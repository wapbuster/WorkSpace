/**
 * $Date: $
 * $Revision: $
 * $Author: $
 * $HeadURL: $
 * $Id: $ 
 *
  **/
package com.indus.training.dp.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Vector;

/**
 * @author indus
 *
 */
public class DBConnection implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2;

	private static DBConnection dbConn = null;

	private final static Object LOCK = new Object();

	private DBConnection() throws Exception {
		// todo initialize db connection.

		/*
		 * int i = 0; String s = "sunny"; Vector<String> v = new Vector<String>(); while
		 * (true) {
		 * 
		 * s = s + i; v.add(s); i = i + 1; }
		 */

		// throw new Exception("Sunny's custom exception. Expecting
		// InvocationTargetException. ");
	}

	// version 1.0
	/*
	 * public static DBConnection getConnection() throws Exception {
	 * 
	 * if (dbConn == null) { try { dbConn = new DBConnection(); } catch (Exception
	 * e) { throw e; } }
	 * 
	 * return dbConn; }
	 */

	// version 2.0
	/*
	 * public static synchronized DBConnection getConnection() throws Exception { if
	 * (dbConn == null) { try { dbConn = new DBConnection(); } catch (Exception e) {
	 * throw e; } }
	 * 
	 * return dbConn; }
	 */

	// version 3.0

	public static DBConnection getConnection() throws Exception {
		if (dbConn == null) {
			synchronized (LOCK) {
				if (dbConn == null) {
					try {
						dbConn = new DBConnection();
					} catch (Exception e) {
						throw e;
					}
				}
			}

		}
		return dbConn;
	}

	@Override
	public boolean equals(Object that) {
		// TODO Auto-generated method stub
		return this == that;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// return super.clone();
		try {
			return DBConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Object readResolve() throws Exception {

		return DBConnection.getConnection();
	}

}
