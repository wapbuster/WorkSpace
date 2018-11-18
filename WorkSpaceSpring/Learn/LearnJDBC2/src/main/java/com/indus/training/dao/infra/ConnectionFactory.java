package com.indus.training.dao.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.indus.training.exception.IndusPersistException;

public class ConnectionFactory {

	private String url;

	private String drMgrClass;

	private String userName;

	private String password;

	public ConnectionFactory(String url, String drMgrClass, String userName, String password) {
		super();
		this.url = url;
		this.drMgrClass = drMgrClass;
		this.userName = userName;
		this.password = password;
	}

	public Connection getDBConnection() throws IndusPersistException {
		Connection connObj = null;

		try {
			Class.forName(drMgrClass);

			connObj = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			throw new IndusPersistException("Exception : Creating Data base connection for MySQL", e);
		} catch (ClassNotFoundException e) {
			throw new IndusPersistException(
					"Exception : Creating Data base connection for MySQL Driver manager Class not found :", e);
		} finally {

		}

		return connObj;
	}

}
