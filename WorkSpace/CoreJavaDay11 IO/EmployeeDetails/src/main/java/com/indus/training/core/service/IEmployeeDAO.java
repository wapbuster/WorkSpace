package com.indus.training.core.service;

/**
 * 
 */
import com.indus.training.core.domain.Employee;
import com.indus.training.core.exception.IndusException;

/**
 * 
 * @author sunnyhith
 *
 */
public interface IEmployeeDAO {
	/**
	 * 
	 * @param eDetails
	 * @return 
	 * @throws IndusException
	 */
	public void createER(Employee eDetailsObj) throws IndusException;

	/**
	 * 
	 * @param eDetails
	 * @return
	 * @throws IndusException
	 */
	public Employee readER(Employee eDetailsObj) throws IndusException;

	/**
	 * 
	 * @param eDetails
	 * @throws IndusException
	 */
	public void updateER(Employee eDetailsObj) throws IndusException;

	/**
	 * 
	 * @param eDetails
	 * @throws IndusException
	 */
	public void deleteER(Employee eDetailsObj) throws IndusException;
}
