package com.indus.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalciResult
 */
public class CalciResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalciResult() {
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

		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		String operation = request.getParameter("operation");
		String result = null;

		if ((operation != null) && !operation.isEmpty()) {
			if ("addition".equals(operation)) {
				result = Double.toString(Double.parseDouble(param1) + Double.parseDouble(param2));
			} else if ("subtract".equals(operation)) {
				result = Double.toString(Double.parseDouble(param1) - Double.parseDouble(param2));
			} else if ("multiply".equals(operation)) {
				result = Double.toString(Double.parseDouble(param1) * Double.parseDouble(param2));
			} else if ("division".equals(operation)) {
				result = Double.toString(Double.parseDouble(param1) / Double.parseDouble(param2));
			}

		}

		
		outStrm.append("<html>");
		outStrm.append("<body>");
		outStrm.append("<h2>CalciInfo Page</h2>");

		outStrm.append("<h2>Welcome</h2>");
		outStrm.append("<br>");

		outStrm.append("<form action=\"\">");
		outStrm.append("<br>");
		outStrm.append("Param1 : " + param1);
		outStrm.append("<br>");
		outStrm.append("Param2 : " + param2);
		outStrm.append("<br>");
		outStrm.append("Operation : " + operation);
		outStrm.append("<br>");
		outStrm.append("Result : " + result);
		outStrm.append("<br>");
		outStrm.append("<a href=\"CalciInput\"> Calci Info Page !!</a>");

		outStrm.append("<br>");
		outStrm.append("<a href=\"MyServlet\"> Home</a>");
		outStrm.append("<br>");
		outStrm.append("</form>");
		outStrm.append("<br>");
		outStrm.append("</body>");
		outStrm.append("</html>");

		outStrm.flush();
	}

}
