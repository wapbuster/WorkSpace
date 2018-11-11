package com.indus.training.core.ui;

import java.io.Console;

import com.indus.training.core.exception.IndusException;
import com.indus.training.core.impl.FileOperationsWithReaderWriter;
import com.indus.training.core.service.IFileOp;

public class TestFileOp {
	public static void main(String[] args) throws IndusException {

		Console myConsole = System.console();
		IFileOp fileObj = new FileOperationsWithReaderWriter();

		if (myConsole == null) {
			System.exit(0);
		}

		while (true) {
			myConsole.writer().println("Enter 1 to write to a file : ");
			myConsole.writer().println("Enter 2 to read a file : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			String userSelection = myConsole.readLine();

			if (userSelection.equals("1")) {
				String userInput = myConsole.readLine("Enter Message :");
				String fileName = myConsole.readLine("Enter file name to be saved as :");
				fileObj.fileWrite(userInput, fileName);
			} else if (userSelection.equals("2")) {
				String fileName = myConsole.readLine("Enter the file name to read :");
				System.out.println(fileObj.fileRead(fileName));
			} else if (userSelection.equals("Q")) {
				System.exit(0);
			} else {
				myConsole.writer().println("User selected wrong option");
			}
		}

	}
}
