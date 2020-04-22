 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN Page</title>
    </head>
    <body>
        <h1>Hello admin</h1>

        <p>name: ${lastName}</p> 

        <p>Add new employee</p>
        <form action="adminServlet" method="post">    
            <input type="hidden" name="todo" value="addNewEmployee">  
            <input type="submit" value="Add new employee"> 
        </form>  

        <p>Add new vehicle</p>
        <form action="adminServlet" method="post">    
            <input type="submit" value="Add vehicle"> 
            <input type="hidden" name="todo" value="addNewVehicle">  
        </form>  

<p> <a href ="adminServlet?todo=seeVehicleList"> See vehicle list</a>

    </body>
</html>
