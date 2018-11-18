package com.indus.training.core.ui;

import java.io.Console;

import com.indus.training.core.domain.Employee;
import com.indus.training.core.exception.IndusException;
import com.indus.training.core.impl.EmployeeDAO;
import com.indus.training.core.service.IEmployeeDAO;

public class TestEmployeeUI {

	public static void main(String[] args) throws IndusException {

		Console myConsole = System.console();
		IEmployeeDAO empObj = new EmployeeDAO();
		
		
		Employee eDetailsObj = new Employee();

		if (myConsole == null) {
			System.out.println("No console");
			System.exit(0);
		}

		while (true) {
			myConsole.writer().println("Enter 1 to create Employee Record : ");
			myConsole.writer().println("Enter 2 to read Employee Record : ");
			myConsole.writer().println("Enter 3 to update Employee Record : ");
			myConsole.writer().println("Enter 4 to delete Employee Record : ");
			myConsole.writer().println("Enter Q to  quit this program  : ");

			String userSelection = myConsole.readLine();

			if (userSelection.equals("1")) {

				String fName = myConsole.readLine("Enter First Name :");
				if (fName.matches("\\s*\\S+\\s*") == true) {
				eDetailsObj.setfName(fName);
				} else {
					System.out.println("Enter valid first name:");
				}
				String mName = myConsole.readLine("Enter Middle Name :");
				eDetailsObj.setmName(mName);
				String lName = myConsole.readLine("Enter Last Name :");
				eDetailsObj.setlName(lName);
				String age = myConsole.readLine("Enter age :");
				eDetailsObj.setAge(age);
				String empID = myConsole.readLine("Enter Employee ID :");
				eDetailsObj.setEmpID(empID);
				String email = myConsole.readLine("Enter e-mail address :");
				eDetailsObj.setEmail(email);
				String pNum = myConsole.readLine("Enter Phone number :");
				eDetailsObj.setpNum(pNum);
				empObj.createER(eDetailsObj);

			} else if (userSelection.equals("2")) {
				String empid = myConsole.readLine("Enter the employee id to retrieve details :");
				eDetailsObj.setEmpID(empid);
				System.out.println(empObj.readER(eDetailsObj));
			} else if (userSelection.equals("3")) {
				String updateid = myConsole.readLine("Enter the employee id to update details :");
				eDetailsObj.setEmpID(updateid);

				while (true) {
					myConsole.writer().println("Enter 1 to update First Name : ");
					myConsole.writer().println("Enter 2 to update Middle Name : ");
					myConsole.writer().println("Enter 3 to update Last Name : ");
					myConsole.writer().println("Enter 4 to update age : ");
					myConsole.writer().println("Enter 5 to update emp id : ");
					myConsole.writer().println("Enter 6 to update email address : ");
					myConsole.writer().println("Enter 7 to update phone number : ");
					myConsole.writer().println("Enter Q to  quit this program  : ");

					String userSelect = myConsole.readLine();

					if (userSelect.equals("1")) {
						empObj.updateER(eDetailsObj);
						String fName = myConsole.readLine("Enter updated First Name :");
						if (fName.matches("\\s*\\S+\\s*") == true) {
							eDetailsObj.setfName(fName);
							empObj.createER(eDetailsObj);
						} else {
							System.out.println("Enter valid first name:");
						}
					} else if (userSelect.equals("2")) {
						empObj.updateER(eDetailsObj);
						String mName = myConsole.readLine("Enter updated Middle Name :");
						eDetailsObj.setmName(mName);
						empObj.createER(eDetailsObj);
					} else if (userSelect.equals("3")) {
						empObj.updateER(eDetailsObj);
						String lName = myConsole.readLine("Enter updated Last Name :");
						eDetailsObj.setlName(lName);
						empObj.createER(eDetailsObj);
					} else if (userSelect.equals("4")) {
						empObj.updateER(eDetailsObj);
						String age = myConsole.readLine("Enter updated Age :");
						eDetailsObj.setAge(age);
						empObj.createER(eDetailsObj);
					} else if (userSelect.equals("5")) {
						empObj.updateER(eDetailsObj);
						String empid = myConsole.readLine("Enter updated emp id :");
						eDetailsObj.setEmpID(empid);
						empObj.createER(eDetailsObj);
					} else if (userSelect.equals("6")) {
						empObj.updateER(eDetailsObj);
						String email = myConsole.readLine("Enter updated email address :");
						eDetailsObj.setEmail(email);
						empObj.createER(eDetailsObj);
					} else if (userSelect.equals("7")) {
						empObj.updateER(eDetailsObj);
						String pnum = myConsole.readLine("Enter updated phone number :");
						eDetailsObj.setpNum(pnum);
						empObj.createER(eDetailsObj);
					} else if (userSelect.equals("Q")) {
						System.exit(0);
					} else {
						myConsole.writer().println("User selected wrong option");
					}
					myConsole.writer().println();
				}
			} else if (userSelection.equals("4")) {
				String empFile = myConsole.readLine("Enter the employee id to delete record :");
				eDetailsObj.setEmpID(empFile);
				empObj.deleteER(eDetailsObj);
			} else if (userSelection.equals("Q")) {
				System.exit(0);
			} else {
				myConsole.writer().println("User selected wrong option");
			}
		}

	}
}
