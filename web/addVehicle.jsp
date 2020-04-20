 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add vehicle</title>
    </head>
    <body>
       <p>Add new vehicle</p>
        <form action="adminServlet" method="post">    
            <input type="submit" value="Add vehicle"> 
            
            <input type="hidden" name="todo" value="vehicleAdded">  
        </form>
    </body>
</html>
