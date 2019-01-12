package com.indus.training.dao;

import com.indus.training.domain.Genre;
import com.indus.training.exception.IndusPersistException;

public interface IGenreDAO {
	public Genre readGenreByPK(Integer genreId) throws IndusPersistException;

	public Boolean createGenre(Genre genreObj) throws IndusPersistException;

	public Boolean updateGenre(Genre genreObj) throws IndusPersistException;

	public Boolean deleteGenre(Integer genreId) throws IndusPersistException;

}
