package com.indus.training.core.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IFileOperations2 {
	/**
	 * 
	 * @param userInput
	 * @param outFileName
	 * @throws IOException
	 */
	public void fileWrite(String userInput, String outFileName) throws IOException;

	/**
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void fileRead(String fileName) throws FileNotFoundException, IOException;
}
