package com.indus.training.ui;

import java.io.Console;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.Area;

public class AreaUI {

	public static void Area() {

		Console myConsole = System.console();
		Area areaObj = new Area();

		while (true) {
			// myConsole.writer().println("while loop start");
			myConsole.writer().println("Enter 1 for Area of Square  : ");
			myConsole.writer().println("Enter 2 for Area of Rectangle  : ");
			myConsole.writer().println("Enter 3 for Area of Circle  : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered : " + userSelection);

			if (userSelection.equals("1")) {
				myConsole.writer().println("User Selected Area of Square");

				String param1 = myConsole.readLine("Please enter lenghth of side :");
				String param2 = param1;

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					if (param1Dbl < 0) {
						System.out.println("Enter a valid positive number..!");
						continue;
					}

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = areaObj.square(calInObj);

					myConsole.writer().println(" Area Of Square is " + actCalOutObj);

				} catch (NumberFormatException e) {
					System.out.println("Enter a valid positive number..!");
				}

			} else if (userSelection.equals("2")) {
				myConsole.writer().println("User Selected Area of Rectangle");

				String param1 = myConsole.readLine("Please enter the length :");
				String param2 = myConsole.readLine("Please enter the breadth :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					if (param1Dbl < 0 && param2Dbl < 0) {
						System.out.println("Enter a valid positive number..!");
						continue;
					}

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = areaObj.rectangle(calInObj);

					myConsole.writer().println(" Area Of rectangle is " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid positive number..!");
				}

			} else if (userSelection.equals("3")) {
				myConsole.writer().println("User Selected Area of Circle");

				String param1 = myConsole.readLine("Please enter radius :");
				// String param2 = param1;

				try {
					double param1Dbl = Double.parseDouble(param1);
					// double param2Dbl = Double.parseDouble(param2);

					if (param1Dbl < 0) {
						System.out.println("Enter a valid positive number..!");
						continue;
					}
					CalcInput calInObj = new CalcInput(param1Dbl);

					CalcOutput actCalOutObj = areaObj.circle(calInObj);

					myConsole.writer().println(" Area Of Circle is " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid positive number..!");
				}
			} else if (userSelection.equals("Q")) {
				System.exit(0);
			}

			else {
				myConsole.writer().println("User Selected wrong option !!");
			}
			/*
			 * myConsole.writer().println();
			 * 
			 * myConsole.writer().println("Enter 1 for Area of Square2  : ");
			 * myConsole.writer().println("Enter 2 for Area of Rectangle  : ");
			 * myConsole.writer().println("Enter 3 for Area of Circle  : ");
			 * myConsole.writer().println("Enter Q to  quit this program  : ");
			 */

			/*
			 * if (userSelection.equals("Q")) { System.exit(0); }
			 */
		}
	}

}
