<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<spring:url value="/items/add" var="addurl" />
	<a href="${addurl}">Add</a>
	<table width="400%" border="1">
		<tr>
			<td>${items.itemImage}</td>
			<td>${items.itemId}</td>
			<td>${items.vId}</td>
			<td>${items.itemCode}</td>
			<td>${items.itemTitle}</td>
			<td>${items.itemdesc}</td>
			<td><spring:url value="/items/update${items.itemId}" var="updateurl" />
				<a href="${editurl}">Edit</a></td>
			<td><spring:url value="/items/delete${items.itemId}"
					var="deleteurl" /> <a href="${deleteurl}">delete</a></td>
		</tr>

	</table>



</body>
</html>