package com.indus.training.ui;

import java.io.Console;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.SciCalc;

public class SciCalcUI {

	public static void SciCalculator() {

		Console myConsole = System.console();
		// Area calObj = new Area();
		SciCalc sciCalObj = new SciCalc();

		while (true) {

			myConsole.writer().println("Enter 1 for sin : ");
			myConsole.writer().println("Enter 2 for cos  : ");
			myConsole.writer().println("Enter 3 for tan  : ");
			myConsole.writer().println("Enter 4 for sqRoot  : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered : " + userSelection);

			if (userSelection.equals("1")) {
				myConsole.writer().println("User Selected sin");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					// double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl);

					CalcOutput actCalOutObj = sciCalObj.sin(calInObj);

					myConsole.writer().println(" Sin " + param1 + " = " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid number..!");
				}
			} else if (userSelection.equals("2")) {
				myConsole.writer().println("User Selected cos");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					// double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl);

					CalcOutput actCalOutObj = sciCalObj.cos(calInObj);

					myConsole.writer().println(" Cos " + param1 + " = " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid number..!");
				}
			}

			else if (userSelection.equals("3")) {
				myConsole.writer().println("User Selected tan");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					// double param2Dbl = Double.parseDouble(param2);

					CalcInput calInObj = new CalcInput(param1Dbl);

					CalcOutput actCalOutObj = sciCalObj.tan(calInObj);

					myConsole.writer().println(" Tan " + param1 + " = " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid number..!");
				}
			}

			else if (userSelection.equals("4")) {
				myConsole.writer().println("User Selected sqRoot");

				String param1 = myConsole.readLine("Please Enter paramereter 1 :");

				try {
					double param1Dbl = Double.parseDouble(param1);
					// double param2Dbl = Double.parseDouble(param2);

					if (param1Dbl < 0) {
						System.out.println("Enter a valid positive number..!");
						continue;
					}
					CalcInput calInObj = new CalcInput(param1Dbl);

					CalcOutput actCalOutObj = sciCalObj.sqRoot(calInObj);

					myConsole.writer().println(" sqRoot of " + param1 + " = " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid number..!");
				}
			}

			else if (userSelection.equals("Q")) {
				System.exit(0);
			} else {
				myConsole.writer().println("User Selected wrong option !!");
			}

		}
	}
}
