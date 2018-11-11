package com.indus.training.core.service;

/**
 * 
 */
import com.indus.training.core.domain.EmployeeDetails;
import com.indus.training.core.exception.IndusException;

/**
 * 
 * @author sunnyhith
 *
 */
public interface IEmployee {
	/**
	 * 
	 * @param eDetails
	 * @throws IndusException
	 */
	public void createER(EmployeeDetails eDetailsObj) throws IndusException;

	/**
	 * 
	 * @param eDetails
	 * @return
	 * @throws IndusException
	 */
	public String readER(EmployeeDetails eDetailsObj) throws IndusException;

	/**
	 * 
	 * @param eDetails
	 * @throws IndusException
	 */
	public void updateER(EmployeeDetails eDetailsObj) throws IndusException;

	/**
	 * 
	 * @param eDetails
	 * @throws IndusException
	 */
	public void deleteER(EmployeeDetails eDetailsObj) throws IndusException;
}
