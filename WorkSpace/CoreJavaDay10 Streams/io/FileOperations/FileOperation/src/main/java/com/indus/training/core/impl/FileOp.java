package com.indus.training.core.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.indus.training.core.exception.IndusException;
import com.indus.training.core.service.IFileOp;

public class FileOp implements IFileOp {

	private String filePath;

	public FileOp(String filePath) {
		super();
		this.filePath = filePath;
	}

	public FileOp() {
		super();
		filePath = "C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\";
	}

	public String fileRead(String fileName) throws IndusException {
		FileInputStream in = null;
		String content = new String();

		try {
			in = new FileInputStream(filePath + fileName + ".txt");
			int c;

			while ((c = in.read()) != -1) {
				content = content + (char) c;
			}
		} catch (FileNotFoundException fileNotFoundEx) {
			throw new IndusException("File not found..!", fileNotFoundEx);
		} catch (IOException ioEx) {
			throw new IndusException("IO Exception ", ioEx);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ioEx) {
				throw new IndusException("IO Exception ", ioEx);
			}
		}
		return content;

	}

	public void fileWrite(String userInput, String fileOut) throws IndusException {
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(filePath + fileOut + ".txt");

			byte[] bytes = userInput.getBytes();

			System.out.println(bytes);

			int c = 0;

			for (c = 0; c < bytes.length; c++) {
				out.write(bytes);
			}

		} catch (FileNotFoundException fileNotFoundEx) {
			throw new IndusException("File not found", fileNotFoundEx);
		} catch (IOException ioEx) {
			throw new IndusException("IO Ex ", ioEx);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException ioEx) {
				throw new IndusException("IO Ex", ioEx);
			}
		}

	}

}
