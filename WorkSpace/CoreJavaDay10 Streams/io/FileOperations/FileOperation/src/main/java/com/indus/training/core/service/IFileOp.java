package com.indus.training.core.service;

import com.indus.training.core.exception.IndusException;

public interface IFileOp {

	public String fileRead(String fileName) throws IndusException;

	public void fileWrite(String userInput, String fileOut) throws IndusException;

}
