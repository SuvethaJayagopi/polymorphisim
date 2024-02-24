//console to file ---read

package com.IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Demo1 {
	//public static void main(String args[] throws FileNotFoundException,IOException)
	//Jvm error handle--- it would stop the whole program without sending any msg so that we are moving towards the try and catch method
	public static void main(String args[]) {
	//char[] byteData=new char[128];
	//resource based so try fos method create
	try(FileOutputStream fos =new FileOutputStream("output.txt");) 
	//try (....) to avoid fis.close() statement
	{
		String s="Hello All";
		byte a[]=s.getBytes();
		fos.write(a);
	}
	catch(FileNotFoundException e) {
		System.out.println("Input file missing!!!");
	}
	catch(IOException e) {
		System.out.println("Input/Output Exception!!!");
	}
     
 }
}
