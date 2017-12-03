<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="updateuser.do?id=${list.id }" modelAttribute="Users" method="post" items="${list}"
				var="list">
		<table>
			<tr>
				<th>Name:</th>
				<td><f:input path="name" type="text" value="${list.name }"/></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><f:input path="address" type="text" value="${list.address }"/></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><f:input path="email" type="text" value="${list.email }"/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>