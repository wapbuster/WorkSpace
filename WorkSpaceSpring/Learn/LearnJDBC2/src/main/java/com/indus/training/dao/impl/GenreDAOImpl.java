package com.indus.training.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.indus.training.dao.IGenreDAO;
import com.indus.training.domain.Genre;
import com.indus.training.exception.IndusPersistException;

public class GenreDAOImpl implements IGenreDAO {

	private Connection mySqlConnObj;

	public GenreDAOImpl(Connection mySqlConnObj) {
		super();
		this.mySqlConnObj = mySqlConnObj;
	}

	public Genre readGenreByPK(Integer genreId) throws IndusPersistException {
		Genre genreObj = null;
		Statement mySqlStmtObj = null;
		ResultSet genreResultSetObj = null;

		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			genreResultSetObj = mySqlStmtObj.executeQuery("SELECT * FROM GENRES WHERE ID = " + genreId);
			genreObj = new Genre();
			while (genreResultSetObj.next()) {

				genreObj.setGenreId(genreResultSetObj.getInt("ID"));
				genreObj.setGenreName(genreResultSetObj.getString("NAME"));
			}

		} catch (SQLException e) {
			throw new IndusPersistException("Exception : reading GENRE object", e);
		} finally {

			try {
				if (genreResultSetObj != null) {
					genreResultSetObj.close();
				}
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}

		return genreObj;
	}

	public Boolean createGenre(Genre genreObj) throws IndusPersistException {
		Statement mySqlStmtObj = null;

		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			mySqlStmtObj.execute(
					"INSERT INTO GENRES VALUES('" + genreObj.getGenreId() + "','" + genreObj.getGenreName() + "')");

		} catch (SQLException e) {
			throw new IndusPersistException("Exception : creating GENRE record :", e);
		} finally {

			try {

				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}
		return null;
	}

	public Boolean updateGenre(Genre movieObj) throws IndusPersistException {
		Statement mySqlStmtObj = null;
		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			mySqlStmtObj.execute(
					"UPDATE GENRES SET name = '" + movieObj.getGenreName() + "' WHERE id=" + movieObj.getGenreId());

		} catch (SQLException e) {
			throw new IndusPersistException("Exception : updating GENRE record :", e);
		} finally {

			try {
				if (mySqlStmtObj != null) {
					mySqlStmtObj.close();
				}

			} catch (SQLException e) {
				throw new IndusPersistException("Exception : Closing Db Connection from Movie DataBase ", e);
			}

		}
		return null;

	}

	public Boolean deleteGenre(Integer genreId) throws IndusPersistException {
		Statement mySqlStmtObj = null;

		try {

			mySqlStmtObj = mySqlConnObj.createStatement();

			mySqlStmtObj.execute("DELETE FROM GENRES WHERE ID =" + genreId);

		} catch (SQLException e) {
			throw new IndusPersistException("Exception : DELETING genre record :", e);
		} finally {

			try {
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
