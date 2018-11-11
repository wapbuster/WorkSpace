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
				content = content + (char)c;
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
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(filePath + fileName + ".txt");
			byte[] byteConv = userInput.getBytes();

			for (int i = 0; i < byteConv.length; i++) {
				out.write(byteConv[i]);
			}

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
