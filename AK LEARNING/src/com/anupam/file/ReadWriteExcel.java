package com.anupam.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringBufferInputStream;

public class ReadWriteExcel {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		ReadWriteExcel rwe = new ReadWriteExcel();
		
		// Creating a file
		rwe.createFile();

		// Writing into file using PrintWriter (we also have FileWrite,
		// BufferWriter)
		rwe.writeUsingPrintWriter();

		// Write into file using FileOutputStream, PrintStream
		rwe.writeUsingStream();
		
		// Read using FileInputStream.
		rwe.readUsingStream();

	}
	
	public void createFile(){
		// Creating a file
		File excel1 = new File("F:\\Eclipse\\FileDatabase\\abc1.csv");
		System.out.println(excel1.exists()); // checks if file already exists?
		try {
			System.out.println(excel1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // creates file if not
													// exists, and return if
													// able to create new file?
		System.out.println(excel1.exists() + " *");
	}
	
	public void writeUsingPrintWriter(){
		File excel2 = new File("F:\\Eclipse\\FileDatabase\\abc2.csv");
		System.out.println(excel2.exists());
		try {
			PrintWriter pw = new PrintWriter(excel2);
			System.out.println(excel2.exists());
			pw.println("Name,Age,Sex");
			System.out.println(excel2.exists());
			pw.println("Anupam,25,Male");
			pw.flush();
			pw.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
	
	public void writeUsingStream(){
		try {
			FileOutputStream excel3 = new FileOutputStream(
					"F:\\Eclipse\\FileDatabase\\abc3.csv", true);
			PrintStream ps = new PrintStream(excel3);
			ps.println("Name,Age,Sex");
			ps.println("Priety,23,Female");
			ps.flush();
			ps.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void readUsingStream(){
		File file = new File("F:\\Eclipse\\FileDatabase\\abc3.csv");
		StringBuffer filecontents = new StringBuffer("");
		try {
			FileInputStream excel4 = new FileInputStream(file);
			int a;
			/*
			 * To read bytes from stream use, int read() method of
			 * FileInputStream class. This method reads a byte from
			 * stream. This method returns next byte of data from file or -1 if
			 * the end of the file is reached. Read method throws
			 * IOException in case of any IO errors.
			 */
			while ((a = excel4.read()) != -1) {
				filecontents.append((char) a);
			}
			excel4.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("**********\n"+filecontents);
	}

}
