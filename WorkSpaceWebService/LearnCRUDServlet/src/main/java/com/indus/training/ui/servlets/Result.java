package com.indus.training.ui.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indus.training.orm.dao.impl.CountryDAOImpl;
import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusException;

/**
 * Servlet implementation class Result
 */
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Result() {
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
		String btn = request.getParameter("btn");

		CountryDAOImpl conDaoObj = new CountryDAOImpl();
		Country conObj = null;

		if ((btn != null) && !btn.isEmpty()) {
			if ("Read".equals(btn)) {

				String strId = request.getParameter("readtxt");

				try {
					conObj = conDaoObj.readCountryByPk(strId);
				} catch (IndusException e) {
					e.printStackTrace();
				}

				String id = conObj.getCountry_id();
				String conName = conObj.getCountry_name();
				int regId = conObj.getRegion_id();

				outStrm.append("<html>");
				outStrm.append("<body>");
				outStrm.append(
						"<h3><span style=\"font-family:courier new,courier,monospace;\">Country Id :</span></h3>" + id);
				outStrm.append(
						"<h3><span style=\"font-family:courier new,courier,monospace;\">Country Name :</span></h3>"
								+ conName);
				outStrm.append("<h3><span style=\"font-family:courier new,courier,monospace;\">Region Id :</span></h3>"
						+ regId);
				outStrm.append("</html>");
				outStrm.append("</body>");

			} else if ("Create".equals(btn)) {

				String strId = request.getParameter("createId");
				String strName = request.getParameter("createName");
				String strRegId = request.getParameter("createRegId");
				conObj = new Country();
				conObj.setCountry_id(strId);
				conObj.setCountry_name(strName);
				conObj.setRegion_id(Integer.parseInt(strRegId));
				
				try {
					conDaoObj.createCountry(conObj);
					outStrm.append("<html>");
					outStrm.append("<body>");
					outStrm.append("<h1><span style=\"font-family:courier new,courier,monospace;\">Created.!</span></h1>");
					outStrm.append("</html>");
					outStrm.append("</body>");
				} catch (IndusException e) {
					e.printStackTrace();
				}

			} else if ("Update".equals(btn)) {
				// result = Double.toString(Double.parseDouble(param1) *
				// Double.parseDouble(param2));
			} else if ("Delete".equals(btn)) {
				String strId = request.getParameter("readtxt");

				try {
					conDaoObj.deleteCountry(strId);
					outStrm.append("<html>");
					outStrm.append("<body>");
					outStrm.append("<h1><span style=\"font-family:courier new,courier,monospace;\">Deleted.!</span></h1>");
					outStrm.append("</html>");
					outStrm.append("</body>");
				} catch (IndusException e) {
					e.printStackTrace();
				}

				
			}

		}

	}

}
