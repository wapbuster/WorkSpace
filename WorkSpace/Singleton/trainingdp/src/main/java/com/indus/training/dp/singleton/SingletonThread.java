/**
 * $Date: $
 * $Revision: $
 * $Author: $
 * $HeadURL: $
 * $Id: $ 
 *
  **/
package com.indus.training.dp.singleton;

public class SingletonThread extends Thread {

	private DBConnection connt = null;

	@Override
	public void run() {

		try {
			this.connt = DBConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DBConnection getConn() {
		return connt;
	}

	public SingletonThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
