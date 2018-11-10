package com.indus.training.core.service.impl;

import com.indus.training.core.service.IFileOperations;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations implements IFileOperations {

	public void fileRead(String fileName) throws FileNotFoundException,IOException {
		FileInputStream in = null;

		try {
			in = new FileInputStream(
					"C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\" + fileName + ".txt");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found..!");
		} 
		finally {
			if (in != null) {
				in.close();
			}
		}

	}

	public void fileWrite(String userInput, String outFileName) throws FileNotFoundException, IOException {
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(
					"C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\" + outFileName + ".txt");
			int c;

			byte[] bytes = userInput.getBytes();
			ByteArrayInputStream ip = new ByteArrayInputStream(bytes);
			/*
			 * char[] stringToCharArray = userInput.toCharArray(); CharArrayReader reader =
			 * new CharArrayReader(stringToCharArray);
			 */

			while ((c = ip.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (out != null) {
				out.close();
			}
		}

	}

}
