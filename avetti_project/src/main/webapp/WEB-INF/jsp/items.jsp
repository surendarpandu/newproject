<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>items Menu</title>
</head>
<body>
<h1>items list</h1>
<form action="items.do" method="post" commandName="item">
<table>
     <tr>
        <td>itemId</td>
        <td><form input path="itemId"/></td>
      </tr>
     <tr>
        <td>vId</td>
        <td><form input path="vId"/></td>
      </tr>
      
     <tr>
        <td>itemCode</td>
        <td><form input path="itemCode"/></td>
      </tr>
      
     <tr>
        <td>itemTitle</td>
        <td><form input path="itemTitle"/></td>
      </tr>
      <tr>
        <td>itemDesc</td>
        <td><form input path="itemDsc"/></td>
        
      </tr>
      <tr>
        <td>itemImage</td>
        <td><form input path="itemImage"/></td>
      </tr>
</table>
</form>

</body>
</html>