package com.app;

import java.io.*;
import java.util.*;
public class FirstActivity{
	public static void main(String args[])throws IOException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your text");
		String text=scan.nextLine();
		OutputStream ous= new FileOutputStream("sink.txt");
		for(int i=0;i<text.length();i++)
		{
			char ch=text.charAt(i);
			int ascii=(int)ch;
			ous.write(ascii);
		}
		ous.close();
		System.out.println("Data is written to sink");
	}
}