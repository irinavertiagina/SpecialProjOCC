 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Place an order</title>
    </head>
    <body>
         <form action="orderServlet" method="post">    
           
            <p>Date
            <input type="text" name="date"   >    
            </p>
            <p>Cargo
            <input type="text" name="cargo"  > 
            <p>
            <p>Origin location
            <input type="text" name="location"  > 
            <p>
            <p>Destination
            <input type="text" name="destination"  > 
            <p>            
             <input type="hidden" name="todo" value="orderPlaced"> 
             <input type="submit" value="Place order"> 
        </form> 
     </body>
</html>
