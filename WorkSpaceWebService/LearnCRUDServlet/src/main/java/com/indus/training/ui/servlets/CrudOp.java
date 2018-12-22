package com.indus.training.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrudOp
 */
public class CrudOp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrudOp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter outStrm = response.getWriter();
		String operation = request.getParameter("crud");
		
		if ((operation != null) && !operation.isEmpty()) {
			if ("read".equals(operation)) {
				outStrm.append("<html>");
				outStrm.append("<body>");
				outStrm.append("<form action=\"Result\" method=\"post\" name=\"CrudOp\">");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">To read country details, enter country id :&nbsp;</span></h3>");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\"><input maxlength=\"2\" name=\"readtxt\" type=\"text\" /></span></h3>");
				outStrm.append("<br>");
				outStrm.append("<p><input name=\"btn\" type=\"submit\" value=\"Read\" /></p>");
				outStrm.append("</form>");
				outStrm.append("</html>");
				outStrm.append("</body>");
				
			} else if ("create".equals(operation)) {
				outStrm.append("<html>");
				outStrm.append("<body>");	
				outStrm.append("<form action=\"Result\" method=\"post\" name=\"CrudOp\">");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">To create country details, </span></h3>");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">enter country id :&nbsp;<input maxlength=\"2\" name=\"createId\" type=\"text\" /></span></h3>");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">enter country name :&nbsp;<input maxlength=\"30\" name=\"createName\" type=\"text\" /></span></h3>");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">enter region id :&nbsp;<input maxlength=\"3\" name=\"createRegId\" type=\"text\" /></span></h3>");
				outStrm.append("<p><span style=\"font-family:courier new,courier,monospace;\"><input name=\"btn\" type=\"submit\" value=\"Create\" /></span></p>");
				outStrm.append("<br>");
				outStrm.append("<br>");
				outStrm.append("<br>");
				outStrm.append("</form>");
				outStrm.append("<html>");
				outStrm.append("<body>");
				
				//result = Double.toString(Double.parseDouble(param1) - Double.parseDouble(param2));
			} else if ("update".equals(operation)) {
				//result = Double.toString(Double.parseDouble(param1) * Double.parseDouble(param2));
			} else if ("delete".equals(operation)) {
				outStrm.append("<html>");
				outStrm.append("<body>");
				outStrm.append("<form action=\"Result\" method=\"post\" name=\"CrudOp\">");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">To delete country details, enter country id :&nbsp;</span></h3>");
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\"><input maxlength=\"2\" name=\"readtxt\" type=\"text\" /></span></h3>");
				outStrm.append("<br>");
				outStrm.append("<p><input name=\"btn\" type=\"submit\" value=\"Delete\" /></p>");
				outStrm.append("</form>");
				outStrm.append("</html>");
				outStrm.append("</body>");
			}

		}
		
		
	}

}
