<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<jsp:useBean id="calOutBean" 
	class="com.indus.training.ui.model.CalciOutBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Calculator Result</h1>
	<label>Param1 :</label><%=request.getParameter("param1")%><br>
	<label>Param2 :</label><%=request.getParameter("param2")%><br>
	<label>Operation :</label><%=request.getParameter("operation")%><br>
	<label>Result :</label><%=request.getAttribute("result")%><br>

	<h1>Calculator Result Using Use Bean</h1>
	<label>Param1 :</label><%=calOutBean.getParameter1()%><br>
	<label>Param2 :</label><%=calOutBean.getParameter2()%><br>
	<label>Operation :</label><%=calOutBean.getOperation()%><br>
	<label>Result :</label><%=calOutBean.getResult()%><br>
	
	<h1>Calculator Result Using EL</h1>
	<label>Param1 :</label>${calOutBean.getParameter1}<br>
	<label>Param2 :</label>${calOutBean.getParameter2}<br>
	<label>Operation :</label>${calOutBean.operation}<br>
	<label>Result :</label>${calOutBean.result}<br>

	<a href="view/CalciInput.jsp"> Go to input page</a>

</body>
</html>