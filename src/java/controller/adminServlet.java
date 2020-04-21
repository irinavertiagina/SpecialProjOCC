 
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DBUtil;

 
public class adminServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        
                
                 
        
         String todo = request.getParameter("todo");
         String role = request.getParameter("role");
         String lname= request.getParameter("lastName");
         String fname = request.getParameter("firstName");
          String contact = request.getParameter("contact");
        String url = "";
        if(todo.equals(null)){
        url = "/error.jsp";
        }
        else if(todo.equals("addNewEmployee")){
        url = "/addEmployee.jsp";
         
        } 
         else if(todo.equals("empAdded")){
             DBUtil.addEmployee(role, lname, fname, contact);
        url = "/orderConfirm.jsp"; //test!
        } 
         else if(todo.equals("addNewVehicle")){
         url = "/addVehicle.jsp";
         }
          else if(todo.equals("vehicleAdded")){
             DBUtil.addVehicle();
        url = "/orderConfirm.jsp"; //test!
        }
        
        
        
         
             
//         request.setAttribute("role", role);
//          request.setAttribute("lastName", lastName);
//          person.setLastName(lastName);
//            session.setAttribute("person", person);
















         getServletContext().getRequestDispatcher(url)
                .forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
