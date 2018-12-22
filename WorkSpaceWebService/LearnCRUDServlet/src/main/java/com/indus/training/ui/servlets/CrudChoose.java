package com.indus.training.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indus.training.orm.domain.Country;

/**
 * Servlet implementation class CrudOp
 */
public class CrudChoose extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrudChoose() {
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

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Country conObj = new Country();
		conObj.getCountry_id();

		PrintWriter outStrm = response.getWriter();

		outStrm.append("<html>");
		outStrm.append("<body>");
		outStrm.append("<br>");
		outStrm.append(
				"<h3><span style=\"font-family:courier new,courier,monospace;\">Choose the Operation :</span></h3>");
		outStrm.append("<br>");
		outStrm.append("<form action=\"CrudOp\" method=\"post\" name=\"CrudChoose\">");
		outStrm.append(
				"<p><strong><span style=\"font-family:courier new,courier,monospace;\"><input name=\"crud\" type=\"radio\" value=\"read\" />Read</span></strong></p>");
		outStrm.append(
				"<p><strong><span style=\"font-family:courier new,courier,monospace;\"><input name=\"crud\" type=\"radio\" value=\"create\" />Create</span></strong></p>");
		outStrm.append(
				"<p><strong><span style=\"font-family:courier new,courier,monospace;\"><input name=\"crud\" type=\"radio\" value=\"update\" />Update</span></strong></p>");
		outStrm.append(
				"<p><strong><span style=\"font-family:courier new,courier,monospace;\"><input name=\"crud\" type=\"radio\" value=\"delete\" />Delete</span></strong></p>");
		outStrm.append(
				"<p><span style=\"font-family:courier new,courier,monospace;\"><input name=\"choosebtn\" type=\"submit\" value=\"Submit\" /></span></p>");
		outStrm.append("</form>");

		outStrm.append("</html>");
		outStrm.append("</body>");

		outStrm.flush();
	}

}
