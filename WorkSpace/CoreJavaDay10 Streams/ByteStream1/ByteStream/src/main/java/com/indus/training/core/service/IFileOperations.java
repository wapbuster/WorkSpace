package com.indus.training.core.service;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author sunnyhith
 *
 */
public interface IFileOperations {
/**
 * @throws IOException 
 * 
 */
	public void fileWrite(String userInput, String outFileName) throws IOException;
/**
 * @throws FileNotFoundException 
 * @throws IOException 
 * 
 */
	public void fileRead(String fileName) throws FileNotFoundException, IOException;
}
