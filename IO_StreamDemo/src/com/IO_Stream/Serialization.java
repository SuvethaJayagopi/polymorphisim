package com.IO_Stream;

import java.io.*;
class Employee implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 548203705823756587L;
	private String string;
	private int i;

	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.string=string;
	}
	
}
public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee object=new Employee(1,"Ram");
		String filename="file.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException e) {
			System.out.println("IO Exception is caught");
		}
		object=null;
		 try {
			 
	            // Reading the object from a file
	            FileInputStream file = new FileInputStream
	                                         (filename);
	            ObjectInputStream in = new ObjectInputStream
	                                         (file);
	 
	            // Method for deserialization of object
	            object = (Employee)in.readObject();
	 
	            in.close();
	            file.close();
	            System.out.println("Object has been deserialized\n"
	                                + "Data after Deserialization.");
	           // printdata(object);
	 
	            // System.out.println("z = " + object1.z);
	        }
	 
	        catch (IOException ex) {
	            System.out.println("IOException is caught");
	        }
	 
	        catch (ClassNotFoundException ex) {
	            System.out.println("ClassNotFoundException" +
	                                " is caught");
	        }
	    }

	}
