package com.indus.training.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.indus.training.dao.IMovieDAO;
import com.indus.training.domain.Movie;
import com.indus.training.exception.IndusPresitException;

public class MovieDaoImpl implements IMovieDAO {

//	private ConnectionFactory connFactory;

	private Connection mySqlConnObj;

	/*
	 * public MovieDaoImpl(ConnectionFactory connFactory) { super();
	 * this.connFactory = connFactory; }
	 */

	public MovieDaoImpl(Connection mySqlConnObj) {
		super();
		this.mySqlConnObj = mySqlConnObj;
	}

	public Movie readMovieByPK(Integer movieId) throws IndusPresitException {
		Movie movieObj = null;
		Statement mySqlStmtObj = null;
		ResultSet movieResultSetObj = null;

		try {
			/*
			 * Class.forName("com.mysql.jdbc.Driver");
			 * 
			 * mySqlConnObj =
			 * DriverManager.getConnection("jdbc:mysql://localhost:3306/movielens", "root",
			 * "password");
			 */

			mySqlStmtObj = mySqlConnObj.createStatement();

			movieResultSetObj = mySqlStmtObj.executeQuery("SELECT * FROM MOVIES M WHERE M.ID = " + movieId);
			movieObj = new Movie();
			while (movieResultSetObj.next()) {

				
				movieObj.setMovieId(movieResultSetObj.getInt("ID"));
				movieObj.setMovieName(movieResultSetObj.getString("TITLE"));
				movieObj.setReleaseDate(movieResultSetObj.getDate("RELEASE_DATE"));
			}

		} catch (SQLException e) {
			throw new IndusPresitException(
					"Exception : reading Movie object from Movie DataBase with movie Id :" + movieId, e);
		} finally {

			try {
				if (movieResultSetObj != null) {
					movieResultSetObj.close();
				}
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

				/*if (mySqlConnObj != null) {
					mySqlConnObj.close();
				}*/
			} catch (SQLException e) {
				throw new IndusPresitException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}

		return movieObj;
	}

	public Boolean createMovie(Movie movieObj) throws IndusPresitException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean updateMovie(Movie movieObj) throws IndusPresitException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteMovie(Integer movieId) throws IndusPresitException {
		// TODO Auto-generated method stub
		return null;
	}

}
