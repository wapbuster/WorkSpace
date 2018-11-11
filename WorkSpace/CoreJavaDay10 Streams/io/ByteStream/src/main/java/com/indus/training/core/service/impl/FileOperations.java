package com.indus.training.core.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.indus.training.core.service.IFileOperations;
import com.indus.training.core.service.exception.IndusFileException;

public class FileOperations implements IFileOperations {

	private String filePath;

	public FileOperations() {
		super();
		filePath = "C:\\IndusTraining\\WorkSpace\\CoreJavaDay10 Streams\\FileTesting\\";
	}

	public FileOperations(String filePath) {
		super();
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String fileRead(String fileName) throws IndusFileException {
		FileInputStream in = null;
//		StringBuffer strBuff = new StringBuffer();
		String strOut = new String();

		try {

			in = new FileInputStream(filePath + fileName + ".txt");
			int c;

			while ((c = in.read()) != -1) {
//				strBuff.append(c);
				strOut = strOut + (char) c;
			}
		} catch (FileNotFoundException fiNFEx) {
			IndusFileException indFiEx = new IndusFileException("File not found..!", fiNFEx);
			throw indFiEx;
		} catch (IOException ioEx) {
			throw new IndusFileException("Exception process Reading from File : got an Exception ", ioEx);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ioEx) {
				IndusFileException indFiEx = new IndusFileException("Exception closing a file : got an Exception ",
						ioEx);
				throw indFiEx;
			}
		}
		// return strBuff.toString();
		return strOut;

	}

	public void fileWrite(String userInput, String outFileName) throws IndusFileException {
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(filePath + outFileName + ".txt");
			for (int i = 0; i < userInput.getBytes().length; i++) {
				out.write(userInput.getBytes()[i]);
			}
		} catch (FileNotFoundException fiNFEx) {
			IndusFileException indFiEx = new IndusFileException("File not found..!", fiNFEx);
			throw indFiEx;
		} catch (IOException ioEx) {
			throw new IndusFileException("Exception process Reading from File : got an Exception ", ioEx);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException ioEx) {
				IndusFileException indFiEx = new IndusFileException("Exception closing a file : got an Exception ",
						ioEx);
				throw indFiEx;
			}
		}

	}

	/*
	 * public void fileWrite(String userInput, String outFileName) throws
	 * FileNotFoundException, IOException { FileOutputStream out = null;
	 * 
	 * try { out = new FileOutputStream( filePath + outFileName + ".txt"); int c;
	 * 
	 * byte[] bytes = userInput.getBytes(); ByteArrayInputStream ip = new
	 * ByteArrayInputStream(bytes);
	 * 
	 * char[] stringToCharArray = userInput.toCharArray(); CharArrayReader reader =
	 * new CharArrayReader(stringToCharArray);
	 * 
	 * 
	 * while ((c = ip.read()) != -1) { out.write(c); } } finally { if (out != null)
	 * { out.close(); } }
	 * 
	 * }
	 */

	/*
	 * public void fileRead(String fileName) throws FileNotFoundException,
	 * IOException { FileInputStream in = null; String strOut = new String();
	 * 
	 * try {
	 * 
	 * in = new FileInputStream( filePath + fileName + ".txt"); int c;
	 * 
	 * while ((c = in.read()) != -1) { System.out.println((char) c); } } catch
	 * (FileNotFoundException e) { System.out.println("File not found..!"); }
	 * finally { if (in != null) { in.close(); } }
	 * 
	 * }
	 */
}
