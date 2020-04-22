 

<%@page import="java.util.ArrayList"%>
<%@page import="model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
                ArrayList<Person> list = (ArrayList<Person>) request.getAttribute("empList");
                for (Person i : list) {
                    int id = i.getId();
                    String fname = i.getFirstName();
                    String lname = i.getLastName();
             %>  
                <p><%=id%> <%=fname%> <%=lname%> </p>
            <% }%>
    </body>
</html>
