 

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

         <h1>History</h1>
              <%
                ArrayList<Order> list = (ArrayList<Order>) request.getAttribute("orderlist");
                for (Order item : list) {
                    int id = item.getOrder_id();
                    String cargo = item.getOrder_cargo();
             %>  
                <p><%=id%> <%=cargo%> </p>
            <% }%>
    </body>
</html>
