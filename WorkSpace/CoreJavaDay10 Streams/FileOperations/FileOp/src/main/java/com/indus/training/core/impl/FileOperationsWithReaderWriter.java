package com.indus.training.core.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.indus.training.core.exception.IndusException;
import com.indus.training.core.service.IFileOp;

public class FileOperationsWithReaderWriter implements IFileOp { 

	private String filePath;

	public FileOperationsWithReaderWriter(String filePath) {
		super();
		this.filePath = filePath;
	}

	public FileOperationsWithReaderWriter() {
		super();
		filePath = "C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\";
	}

	public String fileRead(String fileName) throws IndusException {
		BufferedReader in = null;

		String content = new String();

		try {
			in = new BufferedReader(new FileReader(filePath + fileName + ".txt"));
			String lineContent = in.readLine();
			while (true) {
				if (lineContent != null) {
					content = content + lineContent;
				} else {
					break;
				}
				lineContent = in.readLine();
			}

		} catch (FileNotFoundException fileEx) {
			throw new IndusException("File not found", fileEx);

		} catch (IOException ioEx) {
			throw new IndusException("IO Exception", ioEx);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ioEx) {
					throw new IndusException("IO Exception", ioEx);
				}
			}
		}
		return content;

	}

	public void fileWrite(String userInput, String fileName) throws IndusException {
		BufferedWriter out = null;

		try {
			out = new BufferedWriter(new FileWriter(filePath + fileName + ".txt", true));

			out.write(userInput+ System.getProperty("line.separator"));
//			out.newLine();

		} catch (FileNotFoundException fileEx) {
			throw new IndusException("File not found", fileEx);
		} catch (IOException ioEx) {
			throw new IndusException("File not found", ioEx);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException ioEx) {
					throw new IndusException("File not found", ioEx);
				}
			}

		}

	}
}
