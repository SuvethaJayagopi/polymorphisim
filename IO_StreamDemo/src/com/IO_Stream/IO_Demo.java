//file to console ---read
//Input
package com.IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class IO_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("input.txt");
			int data=fis.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=fis.read();
			}
			fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Input file missing!!!");
		}
		catch(IOException e) {
			System.out.println("Input/Output Exception!!!");
		}
        
	}

}
