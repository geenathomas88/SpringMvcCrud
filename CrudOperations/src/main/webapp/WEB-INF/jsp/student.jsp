<%@include file="includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="student.do" method="POST" commandName="student">
	<table>
		<tr>
			<td>Student Id</td>
			<td><form:input path="studentId"/></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><form:input path="firstname"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><form:input path="lastname"/></td>
		</tr>
		<tr>
			<td>Year Level</td>
			<td><form:input path="yearlevel"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" name="action" value="Add"/>
			<td colspan="2"><input type="submit" name="action" value="Edit"/>
			<td colspan="2"><input type="submit" name="action" value="Delete"/>
			<td colspan="2"><input type="submit" name="action" value="Search"/>
		</tr>
	</table>
</form:form>

<table border="1">
	<th>Student ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Year Level</th>
	<c:forEach items="${ studentList}" var="student">
		<tr>
			<td>${student.studentId}</td>
			<td>${student.firstname}</td>
			<td>${student.lastname}</td>
			<td>${student.yearlevel}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>