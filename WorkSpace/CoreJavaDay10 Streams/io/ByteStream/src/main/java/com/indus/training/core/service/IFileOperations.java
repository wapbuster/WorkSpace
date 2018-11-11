package com.indus.training.core.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.indus.training.core.service.exception.IndusFileException;

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
	public void fileWrite(String userInput, String outFileName) throws IndusFileException;
/**
 * @throws FileNotFoundException 
 * @throws IOException 
 * 
 */
	public String fileRead(String fileName) throws IndusFileException;
}
