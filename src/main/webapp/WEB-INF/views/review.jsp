<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Review</title>
</head>
<body>

	<h1>Review</h1>
	
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Votes</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="partyoption" items="${ partyoptions }">
			<tr>
				<td>${ partyoption.getName() }</td>
				<td>${ partyoption.getDescription() }</td>
				<td>${ partyoption.getVotes() }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table><br /><br /><br />

</body>
</html>