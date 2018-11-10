package com.indus.training.ui;

import java.io.Console;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.Area;

public class TestCalcIO {

	public static void main(String[] args) {
		Console myConsole = System.console();

		Area areaObj = new Area();

		if (myConsole == null) {
			System.err.println("No console.");
			System.exit(0);
		}

		myConsole.writer().println("Calculator 1 : ");
		myConsole.writer().println("Enter 1 for Addition : ");
		myConsole.writer().println("Enter 2 for Subtraction  : ");
		myConsole.writer().println("Enter 3 for Mutiplication  : ");
		myConsole.writer().println("Enter 4 for Division  : ");
		myConsole.writer().println("Enter 5 for Area of Square  : ");
		myConsole.writer().println("Enter 6 for Area of Rectangle  : ");
		myConsole.writer().println("Enter 7 for Area of Circle  : ");
		myConsole.writer().println("Enter Q to  quit this program  : ");

		while (true) {
			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered : " + userSelection);

			if (userSelection.equals("1")) {
				myConsole.writer().println("User Selected Addition");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

				CalcOutput actCalOutObj = areaObj.addition(calInObj);

				myConsole.writer()
						.println(" Sum = " + actCalOutObj);

			} else if (userSelection.equals("2")) {
				myConsole.writer().println("User Selected Subtraction");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

				CalcOutput actCalOutObj = areaObj.subtract(calInObj);

				myConsole.writer()
						.println(" Difference = " + actCalOutObj);

			}

			else if (userSelection.equals("3")) {
				myConsole.writer().println("User Selected Multiplication");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

				CalcOutput actCalOutObj = areaObj.multiply(calInObj);

				myConsole.writer().println(
						" Product = " + actCalOutObj);

			}

			else if (userSelection.equals("4")) {
				myConsole.writer().println("User Selected Division");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");
				String param2 = myConsole.readLine("Please Enter paramereter 2 :");

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

				CalcOutput actCalOutObj = areaObj.division(calInObj);

				myConsole.writer()
						.println(" Quotient = " + actCalOutObj);

			} else if (userSelection.equals("5")) {
				myConsole.writer().println("User Selected Area of Square");

				String param1 = myConsole.readLine("Please enter lenghth of side :");
				String param2 = param1;

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

				CalcOutput actCalOutObj = areaObj.square(calInObj);

				myConsole.writer().println(" Area Of Square is " + actCalOutObj);

			} else if (userSelection.equals("6")) {
				myConsole.writer().println("User Selected Area of Rectangle");

				String param1 = myConsole.readLine("Please enter the length :");
				String param2 = myConsole.readLine("Please enter the breadth :");

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

				CalcOutput actCalOutObj = areaObj.rectangle(calInObj);

				myConsole.writer().println(" Area Of rectangle is " + actCalOutObj);

			} else if (userSelection.equals("7")) {
				myConsole.writer().println("User Selected Area of Circle");

				String param1 = myConsole.readLine("Please enter radius :");
				String param2 = param1;

				double param1Dbl = Double.parseDouble(param1);
				double param2Dbl = Double.parseDouble(param2);

				CalcInput calInObj = new CalcInput(param1Dbl);

				CalcOutput actCalOutObj = areaObj.circle(calInObj);

				myConsole.writer().println(" Area Of Circle is " + actCalOutObj);

			}

			else {
				myConsole.writer().println("User Selected wrong option !!");
			}
			myConsole.writer().println();
			myConsole.writer().println("Calculator 2 : ");
			myConsole.writer().println("Enter 1 for Addition : ");
			myConsole.writer().println("Enter 2 for Suntraction  : ");
			myConsole.writer().println("Enter 3 for Mutiplication  : ");
			myConsole.writer().println("Enter 4 for Division  : ");
			myConsole.writer().println("Enter 5 for Area of Square  : ");
			myConsole.writer().println("Enter 6 for Area of Rectangle  : ");
			myConsole.writer().println("Enter 7 for Area of Circle  : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			if (userSelection.equals("Q")) {
				System.exit(0);
			}
		}

	}
}
