
package project1Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import project1DefineStudent.Student;
import static project1DefineStudent.stdInsertion.stdInsertion;
import static project1validation.stdValidation.stdValidation;

public class Servlet1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        System.out.println("in servlet1");
        
         Student ob = new Student();     
                 
        
          String email= request.getParameter("email");
          String pass = request.getParameter("pass");
                  
   
          
          if(email.trim().isEmpty() && pass.trim().isEmpty()){              
                    request.setAttribute("errmsg", "Plese Provide Valid Credentials");
                    request.getRequestDispatcher("index.jsp").forward(request, response);         
                  }
           
             ob = stdValidation(email,pass);
            
        
             if(ob.err.matches("invalid")){
                    request.setAttribute("errmsg", "Plese Provide Valid credentials");
                    request.getRequestDispatcher("index.jsp").forward(request, response); 
              }
           
             if(ob.getSu() == 0){
             //creating session attribute
                     HttpSession session = request.getSession();
                     session.setAttribute("stdob", ob);
              //sending to show of student data
                     request.setAttribute("obj", ob);
                      request.getRequestDispatcher("showTab.jsp").forward(request, response);
             }
             
             
             
             else{
             
                    HttpSession session = request.getSession();
                    session.setAttribute("stdob", ob);
             
                      request.setAttribute("obj", ob);
                      request.getRequestDispatcher("suDash.jsp").forward(request, response);
                 }  

           }
          
              
    
     

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Servlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Servlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

