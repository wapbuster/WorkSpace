package com.indus.training.dao.ui;

import java.io.Console;
import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.dao.IMovieDAO;
import com.indus.training.dao.impl.MovieDAOImpl;
import com.indus.training.domain.Movie;
import com.indus.training.exception.IndusPersistException;
import com.indus.training.exception.IndusUIException;

public class TestMovieDAOUI {

	public static void main(String[] args) throws IndusUIException, IndusPersistException {

		Console myConsole = System.console();
		IMovieDAO movieDao = null;
		Movie movieObj = null;

		ApplicationContext appContextObj = new ClassPathXmlApplicationContext("beans.xml");
		movieDao = (IMovieDAO) appContextObj.getBean("movieDaoObj");
		movieObj = (Movie) appContextObj.getBean("movieObj");

		appContextObj = null;

		System.out.println(movieDao.readMovieByPK(new Integer(1)));

		movieObj.setMovieId(new Integer(1687));
		movieObj.setMovieName("omg");
		Date datez = Date.valueOf("2010-10-12");
		movieObj.setReleaseDate(datez);
		System.out.println(datez);

		movieDao.createMovie(movieObj);

		if (myConsole == null) {
			System.out.println("No console");
			System.exit(0);
		}

		while (true) {
			myConsole.writer().println("Enter 1 to read Movie record : ");
			myConsole.writer().println("Enter 2 to create movie Record : ");
			myConsole.writer().println("Enter 3 to update movie record : ");
			myConsole.writer().println("Enter 4 to delete movie record : ");
			myConsole.writer().println("Enter Q to quit : ");

			String userSelection = myConsole.readLine();

			if (userSelection.equals("1")) {

				String ip = myConsole.readLine("Enter Movie ID to read : ");
				Integer param1 = Integer.parseInt(ip);
				movieDao.readMovieByPK(param1);

			}
			if (userSelection.equals("2")) {

				String id = myConsole.readLine("Enter Movie ID to create : ");
				Integer param1 = Integer.parseInt(id);
				movieObj.setMovieId(param1);

				String title = myConsole.readLine("Enter Movie title to create : ");
				movieObj.setMovieName(title);

				String datestr = myConsole.readLine("Enter Movie date to create : ");
				Date date = Date.valueOf(datestr);
				movieObj.setReleaseDate(date);

				movieDao.createMovie(movieObj);
			}
			if (userSelection.equals("3")) {
				String id = myConsole.readLine("Enter id of movie to update details of it: ");
				Integer param1 = Integer.parseInt(id);
				movieObj.setMovieId(param1);

				String title = myConsole.readLine("Enter new Movie title to update : ");
				movieObj.setMovieName(title);

				String datestr = myConsole.readLine("Enter Movie date to update : ");
				Date date = Date.valueOf(datestr);
				movieObj.setReleaseDate(date);

				movieDao.updateMovie(movieObj);
			}

			if (userSelection.equals("4")) {

				String ip = myConsole.readLine("Enter Movie ID to delete : ");
				Integer param1 = Integer.parseInt(ip);
				movieDao.deleteMovie(param1);

			}

			if (userSelection.equals("Q")) {
				System.exit(0);
			}

		}

	}

}
