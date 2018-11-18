package com.indus.training.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.indus.training.dao.IMovieDAO;
import com.indus.training.domain.Movie;
import com.indus.training.exception.IndusPersistException;

public class MovieDAOImpl implements IMovieDAO {

//	private ConnectionFactory connFactory;

	private Connection mySqlConnObj;

	/*
	 * public MovieDaoImpl(ConnectionFactory connFactory) { super();
	 * this.connFactory = connFactory; }
	 */

	public MovieDAOImpl(Connection mySqlConnObj) {
		super();
		this.mySqlConnObj = mySqlConnObj;
	}

	public Movie readMovieByPK(Integer movieId) throws IndusPersistException {
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
			throw new IndusPersistException(
					"Exception : reading Movie object from Movie DataBase with movie Id :" + movieId, e);
		} finally {

			try {
				if (movieResultSetObj != null) {
					movieResultSetObj.close();
				}
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

				/*
				 * if (mySqlConnObj != null) { mySqlConnObj.close(); }
				 */
			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}

		return movieObj;
	}

	public Boolean createMovie(Movie movieObj) throws IndusPersistException {
		// Movie movieObj = null;
		Statement mySqlStmtObj = null;
		ResultSet movieResultSetObj = null;

		// select count(id) from movies;

		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			/*
			 * movieResultSetObj=
			 * mySqlStmtObj.executeQuery("select count(id) from movies;");
			 * movieObj.setMovieCount(movieResultSetObj.getInt("count(id)"));
			 * System.out.println(movieObj.getMovieCount());
			 */

			mySqlStmtObj.execute("INSERT INTO MOVIES VALUES('" + movieObj.getMovieId() + "','" + movieObj.getMovieName()
					+ "','" + movieObj.getReleaseDate() + "')");


		} catch (SQLException e) {
			throw new IndusPersistException("Exception : creating movie record :", e);
		} finally {

			try {
				/*
				 * if (movieResultSetObj != null) { movieResultSetObj.close(); }
				 */
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}
		return null;
	}

	public Boolean updateMovie(Movie movieObj) throws IndusPersistException {
		// Movie movieObj = null;
		Statement mySqlStmtObj = null;
		ResultSet movieResultSetObj = null;

		// select count(id) from movies;

		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			mySqlStmtObj.execute("UPDATE MOVIES SET TITLE = '" + movieObj.getMovieName() + "',release_date='"
					+ movieObj.getReleaseDate() + "' WHERE id=" + movieObj.getMovieId());

		} catch (SQLException e) {
			throw new IndusPersistException("Exception : updating movie record :", e);
		} finally {

			try {
				/*
				 * if (movieResultSetObj != null) { movieResultSetObj.close(); }
				 */
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}
		return null;

	}

	public Boolean deleteMovie(Integer movieId) throws IndusPersistException {
		// Movie movieObj = null;
		Statement mySqlStmtObj = null;
		ResultSet movieResultSetObj = null;

		// select count(id) from movies;

		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			mySqlStmtObj.execute("DELETE FROM MOVIES WHERE ID =" + movieId);

		} catch (SQLException e) {
			throw new IndusPersistException("Exception : DELETING movie record :", e);
		} finally {

			try {
				/*
				 * if (movieResultSetObj != null) { movieResultSetObj.close(); }
				 */
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}
		return null;
	}

}
