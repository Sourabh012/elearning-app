<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Order within Bill Range Report</h2>
<form:form method="POST" modelAttribute="pizzaBill" action="orderreport.html">
	<table border="2">
		<tr>
			<td>From Price :</td>
			<td><form:input  path="fromPrice" /></td>

			<td>To Price :</td>
			<td><form:input  path="toPrice"/></td>
		</tr>
		<tr>
			<td colspan="3"><input style="margin-left: 50%" type="submit"  value="FetchDetails"></td>
		</tr>
	</table>
</form:form>
<br>
<br>
<c:if test="${not empty pizzaReportList}">
		<table border="1">
			<tr>
				<th>Order Id</th><th>Customer Name</th><th>Customer Number<th>Pizza Id</th><th>Bill</th><th>Quantity</th>
			</tr>
			<c:forEach var="pizzaOrder" items="${pizzaReportList}">
				<tr>
				<td>${pizzaOrder.orderId}</td>
				<td>${pizzaOrder.customerName}</td>
				<td>${pizzaOrder.customerNumber}</td>
				<td>${pizzaOrder.pizzaId}</td>
				<td>${pizzaOrder.bill}</td>
				<td>${pizzaOrder.quantity}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
<div>
	<a href="${pageContext.request.contextPath}/home">Home</a>
</div>

</center>
</body>
</html>