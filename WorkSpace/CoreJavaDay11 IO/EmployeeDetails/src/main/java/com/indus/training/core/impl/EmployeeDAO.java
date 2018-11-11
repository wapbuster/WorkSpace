package com.indus.training.core.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import com.indus.training.core.domain.Employee;
import com.indus.training.core.exception.IndusException;
import com.indus.training.core.service.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO  {

	private String filePath;

	public EmployeeDAO() {
		super();
		this.filePath = "C:\\IndusTraining\\WorkSpace\\CoreJavaDay11 IO\\FileTesting\\";
	}

	public void createER(Employee eDetailsObj) throws IndusException {
		String fName = eDetailsObj.getfName();
		String mName = eDetailsObj.getmName();
		String lName = eDetailsObj.getlName();
		String age = eDetailsObj.getAge();
		String empID = eDetailsObj.getEmpID();
		String email = eDetailsObj.getEmail();
		String pNum = eDetailsObj.getpNum();

		String eDetails = fName + " " + mName + " " + lName + " " + age + " " + empID + " " + email + " " + pNum;

		BufferedWriter out = null;

		String fileName = empID;

		try {
			out = new BufferedWriter(new FileWriter(filePath + fileName + ".txt"));
			out.write(eDetails);

		} catch (FileNotFoundException fileEx) {
			throw new IndusException("File not found", fileEx);
		} catch (IOException ioEx) {
			throw new IndusException("File not found", ioEx);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException ioEx) {
					throw new IndusException("File not found", ioEx);
				}
			}
		}
	}

	public Employee readER(Employee eDetailsObj) throws IndusException {
		BufferedReader in = null;

		String content = new String();

		try {
			in = new BufferedReader(new FileReader(filePath + eDetailsObj.getEmpID() + ".txt"));
			String lineContent = in.readLine();
			while (true) {
				if (lineContent != null) {
					content = content + lineContent;
				} else {
					break;
				}
			}

		} catch (FileNotFoundException fileEx) {
			throw new IndusException("File not found", fileEx);

		} catch (IOException ioEx) {
			throw new IndusException("IO Exception", ioEx);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ioEx) {
					throw new IndusException("IO Exception", ioEx);
				}
			}
		}
		return null;

	}

	public void updateER(Employee eDetailsObj) throws IndusException {
		/*BufferedReader in = null;

		String content = new String();

		try {
			in = new BufferedReader(new FileReader(filePath + eDetailsObj.getEmpID() + ".txt"));
			String lineContent = in.readLine();
			while (true) {
				if (lineContent != null) {
					content = content + lineContent;
				} else {
					break;
				}
				lineContent = in.readLine();
			}

		} catch (FileNotFoundException fileEx) {
			throw new IndusException("File not found", fileEx);

		} catch (IOException ioEx) {
			throw new IndusException("IO Exception", ioEx);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ioEx) {
					throw new IndusException("IO Exception", ioEx);
				}
			}
		}*/

		
//		StringTokenizer st = new StringTokenizer(readER(eDetailsObj));
//		String[] token = new String[7];
//
//		/*
//		 * for (int i = 0; i < st.countTokens(); i++) {
//		 * 
//		 * token[i] = st.nextToken(); System.out.println(token[i]); }
//		 */
//
//		int i = 0;
//		while (st.hasMoreTokens()) {
//			token[i] = st.nextToken();
//			i++;
//		}
//
//		eDetailsObj.setfName(token[0]);
//		eDetailsObj.setmName(token[1]);
//		eDetailsObj.setlName(token[2]);
//		eDetailsObj.setAge(token[3]);
//		eDetailsObj.setEmpID(token[4]);
//		eDetailsObj.setEmail(token[5]);
//		eDetailsObj.setpNum(token[6]);

	}

	public void deleteER(Employee eDetailsObj) throws IndusException {
		String empFile = eDetailsObj.getEmpID();
		File file = new File(filePath + empFile + ".txt");
		file.delete();
	}
}
