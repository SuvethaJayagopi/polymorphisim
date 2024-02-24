//Io stream chaining

package com.IO_Stream;

import java.io.*;

public class BufferedStream {
	public static void main(String args[]) {
		try {
			BufferedReader bi=new BufferedReader(new FileReader (args[0]));
			BufferedWriter bo=new BufferedWriter(new FileWriter (args[1]));
			//even it is in arguments you need to give command line arguments as input.txt and output.txt
			
			
			
			/*reading the input using the text file
			BufferedReader bi=new BufferedReader(new FileReader ("input.txt"));
			BufferedWriter bo=new BufferedWriter(new FileWriter ("output.txt"));
			*/
			String line="";
			while((line=bi.readLine())!=null){
				bo.write(line);
				bo.newLine();	
		}
		bi.close();
		bo.close();
	}
		catch(FileNotFoundException e) {
			System.out.println("Input file missing!!!");
		}
		catch(IOException e) {
			System.out.println("Input/Output Exception!!!");
		}

  }
}
