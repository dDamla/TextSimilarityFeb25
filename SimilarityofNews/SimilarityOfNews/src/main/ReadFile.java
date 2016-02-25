package main;

import java.io.*;
import java.util.*;

public class ReadFile {
	
	public void ReadLine(ArrayList<String> arr, String filepath)
	{//Dosya yollar�n� okusun diye
		String text = "";
		
		
		File f = new File (filepath);
		try
		{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(f);
			while(s.hasNextLine())
			{				
				text = s.nextLine();
				arr.add(text);
				
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found!");
		}
		
		
	}
	
		
	public String Read (String filePath)
	{
		String text = "";
		String newline ="";
		File f = new File (filePath);
		try
		{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(f);
			while(s.hasNextLine())
			{
				newline = s.nextLine() + " ";
				text += newline;
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found!");
		}
		return text;
	}
	
	

}
