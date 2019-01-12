package com.indus.training.dao.ui;

import java.io.Console;
import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.dao.IGenreDAO;
import com.indus.training.dao.impl.GenreDAOImpl;
import com.indus.training.domain.Genre;
import com.indus.training.exception.IndusPersistException;
import com.indus.training.exception.IndusUIException;

public class TestGenreDAOUI {

	public static void main(String[] args) throws IndusUIException, IndusPersistException {

		Console myConsole = System.console();
		IGenreDAO genre = null;
		Genre genreObj = null;

		ApplicationContext appContextObj = new ClassPathXmlApplicationContext("beans.xml");
		genre = (IGenreDAO) appContextObj.getBean("genreDaoObj");
		genreObj = (Genre) appContextObj.getBean("genreObj");

		appContextObj = null;
		System.out.println(genre.readGenreByPK(new Integer(19)));
		

		if (myConsole == null) {
			System.out.println("No console");
			System.exit(0);
		}

		while (true) {
			myConsole.writer().println("Enter 1 to read genre record : ");
			myConsole.writer().println("Enter 2 to create genre Record : ");
			myConsole.writer().println("Enter 3 to update genre record : ");
			myConsole.writer().println("Enter 4 to delete genre record : ");
			myConsole.writer().println("Enter Q to quit : ");

			String userSelection = myConsole.readLine();

			if (userSelection.equals("1")) {

				String ip = myConsole.readLine("Enter genre ID to read : ");
				Integer param1 = Integer.parseInt(ip);
				genre.readGenreByPK(param1);

			}
			if (userSelection.equals("2")) {

				String id = myConsole.readLine("Enter genre ID to create : ");
				Integer param1 = Integer.parseInt(id);
				genreObj.setGenreId(param1);

				String name = myConsole.readLine("Enter genre name to create : ");
				genreObj.setGenreName(name);

				genre.createGenre(genreObj);
			}
			if (userSelection.equals("3")) {
				String id = myConsole.readLine("Enter id of genre to update details of it: ");
				Integer param1 = Integer.parseInt(id);
				genreObj.setGenreId(param1);

				String name = myConsole.readLine("Enter new genre title to update : ");
				genreObj.setGenreName(name);

				genre.updateGenre(genreObj);
			}

			if (userSelection.equals("4")) {

				String ip = myConsole.readLine("Enter genre ID to delete : ");
				Integer param1 = Integer.parseInt(ip);
				genre.deleteGenre(param1);

			}

			if (userSelection.equals("Q")) {
				System.exit(0);
			}

		}

	}

}
