package com.indus.training.ui;

import java.io.Console;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.Calc;

public class CalcUI {

	public static void Calculator() {

		Console myConsole = System.console();
		// Area calObj = new Area();
		Calc calObj = new Calc();

		//myConsole.writer().println("Calculator 1 : ");
		myConsole.writer().println("Enter 1 for Addition : ");
		myConsole.writer().println("Enter 2 for Subtraction  : ");
		myConsole.writer().println("Enter 3 for Multiplication  : ");
		myConsole.writer().println("Enter 4 for Division  : ");
		myConsole.writer().println("Enter Q to  quit this program  : ");

		while (true) {
			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered : " + userSelection);

			if (userSelection.equals("1")) {
				myConsole.writer().println("User Selected Addition");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = calObj.addition(calInObj);

					myConsole.writer().println(" Sum = " + actCalOutObj);

				} catch (NumberFormatException e) {
					System.out.println("Not a valid number...!!");
				}

			} else if (userSelection.equals("2")) {
				myConsole.writer().println("User Selected Subtraction");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = calObj.subtract(calInObj);

					myConsole.writer().println(" Difference = " + actCalOutObj);

				} catch (NumberFormatException e) {
					System.out.println("Not a valid number...!!");
				}
			}

			else if (userSelection.equals("3")) {
				myConsole.writer().println("User Selected Multiplication");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = calObj.multiply(calInObj);

					myConsole.writer().println(" Product = " + actCalOutObj);

				} catch (NumberFormatException e) {
					System.out.println("Not a valid number...!! Enter valid param1 and param2");
				}
			}

			else if (userSelection.equals("4")) {
				myConsole.writer().println("User Selected Division");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = calObj.division(calInObj);

					myConsole.writer().println(" Quotient = " + actCalOutObj);

				} catch (NumberFormatException e) {
					System.out.println("Not a valid number...!!");
				}
			}

			else {
				myConsole.writer().println("User Selected wrong option !!");
			}
			myConsole.writer().println();
			//myConsole.writer().println("Calculator 2 : ");
			myConsole.writer().println("Enter 1 for Addition : ");
			myConsole.writer().println("Enter 2 for Subtraction  : ");
			myConsole.writer().println("Enter 3 for Multiplication  : ");
			myConsole.writer().println("Enter 4 for Division  : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			if (userSelection.equals("Q")) {
				System.exit(0);
			}
		}
	}
}
