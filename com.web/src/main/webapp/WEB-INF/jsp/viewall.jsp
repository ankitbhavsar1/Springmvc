<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <img src="./resources/img/Desert.jpg"> -->
<img src="<c:url value='/images/Desert.jpg' />"/>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>Em</th>
			<th>Edit</th>
			<td>Delete</td>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.address}</td>
				<td>${list.email}</td>
				<td><a href="edit.do?id=${list.id} ">Edit</td>
				<td><a href="delit.do?id=${list.id }" onclick=" return confirm(' You want to delete?')">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>