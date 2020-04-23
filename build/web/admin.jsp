 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN Page</title>
    </head>
    <body>
         <%@include file = "header.jsp" %>    
        <%@include file = "nav.jsp" %>
        <h1>Admin ${lastName}</h1>

        <a href ="adminServlet?todo=addNewEmployee">Add new worker</a>
        <p>
            <a href ="adminServlet?todo=addNewVehicle">Add new vehicle</a> 
        <p>
            <a href ="adminServlet?todo=seeVehicleList"> See vehicle list</a>
        <p>
             

        <form action="adminServlet" method="post">    
            <select name="role">
                <option value="admin">admin</option>
                <option value="manager">manager</option>
                <option value="driver">driver</option>
            </select>
            <input type="hidden" name="todo" value="seeEmployeeList">   
            <input type="submit" value="See workers list"> 

        </form>  
 <%@include file = "footer.jsp" %>    
 
    </body>
</html>
