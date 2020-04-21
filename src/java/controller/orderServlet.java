 
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DBUtil;
 import model.Order;
import model.Person;

 
public class orderServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
          HttpSession session = request.getSession();
         String lastName = request.getParameter("lastName");
         String role = request.getParameter("role");
            
         
        String date = request.getParameter("date");
        String cargo = request.getParameter("cargo");
        String location = request.getParameter("location");
        String dest = request.getParameter("destination");
                 
        
        Person person = (Person) session.getAttribute("person");
        if (person == null) {
            person = new Person();
        }
   //see history
        String todo = request.getParameter("todo");
           
         ArrayList<Order> list = DBUtil.getOrderHistory();
        request.setAttribute("orderlist", list);
        
        
         if(todo.equals("history")){
         this
                 .getServletContext()
                 .getRequestDispatcher("/history.jsp")
                 .forward(request, response); 
        }
       ////////////////////////////////// 
        
       
       //place new order
       
        
     
        if(todo.equals("placeOrder")){
                
        DBUtil.placeOrder(date, cargo, location, dest);
         this
                 .getServletContext()
                 .getRequestDispatcher("/placeNewOrder.jsp")
                 .forward(request, response); 
        }
        ///////////////////
        
        //confirm order placed succesfull
        if(todo.equals("orderPlaced")){
                   

         this
                 .getServletContext()
                 .getRequestDispatcher("/orderConfirm.jsp")
                 .forward(request, response); 
        }
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
