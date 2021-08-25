package project;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fname =new String();
		FileOperation f=new FileOperation();
		System.out.println("******* Welcome ********");
		while(true)
		{
		System.out.println("1: Retriving the file name in assending order  ");
		System.out.println("2 : Business level operation  ");
		System.out.println("3 : close Application ");
		System.out.println("Press the key :");
		byte choice =sc.nextByte();
		switch( choice)
		{
			case 1:
				System.out.println("Ritrive file option 1");
				f.retrive();
				
			break;
			case 2:
				boolean whiletwo=true;
				while(whiletwo)
				{
					
					System.out.println("1: ADD File");
					System.out.println("2 : Delete file ");
					System.out.println("3 : Search File ");
					System.out.println("4 : Navigation Option (Return to main Option) ");
					System.out.println("Press the key :");
					byte ch=sc.nextByte();
				
					switch( ch)
					{
						case 1:
							f.CreateFile();
							break;
						case 2:
							f.DeleteFile();
							break;
						case 3 :
						    f.search();
							break;
						case 4:
							whiletwo=false;
							break;
						
						default:
							System.out.println("Choose Correct Option");
							break;
						
					}	
				}
				break;
			case 3:
				
				System.out.println("Application close");
				System.exit(0);
				break;
			default:
				System.out.println("Choose Correct Option ");
				break;
				
		}
		}
	}

	

}
