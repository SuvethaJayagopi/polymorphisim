package com.IO_Stream;

import java.io.*;
public class UserInput {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		boolean b=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String s=br.readLine();
		System.out.println("Enter the integer: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the float: ");
		float f=Float.parseFloat(br.readLine());
		System.out.println("Enter the short: ");
		short sh=Short.parseShort(br.readLine());
		System.out.println("Enter the double: ");
		double d=Double.parseDouble(br.readLine());
		System.out.println("Enter the char: ");
		//typecast       String c=char(br.readLine());
		System.out.println("Enter the byte: ");
		byte by=Byte.parseByte(br.readLine());
		

	}

}
