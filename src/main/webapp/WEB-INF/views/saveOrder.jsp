<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Details</h1>
<form:form method="POST" modelAttribute="pizzaReport" action="processform.html">
	<table border="2">
		<tr>
			<td>Customer Name :</td>
			<td><form:input path="customerName" /></td>
			<td><form:errors path="customerName" cssClass="error"/></td>
		</tr>
		
		<tr>
			<td>Customer Number :</td>
			<td><form:input path="customerNumber"/></td>
			 <td><form:errors path="customerNumber" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Pizza Name :</td>
			<td><form:select path="pizzaId">
				<form:option value="0" label="--Select--" />
				<form:options items="${pizzaListDone}"/> <!-- 1st check this out for dynamic drop down  change to countryListSameNameAndValue and observe-->
			</form:select></td>
			<%-- <td><form:errors path="pizzaId" cssClass="error"/></td> --%>
		</tr>
		<tr>
			<td>Quantity :</td>
			<td><form:input path="quantity" /></td>
			<td><form:errors path="quantity" cssClass="error"/></td>
		</tr>

		<tr>
			<td colspan="3"><input type="submit" value="Register"></td>
		</tr>
	</table>
	
	<div>
	<spring:hasBindErrors name="pizzaReport">
		<h2>All Errors</h2>
		<form:errors path="*" cssClass="error"/>
	</spring:hasBindErrors>
</div>
</form:form>


</body>
</html>