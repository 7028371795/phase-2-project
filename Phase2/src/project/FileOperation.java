package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperation {
	Scanner sc=new Scanner(System.in);

	public void CreateFile()
	{
		
		
		System.out.println("Enter the file name ");
		String fname=sc.nextLine();	
		
		 try {
			 	File myObj=new File("C:\\Users\\CORE COMP\\Desktop\\java\\"+fname+".txt");
					if(myObj.createNewFile())
					{
						System.out.println("File created"+myObj.getName());
					}
					else
					{
						System.out.println("File already exit");
					}
					
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void DeleteFile() {
		System.out.println("Enter the file name ");
		String fname=sc.nextLine();
		try  
		{         
		File f= new File("C:\\Users\\CORE COMP\\Desktop\\java\\"+fname+".txt");           //file to be delete  
		if(f.delete())                      //returns Boolean value  
		{  
		System.out.println(f.getName() + " deleted");   //getting and printing the file name  
		}  
		else  
		{  
		System.out.println("failed");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		
	}

	public void search() {
		System.out.println("enter file name to search");
		String name=sc.next();
		File directory=new File("C:\\\\Users\\\\CORE COMP\\\\Desktop\\\\java\\\\");

		String[] flist=directory.list();
		int flag=0;

		if(flist==null)
		{
			System.out.println("Empty directory.");
		}else
		{
			for(int i=0;i<flist.length;i++)
			{
				String filename=flist[i];

				if(filename.equalsIgnoreCase(name+".txt"))
				{
					System.out.println(filename+ " Found");
					flag=1;
				}
			}
		}

		if(flag ==0)
		{
			System.out.println("File not found");
		}



	   }

	public void retrive() {
		// TODO Auto-generated method stub
		try {

			File dir=new File("C:\\\\Users\\\\CORE COMP\\\\Desktop\\\\java\\\\");

			File[] files=dir.listFiles();

			Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

			for( File file:files)
			{
				if(!file.isHidden())
				{
					if(!file.isDirectory())
					{
						System.out.println("FILE\t" + file.getName());
					}

				}
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}




	}
}


