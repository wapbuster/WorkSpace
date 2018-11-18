package com.indus.training.dao;

import com.indus.training.domain.Movie;
import com.indus.training.exception.IndusPersistException;

public interface IMovieDAO {
	public Movie readMovieByPK(Integer movieId) throws IndusPersistException;

	public Boolean createMovie(Movie movieObj) throws IndusPersistException;

	public Boolean updateMovie(Movie movieObj) throws IndusPersistException;

	public Boolean deleteMovie(Integer movieId) throws IndusPersistException;

}
