package com.indus.training.ui;

import java.io.Console;

public class TestIO {

	public static void main(String[] args) {
		Console myConsole = System.console();

		if (myConsole == null) {
			System.exit(0);
		}

		myConsole.writer().println("Caliculator1 : ");
		myConsole.writer().println("Enter 1 for Addition : ");
		myConsole.writer().println("Enter 2 for Suntraction  : ");
		myConsole.writer().println("Enter 3 for Mutiplication  : ");
		myConsole.writer().println("Enter 4 for Division  : ");
		myConsole.writer().println("Enter Q to  quit this program  : ");

		while (true) {
			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered following Info : " + userSelection);

			if (userSelection.equals("1")) {
				myConsole.writer().println("User Selected Addition");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				double param1Dbl = Double.parseDouble(param1);

				double param2Dbl = Double.parseDouble(param2);
				double result = param1Dbl + param2Dbl;

				myConsole.writer().println(" Addition of Param1 : " + param1 + " Param2 : " + param2 + " = " + result);
			}
			else {
				myConsole.writer().println("User Selected wrong option !!");
			}

			myConsole.writer().println("Caliculator2 : ");
			myConsole.writer().println("Enter 1 for Addition : ");
			myConsole.writer().println("Enter 2 for Suntraction  : ");
			myConsole.writer().println("Enter 3 for Mutiplication  : ");
			myConsole.writer().println("Enter 4 for Division  : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			if (userSelection.equals("Q")) {
				System.exit(0);
			}
		}

//		System.exit(0);
	}

}
