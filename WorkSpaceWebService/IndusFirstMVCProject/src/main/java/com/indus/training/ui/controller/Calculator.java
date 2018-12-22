package com.indus.training.ui.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indus.training.ui.model.CalciOutBean;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
		
		CalciOutBean calOutBean = new CalciOutBean();
		calOutBean.setOperation(operation);
		calOutBean.setParameter1(param1);
		calOutBean.setParameter2(param2);
		calOutBean.setResult(result);
		request.setAttribute("calOutBean",calOutBean);
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
