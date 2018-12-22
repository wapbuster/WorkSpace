<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calci Project</title>
</head>
<body>
	<h1>Calculator</h1>
	<form action="../Calculator">
		<br> <label>Parameter 1 : </label> <input type="text"
			name="param1" /> <br> <label>Parameter 2 : </label> <input
			type="text" name="param2" /> <br> <label>Operation : </label> <br>
		<label>Addition</label> <input type="radio" name="operation"
			value="addition" /> <br> <label>Subtract</label> <input
			type="radio" name="operation" value="subtract" /> <br> <label>Multiply</label>
		<input type="radio" name="operation" value="multiply" /> <br> <label>Division</label>
		<input type="radio" name="operation" value="division" /> <br> <input
			type="submit" value="Calculate" />
	</form>
</body>
</html>