//file to file reading

package com.IO_Stream;


import java.io.*;
public class ByteIOStream {

	public static void main(String[] args )throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		byte b[]=new byte[20];
		try(FileInputStream fis=new FileInputStream("input.txt");
				FileOutputStream fos =new FileOutputStream("output.txt");) {
			System.out.println("Byte available: "+fis.available());
			int count=0;int read=0;
			while((read=fis.read(b))!=-1) {
				fos.write(b);
				count+=read;
			}
			System.out.println("Total Count: "+count);
			fis.close();
			fos.close();
		}

	}

}
