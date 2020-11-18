<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage - Party Planner</title>
</head>
<body>

	<h1>Parties</h1>
	
	<ul><c:forEach items="${parties}" var="party">
		<li>${ party.getName() } - ${ party.getDate() }</li>
	</c:forEach></ul>
	
	<a href="/vote">Vote</a><br />
	<a href="/review">Review</a>

</body>
</html>