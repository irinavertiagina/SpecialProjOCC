<%-- 
    Document   : customer
    Created on : Apr 7, 2020, 1:12:18 PM
    Author     : irkin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer page</title>
    </head>
    <body>
        <h1>Hello customer!</h1>
          
        <p>name: ${lastName}</p> 
        
           <form action="orderServlet" method="post"> 
                <input type="hidden" name="todo" value="placeOrder">  
            <input type="submit" value="Place order">   
        </form> 
        
          <form action="orderServlet" method="post"> 
                <input type="hidden" name="todo" value="history">  
            <input type="submit" value="Order history">   
        </form> 
          
        
        
    </body>
</html>
