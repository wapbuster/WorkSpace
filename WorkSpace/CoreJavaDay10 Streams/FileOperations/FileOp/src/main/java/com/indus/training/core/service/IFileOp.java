package com.indus.training.core.service;
/**
 * 
 */
import com.indus.training.core.exception.IndusException;
/**
 * 
 * @author sunnyhith
 *
 */
public interface IFileOp {
	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws IndusException
	 */
	public String fileRead(String fileName)throws IndusException;
	/**
	 * 
	 * @param userInput
	 * @param fileName
	 * @throws IndusException
	 */
	public void fileWrite(String userInput, String fileName) throws IndusException;

}
