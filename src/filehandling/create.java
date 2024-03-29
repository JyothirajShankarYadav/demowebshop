package filehandling;

import java.io.File;

public class create 
{
	public static void create(String path)
	{
		File folder=new File(path);
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder created");
		}
	}
	public static void main(String[] args) 
	{
		String path="E:\\newfile";
		create(path);

	}

}
