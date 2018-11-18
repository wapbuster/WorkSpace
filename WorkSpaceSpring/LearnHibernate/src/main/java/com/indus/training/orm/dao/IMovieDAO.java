package com.indus.training.orm.dao;

import com.indus.training.orm.domain.Movie;
import com.indus.training.orm.exception.IndusPersistException;

public interface IMovieDAO {
	public Movie readMovieByPK(Integer movieId) throws IndusPersistException;

	public Boolean createMovie(Movie movieObj) throws IndusPersistException;

	public Boolean updateMovie(Movie movieObj) throws IndusPersistException;

	public Boolean deleteMovie(Integer movieId) throws IndusPersistException;

}
