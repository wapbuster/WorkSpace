package com.indus.training.ui;

import java.io.Console;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.DistConv;

public class DistConvUI {

	public static void DistConv() {

		Console myConsole = System.console();
		DistConv distObj = new DistConv();

		while (true) {
			myConsole.writer().println("while loop start");
			myConsole.writer().println("Enter 1 for converting kilometers to miles : ");
			myConsole.writer().println("Enter 2 for converting miles to kilometers : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			String userSelection = myConsole.readLine();

			myConsole.writer().println("User Entered : " + userSelection);

			if (userSelection.equals("1")) {
				myConsole.writer().println("converting kilometers to miles : ");

				String param1 = myConsole.readLine("Please enter km :");
				String param2 = ("1.609");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					if (param1Dbl < 0) {
						System.out.println("Enter a valid positive number..!");
						continue;
					}

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = distObj.kmToMiles(calInObj);

					myConsole.writer().println(" In Miles: " + actCalOutObj);

				} catch (NumberFormatException e) {
					System.out.println("Enter a valid positive number..!");
				}

			} else if (userSelection.equals("2")) {
				myConsole.writer().println("converting miles to kilometers : ");

				String param1 = myConsole.readLine("Please enter miles :");
				String param2 = ("1.609");

				try {
					double param1Dbl = Double.parseDouble(param1);
					double param2Dbl = Double.parseDouble(param2);

					if (param1Dbl < 0 && param2Dbl < 0) {
						System.out.println("Enter a valid positive number..!");
						continue;
					}

					CalcInput calInObj = new CalcInput(param1Dbl, param2Dbl);

					CalcOutput actCalOutObj = distObj.milesToKm(calInObj);

					myConsole.writer().println(" In kilometers: " + actCalOutObj);
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid positive number..!");
				}

			} else if (userSelection.equals("Q")) {
				System.exit(0);
			}

			else {
				myConsole.writer().println("User Selected wrong option !!");
			}

		}
	}

}
