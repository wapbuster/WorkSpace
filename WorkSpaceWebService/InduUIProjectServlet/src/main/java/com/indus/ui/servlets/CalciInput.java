package com.indus.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalciInput
 */
public class CalciInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalciInput() {
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
		outStrm.append("<h2>CalciInfo Page</h2>");

		outStrm.append("<h2>Welcome</h2>");
		outStrm.append("<br>");

		outStrm.append("<form action=\"Calculate\" method=\"post\">");
		outStrm.append("<br>");
		outStrm.append("Param1 : <input type=\"text\" name=\"param1\"/>");
		outStrm.append("<br>");
		outStrm.append("Param2 : <input type=\"text\" name=\"param2\"/>");
		outStrm.append("<br>");
		outStrm.append("Operation : ");
		outStrm.append("<br>");
		outStrm.append("Addition <input type=\"radio\" name=\"operation\" value=\"addition\"/>");
		outStrm.append("<br>");
		outStrm.append("Subtract <input type=\"radio\" name=\"operation\"  value=\"subtract\"/>");
		outStrm.append("<br>");
		outStrm.append("Multiply <input type=\"radio\" name=\"operation\"  value=\"multiply\" />");
		outStrm.append("<br>");
		outStrm.append("Division <input type=\"radio\" name=\"operation\"  value=\"division\"/>");
		outStrm.append("<br>");
		outStrm.append("<input\r\n" + "		type=\"submit\" value=\" Calculate\" />");
		outStrm.append("<br>");
		outStrm.append("</form>");
		outStrm.append("<br>");
		outStrm.append("</body>");
		outStrm.append("</html>");

		outStrm.flush();
	}

}
