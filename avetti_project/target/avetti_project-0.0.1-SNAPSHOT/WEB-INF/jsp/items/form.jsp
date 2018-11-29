<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form</title>
</head>
<body>
<spring:url value="/items/edit" var="saveurl"/>
<form:form action="" method="POST" modelAttribute="itemsform"/>
<form:hidden path="itemId"/>
<table>

<tr>
<td>Item-Id:</td><td><form:input path="itemId"/>
</tr>

<tr>
<td>Item-code:</td><td><form:input path="itemCode"/>
</tr>

<tr>
<td>Item-Title:</td><td><form:input path="itemTitle"/>
</tr>

<tr>
<td>Item-Description:</td><td><form:textarea path="itemdesc" rows="4"/>
</tr>

<tr><td><button  type="submit">save</button></td></tr>





</table>
</body>
</html>