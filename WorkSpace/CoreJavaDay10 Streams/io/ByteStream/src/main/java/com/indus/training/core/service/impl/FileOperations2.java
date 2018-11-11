package com.indus.training.core.service.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileNotFoundException;

import com.indus.training.core.service.IFileOperations2;

public class FileOperations2 implements IFileOperations2 {

	public void fileWrite(String userInput, String outFileName) throws IOException {
		FileWriter out = null;

		try {
			out = new FileWriter(
					"C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\" + outFileName + ".txt");
			int c;

			/*
			 * byte[] bytes = userInput.getBytes(); ByteArrayInputStream ip = new
			 * ByteArrayInputStream(bytes);
			 */

			char[] stringToCharArray = userInput.toCharArray();
			CharArrayReader reader = new CharArrayReader(stringToCharArray);

			while ((c = reader.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	public void fileRead(String fileName) throws FileNotFoundException, IOException {
		FileReader in = null;
		try {
			in = new FileReader(
					"C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\" + fileName + ".txt");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found..!");
		} finally {
			if (in != null) {
				in.close();
			}
		}

	}

}
