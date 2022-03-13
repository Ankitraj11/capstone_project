<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%Integer id=(Integer)request.getAttribute("data");
      String msg=(String)request.getAttribute("msg");
      String error=(String)request.getAttribute("errror");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% if(msg!=null  && !msg.isEmpty()){%>
	<h1><%=msg %></h1>
	
<% }%>

   <%if(error!=null && !error.isEmpty()){%>
      <h1><%=error %></h1>
      
   
   
  <% }%> 
  <form action="./updateDetails" method="post">
  
      <table>
       <tr>
           
        <td>
          id
        
        </td>
           <td>
           
           <input type="text" name="id" value=<%=id%> readonly="readonly" >
           </td>
      </tr>
      
      
      <tr>
           
        <td>
          email
        
        </td>
           <td>
           
           <input type="text" name="email" >
           </td>
      </tr>
       <tr>
        <td>
          password
        
        </td>
           <td>
           
           <input type="text" name="password" >
           </td>
      </tr>
       <tr>
        <td>
          name
        
        </td>
           <td>
           
           <input type="text" name="name" >
           </td>
      </tr>
       <tr>
        <td>
          addess
        
        </td>
           <td>
           
           <input type="text" name="address" >
           </td>
      </tr>
      
         
      
      </table>
  
       <input type="submit" value="update" >
  </form>  
   

</body>
</html>