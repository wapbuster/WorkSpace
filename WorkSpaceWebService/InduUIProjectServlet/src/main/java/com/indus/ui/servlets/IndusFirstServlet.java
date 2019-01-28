package com.indus.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndusFirstServlet
 */
public class IndusFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndusFirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter outStrm = response.getWriter();

		outStrm.append("<html>");
		outStrm.append("<body>");
		outStrm.append("<h2>Learning HTML, CSS, JS, and Web component development</h2>");

		outStrm.append("<h2>Welcome</h2>");
		outStrm.append("<br>");
		outStrm.append("<a href=\"CalciInput\"> Calci Info Page !!</a>");
		outStrm.append("</body>");
		outStrm.append("</html>");

		outStrm.flush();
	}

}
