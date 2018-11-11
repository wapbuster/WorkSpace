package com.indus.training.core.ui;

import java.io.Console;
import java.io.IOException;

import com.indus.training.core.service.impl.FileOperations2;

public class TestFileOpUI {

	public static void main(String[] args) throws IOException {

		Console myConsole = System.console();
		FileOperations2 fObj2 = new FileOperations2();

		if (myConsole == null) {
			System.err.println("No console.");
			System.exit(0);
		}

		while (true) {

			myConsole.writer().println("Enter 1 In ByteStream  : ");
			myConsole.writer().println("Enter 2 In CharStream  : ");
			myConsole.writer().println("Enter 3 In BufferStream  : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");
			String menu = myConsole.readLine();

			if (menu.equals("1")) {



			}
			if (menu.equals("2")) {

				while (true) {

					myConsole.writer().println("Enter 1 to write in a file  : ");
					myConsole.writer().println("Enter 2 to read a file  : ");
					myConsole.writer().println("Enter Q to  quit this program (cs) : ");
					String userSelection = myConsole.readLine();

					if (userSelection.equals("1")) {
						String userInput = myConsole.readLine("Enter the message to be written  : ");
						String outFileName = myConsole.readLine("Enter the name of file to be saved : ");
						fObj2.fileWrite(userInput, outFileName);
					}

					else if (userSelection.equals("2")) {
						String fileName = myConsole.readLine("Enter the file name to be read  : ");
						fObj2.fileRead(fileName);
						myConsole.writer().println();
					}

					else if (userSelection.equals("Q")) {
						System.exit(0);
					}

					else {
						myConsole.writer().println("User Selected wrong option !!");
//						System.out.println();
					}

				}

			} else if (menu.equals("Q")) {
				System.exit(0);
			}

			else {
				myConsole.writer().println("User Selected wrong option !!");

			}
		}
	}
}
