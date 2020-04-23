 

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
                for (Order i : list) {
                    int id = i.getOrder_id();
                    String cargo = i.getOrder_cargo();
                    String date = i.getOrder_start_date();
                    String loc = i.getOrder_location();
                    String dest = i.getOrder_destination();
             %>  
                <p><%=date%> <%=cargo%> <%=loc%> <%=dest%> </p>
            <% }%>
    </body>
</html>
