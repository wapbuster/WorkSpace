package com.indus.training.ui;

import java.io.Console;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.Area;

public class TestCalcIO2 {

	public static void main(String[] args) {
		Console myConsole = System.console();

		if (myConsole == null) {
			System.err.println("No console.");
			System.exit(0);
		}

		myConsole.writer().println("Enter 1 for Calculator");
		myConsole.writer().println("Enter 2 for Scientific Calculator");
		myConsole.writer().println("Enter 3 for Calculating Area");
		myConsole.writer().println("Enter 4 for Converting Distance");
		/*myConsole.writer().println("Enter 5 for Converting Mass");
		myConsole.writer().println("Enter 6 for Matrix Calculations");*/
		myConsole.writer().println("Enter Q to  quit this program  : ");

		while (true) {
			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered : " + userSelection);

			if (userSelection.equals("1")) {
				CalcUI.Calculator();

		
			} else if (userSelection.equals("2")) {
				SciCalcUI.SciCalculator();
			}

			else if (userSelection.equals("3")) {
				AreaUI.Area();
			}

			else if (userSelection.equals("4")) {
				DistConvUI.DistConv();
			}
			
			else {
				myConsole.writer().println("User Selected wrong option !!");
			}
			myConsole.writer().println("Enter 1 for Calculator");
			myConsole.writer().println("Enter 2 for Scientific Calculator");
			myConsole.writer().println("Enter 3 for Calculating Area");
			myConsole.writer().println("Enter 4 for Converting Distance");
			/*myConsole.writer().println("Enter 5 for Converting Mass");
			myConsole.writer().println("Enter 6 for Matrix Calculations");*/
			myConsole.writer().println("Enter Q to  quit this program  : ");

			if (userSelection.equals("Q")) {
				System.exit(0);
			}
		}

	}

}
