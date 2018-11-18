package com.indus.training.domain;

import java.io.Serializable;
import java.sql.Date;

public class Genre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6401235744164918613L;

	private Integer genreId;
	private String genreName;
	
	private int movieCount;

	public int getMovieCount() {
		return movieCount;
	}

	public void setMovieCount(int movieCount) {
		this.movieCount = movieCount;
	}

	public Genre() {
		super();
	}

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer movieId) {
		this.genreId = movieId;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String movieName) {
		this.genreName = movieName;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + genreId + ", movieName=" + genreName + "]";
	}

}
