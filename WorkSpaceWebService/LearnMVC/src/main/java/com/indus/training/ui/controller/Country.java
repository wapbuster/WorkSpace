package com.indus.training.ui.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indus.training.orm.dao.impl.CountryDAOImpl;
import com.indus.training.orm.domain.Country;
import com.indus.training.orm.exception.IndusException;
import com.indus.training.ui.model.CountryOutBean;

/**
 * Servlet implementation class Calculator
 */
public class Country extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Country() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String btn = request.getParameter("btn");

		CountryDAOImpl conDaoObj = new CountryDAOImpl();
		CountryOutBean conObj = new CountryOutBean();

		if ((btn != null) && !btn.isEmpty()) {
			if ("Read".equals(btn)) {

				String strId = request.getParameter("readtxt");

				try {
					conObj.setCountry_id(conDaoObj.readCountryByPk(strId).getCountry_id()); 
					conObj.setCountry_name(conDaoObj.readCountryByPk(strId).getCountry_name());
					conObj.setRegion_id(conDaoObj.readCountryByPk(strId).getRegion_id()); 
					
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
		
		CountryOutBean calOutBean = new CountryOutBean();
		calOutBean.setOperation(operation);
		calOutBean.setParameter1(param1);
		calOutBean.setParameter2(param2);
		calOutBean.setResult(result);
		//request.setAttribute("calOutBean",calOutBean);
		request.setAttribute("result",result);
		RequestDispatcher reqDisObj = request.getRequestDispatcher("view/CalciOutput.jsp");
		reqDisObj.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
