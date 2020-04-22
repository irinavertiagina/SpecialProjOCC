 

<%@page import="model.Vehicle"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
          
                
                ArrayList<Vehicle> vList = (ArrayList<Vehicle>) request.getAttribute("vList");
                for (Vehicle i : vList) {
                    int id = i.getId();
                    int driver = i.getDriverId();
                    int status = i.getStatus();
                    //String status = i.getStatus();
                    String service = i.getServiceDate();
                    String info = i.getInfo();
                    String driverName = i.getDriverName();
             %>  
                <p>ID: <%=id%> 
                   STATUS: <%=status%> 
                  DRIVER : <%=driverName%>
                   INFO: <%=info%> 
                   NEXT SERVICE DATE: <%=service%>  </p>
            <% }%>
    </body>
</html>
