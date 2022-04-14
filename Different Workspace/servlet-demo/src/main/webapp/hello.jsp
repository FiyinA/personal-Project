<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello, JSP!</title>
</head>
<body>
	<h1> Hello, JSP!</h1>
	<hr>
	<p>Developed by Fiyin </p>
	<form action="">
		Enter your name:
		<input type="text" name="your_name">
		<button>Submit</button>
	</form>
	<%
		String name = request.getParameter("your_name");
		if(name!=null){
			out.println("<h3>Hello,"+name+"</h3>");
		}
	%>
</body>
</html>