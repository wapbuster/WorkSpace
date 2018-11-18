package com.indus.training.orm.domain;

import java.io.Serializable;
import java.sql.Date;

public class Movie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6401235744164918613L;
	
	private Integer movieId;
	private String movieName;
	private Date releaseDate;

	public Movie() {
		super();
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}
