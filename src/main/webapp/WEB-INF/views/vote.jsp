<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vote</title>
</head>
<body>

	<h1>Vote</h1>
	
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
				<td><a href="/addvote/${ partyoption.getId() }">add vote</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table><br /><br /><br />
	
	<form method="post" action="/newpizza">
	<h3>Add new Pizza</h3>
	Name: <input type="text" name="name" id="name" />
	Description: <input type="text" name="description" id="description" />
	
	<input type="submit">
	</form>

</body>
</html>