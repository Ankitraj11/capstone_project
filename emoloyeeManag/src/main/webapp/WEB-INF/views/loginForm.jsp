<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% String err=(String)request.getAttribute("errMsg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(err!=null && !err.isEmpty()){ %>

     <h1><%=err %></h1>  

<%} %>

	<form action="./login" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="number" name="id"></td>
			</tr>

			<tr>
				<td>password</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>

				<td><input type="submit" value="login"></td>

			</tr>

		</table>
	</form>


</body>
</html>