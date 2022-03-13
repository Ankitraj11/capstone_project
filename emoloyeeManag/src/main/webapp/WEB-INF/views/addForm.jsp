<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String errormsg = (String) request.getAttribute("error");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (msg!= null && !msg.isEmpty()) {
	%>
	<h1>
		<%=msg%></h1>

	<%
	}
	%>

	<%
	if (errormsg != null && !errormsg.isEmpty()) {
	%>
	<h1>
		<%=errormsg%>
	</h1>
	<%
	}
	%>

	



	<form action="./add" method="post">
		<table>

			<tr>
				<td>name</td>
				<td><input type="text" name="name"></td>
			</tr>

<tr>
				<td>address</td>
				<td><input type="text" name="address"></td>
			</tr>

<tr>
				<td>email</td>
				<td><input type="text" name="email"></td>
			</tr>

<tr>
				<td>password</td>
				<td><input type="text" name="password"></td>
			</tr>



		</table>
		<input type="submit" value="add">
	</form>

</body>
</html>