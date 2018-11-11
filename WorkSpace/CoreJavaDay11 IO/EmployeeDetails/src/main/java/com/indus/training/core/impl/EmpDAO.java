package com.indus.training.core.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.indus.training.core.domain.Employee;
import com.indus.training.core.exception.IndusException;
import com.indus.training.core.service.IEmployeeDAO;

public class EmpDAO implements IEmployeeDAO {

	public void createER(Employee eDetailsObj) throws IndusException {
		ObjectOutputStream empObjStream = null;

		try {
			empObjStream = new ObjectOutputStream(new FileOutputStream(eDetailsObj.getEmpID() + ".txt"));

			empObjStream.writeObject(eDetailsObj);

		} catch (FileNotFoundException e) {
			throw new IndusException("Exception opening file with file name " + eDetailsObj.getEmpID() + ".txt", e);
		} catch (IOException e) {
			throw new IndusException("Exception in reading details from file name " + eDetailsObj.getEmpID() + ".txt",
					e);
		} finally {
			try {
				if (empObjStream != null) {
					empObjStream.close();
				}
			} catch (IOException e) {
				throw new IndusException(
						"Exception in closing object out stream with file name " + eDetailsObj.getEmpID() + ".txt", e);
			}
		}

	}

	public Employee readER(Employee eDetailsObj) throws IndusException {
		Employee empReadResultObj = null;
		ObjectInputStream empInObjSteam = null;
		try {
			empInObjSteam = new ObjectInputStream(new FileInputStream(eDetailsObj.getEmpID() + ".txt"));

			empReadResultObj = (Employee) empInObjSteam.readObject();

		} catch (FileNotFoundException e) {
			throw new IndusException("Exception opening file with file name " + eDetailsObj.getEmpID() + ".txt", e);
		} catch (IOException e) {
			throw new IndusException("Exception in reading details from file name " + eDetailsObj.getEmpID() + ".txt",
					e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (empInObjSteam != null) {
					empInObjSteam.close();
				}
			} catch (IOException e) {
				throw new IndusException(
						"Exception in closing object input stream with file name " + eDetailsObj.getEmpID() + ".txt",
						e);
			}
		}
		return empReadResultObj;
	}

	public void updateER(Employee eDetailsObj) throws IndusException {
		Employee empObjRead = readER(eDetailsObj);

//		if()
		createER(empObjRead);

	}

	public void deleteER(Employee eDetailsObj) throws IndusException {

		File fileObj = new File(eDetailsObj.getEmpID() + ".txt");
		if (fileObj.exists()) {
			fileObj.delete();
		} else {
			throw new IndusException("File does not exists");
		}

	}

}
