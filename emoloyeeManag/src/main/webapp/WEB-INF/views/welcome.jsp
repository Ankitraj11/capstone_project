<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%                String string= (String)request.getAttribute("data");   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   
   <a href="./add">Add employee</a>
   
   <a href="./getForm">Get employee</a>
   <a href="./updateDetails">update employee</a>
   
   
   welcome <%=string %>
</body>
</html>