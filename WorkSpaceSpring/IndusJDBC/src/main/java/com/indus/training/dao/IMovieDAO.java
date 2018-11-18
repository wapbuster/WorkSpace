package com.indus.training.dao;

import com.indus.training.domain.Movie;
import com.indus.training.exception.IndusPresitException;

public interface IMovieDAO {

	public Movie readMovieByPK(Integer movieId) throws IndusPresitException;

	public Boolean createMovie(Movie movieObj) throws IndusPresitException;

	public Boolean updateMovie(Movie movieObj) throws IndusPresitException;

	public Boolean deleteMovie(Integer movieId) throws IndusPresitException;

}
