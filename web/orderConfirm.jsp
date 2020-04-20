 

<%@page import="java.util.ArrayList"%>
<%@page import="model.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <body>
          <% String id = (String)request.getAttribute("id"); %>
        <h1>Thank you <%=id%> have been placed/added</h1>
        <p>check status</p>
         <h1>History</h1>
               
    </body>
</html>
