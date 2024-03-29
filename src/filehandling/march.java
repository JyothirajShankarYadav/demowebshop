package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class march 
{
	static void createFolder(String path)
	{
		File folder=new File(path);
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder created "+folder.getName());
		}
		else
		{
			System.out.println(folder.getName()+" folder already created");
		}
	}
	static void rename(String oldpath, String newpath)
	{
		File oldfolder=new File(oldpath);
		File newfolder=new File(newpath);
		if(oldfolder.exists())
		{
			oldfolder.renameTo(newfolder);
			System.out.println(oldfolder.getName()+" is rename to "+newfolder.getName());
		}
		else
		{
			System.out.println(oldfolder.getName()+" doesnot exist");
		}
	}
	static void delete(String newpath)
	{
		File newfolder=new File(newpath);
		if(newfolder.exists())
		{
			newfolder.delete();
			System.out.println(newfolder.getName()+" folder is deleted");
		}
		else
		{
			System.out.println("Folder doesnot exists");
		}
	}
	static void files(String filepath)
	{
		File newfile=new File(filepath);
		try
		{
			if(newfile.createNewFile())
			{
			 System.out.println("File "+newfile.getName()+" created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void enter(String path) throws IOException
	{
		FileWriter f=new FileWriter(path);
		f.write("Welcome to India");
		f.flush();
		System.out.println("data has been entered");
	}
	public static void main(String[] args) throws IOException 
	{
		/*
		String path="E:\\JavaFiles";
		String newone="E:\\JavaFiles1";
		createFolder(path);*/
		String file="E:\\JavaFiles\\firstfile.txt";
//files(file);
		enter(file);
	}

}
