package com.indus.training.core.domain;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 589103103875533323L;

	private String fName;
	private String mName;
	private String lName;
	private String age;
	private String empID;
	private String email;
	private String pNum;

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getfName() {
		return fName;
	}

	public String getmName() {
		return mName;
	}

	public String getlName() {
		return lName;
	}

	public String getAge() {
		return age;
	}

	public String getEmpID() {
		return empID;
	}

	public String getEmail() {
		return email;
	}

	public String getpNum() {
		return pNum;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", age=" + age + ", empID="
				+ empID + ", email=" + email + ", pNum=" + pNum + "]";
	}

}
