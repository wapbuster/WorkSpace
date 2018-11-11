package com.indus.training.core.ui;

import java.io.Console;

import com.indus.training.core.exception.IndusException;
import com.indus.training.core.impl.FileOp;

public class TestFileOp {

	public static void main(String[] args) throws IndusException {

		Console myConsole = System.console();
		FileOp fObj = new FileOp();

		if (myConsole == null) {
			System.err.println("No console.");
			System.exit(0);
		}
		while (true) {

			myConsole.writer().println("Enter 1 to write : ");
			myConsole.writer().println("Enter 2 to read  : ");
			myConsole.writer().println("Enter Q to quit : ");
			String userSelection = myConsole.readLine();

			if (userSelection.equals("1")) {
				String userInput = myConsole.readLine("Enter the message : ");
				String fileOut = myConsole.readLine("Enter the name of file to be saved : ");
				fObj.fileWrite(userInput, fileOut);
			} else if (userSelection.equals("2")) {
				String fileName = myConsole.readLine("Enter the file name to read  : ");
				fObj.fileRead(fileName);
				myConsole.writer().println();
			} else if (userSelection.equals("Q")) {
				System.exit(0);
			} else {
				myConsole.writer().println("Wrong option");
			}
		}
	}
}