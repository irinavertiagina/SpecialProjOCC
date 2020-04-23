 
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Person;

 
public class MainServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          HttpSession session = request.getSession();
         String lastName = request.getParameter("lastName");
         String role = request.getParameter("role");
                 
        
        Person person = (Person) session.getAttribute("person");
        if (person == null) {
            person = new Person();
        }
        
        
        String url = "";
        if(role.equals(null)){
        url = "/error.jsp";
        }
        
        else if(role.equals("admin")){
        url = "/admin.jsp";
        
        } 
        else if(role.equals("customer")){
        url = "/customer.jsp";
        }
        
        
         
             
         request.setAttribute("role", role);
          request.setAttribute("lastName", lastName);
          person.setLastName(lastName);
            session.setAttribute("person", person);


         getServletContext().getRequestDispatcher(url)
                .forward(request, response);
        
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
