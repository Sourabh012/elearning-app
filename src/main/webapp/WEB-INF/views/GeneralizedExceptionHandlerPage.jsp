<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dan's Pizza</title>
</head>
<body bgcolor="lavender">
<center>
<h2 style='color:red'>Generalized Exception Handler Page</h2>
<hr>
Exception Occurred is : ${message}
<hr>
<div>
	<a href="${pageContext.request.contextPath}/home">Home</a>
</div>
</center>
</body>
</html>