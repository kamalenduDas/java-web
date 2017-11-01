package project1Servlet;

import static Project1Show.showStudent.showStudent;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import project1DefineStudent.Student;
import static project1DefineStudent.stdInsertion.clgInsertion;
import static project1DefineStudent.stdInsertion.deptInsertion;
import static project1DefineStudent.stdInsertion.stdInsertion;
import static project1Helper.IsInteger.isInteger;
import static project1validation.stdUpdation.stdUpdation;
import static project1validation.stdValidation.clgValidation;
import static project1validation.stdValidation.deptValidation;
import static project1validation.stdValidation.stdValidation;



public class updateServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("in updateServlet");
       
        Student ob = new Student();      
         
        ArrayList <Student>al = new ArrayList<Student>();        
          
         String scrt= request.getParameter("scrt");  
          
          if(scrt.matches("filter")){
              System.out.println("coming from suViewByFilter");
              
              String clg_name= request.getParameter("clg_name");
              String dname= request.getParameter("dname");
              System.out.println(clg_name+dname);
               if(clg_name.matches("all") && dname.matches("all")){
                     request.getRequestDispatcher("suView.jsp").forward(request, response);
                      }
              
                  else{
                      
                      al=showStudent(clg_name,dname);
                      request.setAttribute("list", al);
                      request.getRequestDispatcher("suFilterResult.jsp").forward(request, response);
                  }
        
              
          }
          
          if(scrt.matches("suInsertDept")){
              System.out.println("working for suinsert");
              
              if(isInteger(request.getParameter("clg_id"))){
                  
              
              int clg_id= Integer.parseInt(request.getParameter("clg_id"));              
              String dname= request.getParameter("dname").trim();
              String dept_id= request.getParameter("dept_id").trim();
                
                   if(deptValidation(clg_id,dname) >= 1){
//                    
                   System.out.println("dept exists");
                   request.setAttribute("msg","Department Already Exists In The College !!");
                   request.getRequestDispatcher("suInsert.jsp").forward(request, response);
              
                  }
              
                   else{
                      deptInsertion(dept_id,dname,clg_id);
                     System.out.println("inserted");
                     request.setAttribute("msg","Successfully Inserted Department $'" + dname + "'$ with Department Id $'" + dept_id +"'$ ");
                     request.getRequestDispatcher("suInsert.jsp").forward(request, response);     
                   
                   
                   
                   }
              }
              else{
                  request.setAttribute("msg", "Invalid Datatype In Numeric Field Of Department !! Press Back button to go to previous page");
                      request.getRequestDispatcher("suInsert.jsp").forward(request, response);
              
              
                }
          }
          
          else if(scrt.matches("suInsert")){
             if(isInteger(request.getParameter("clg_id"))){ 
              
              int clg_id= Integer.parseInt(request.getParameter("clg_id"));              
              String clg_name= request.getParameter("clg_name").trim();
              
              System.out.println("working as it should be");
               
              if(clgValidation(clg_id,clg_name) >= 1){
//                    
                   System.out.println("college exists");
                   request.setAttribute("msg","College Already Exists !!");
                   request.getRequestDispatcher("suInsert.jsp").forward(request, response);
               }
              else {
                     clgInsertion(clg_id,clg_name);
                     System.out.println("inserted");
                     request.setAttribute("msg","Successfully Inserted College $'" + clg_name + "'$ with Id $'" + clg_id +"'$ "+
                             " Now Insert Department values");
                     request.getRequestDispatcher("suInsert.jsp").forward(request, response);
                
                    }
          
              }
               else{  
                    request.setAttribute("msg", "Invalid Datatype In Numeric Field Of College !! Press Back button to go to previous page");
                      request.getRequestDispatcher("suInsert.jsp").forward(request, response);
                    }
             
             }
          
          if(scrt.matches("logout")){
                  HttpSession session=request.getSession();  
                  session.invalidate();  
                  request.setAttribute("errmsg", "You Are Successfully Logged Out");
                  request.getRequestDispatcher("index.jsp").forward(request, response);
          
          }
               
            
        
        else if(scrt.matches("new")){
            String sNo = request.getParameter("semNo");
            String sMarks = request.getParameter("semMarks");
            String cId = request.getParameter("clgId");
            if(isInteger(sNo) && isInteger(sMarks) && isInteger(cId)){
            
          String fname= request.getParameter("fname").trim().toUpperCase();
          String lname= request.getParameter("lname").trim().toUpperCase();
          String address1 = request.getParameter("address1").trim().toUpperCase();
          String address2 = request.getParameter("address2").trim().toUpperCase();
          String contact = request.getParameter("contact").trim();
          String email= request.getParameter("email").trim();
          String pass = request.getParameter("pass").trim();          
          int semNo = Integer.parseInt(request.getParameter("semNo"));
          int semMarks = Integer.parseInt(request.getParameter("semMarks"));
          String deptId= request.getParameter("deptId").trim();
          int clgId = Integer.parseInt(request.getParameter("clgId"));
          String stdReg= request.getParameter("stdReg").trim();
          
          ob = stdValidation(email);
           
          if(ob.err.matches("null")){
          request.setAttribute("sccs", "STUDENT EMAIL ALREADY EXISTS");
                  request.getRequestDispatcher("RegisterNow.jsp").forward(request, response);
          
          } 
          
         else if(fname.isEmpty() || email.isEmpty() || pass.isEmpty() || deptId.isEmpty()){
                  request.setAttribute("sccs", "Please Provide Valid Data");
                  request.getRequestDispatcher("RegisterNow.jsp").forward(request, response);
                 }
          
                else{
                       ob = stdInsertion(fname,lname,address1,address2,contact,email,pass,semNo,semMarks,deptId,clgId,stdReg);
                       
                        System.out.println("in first new");
                    request.setAttribute("sccs", "INSERTION SUCCESSFUL");
                    request.setAttribute("obj", ob);
                    request.getRequestDispatcher("showTab.jsp").forward(request, response);
                     }
          
            }
                 else{
                          request.setAttribute("data", "Invalid Datatype In Numeric Field ! Press Back button to go to previous page");
                           request.getRequestDispatcher("RegisterNow.jsp").forward(request, response);
            
                       }
         }
        else{
                HttpSession session = request.getSession();
                Student s_ob = (Student)session.getAttribute("stdob");
        
//        response.setContentType("text/html;charset=UTF-8");
        
               String iemail = s_ob.getEmail();
               String sNo = request.getParameter("semNo");
            String sMarks = request.getParameter("semMarks");
            String cId = request.getParameter("clgId");
          
               if(isInteger(sNo) && isInteger(sMarks) && isInteger(cId)){
              
               
          String fname= request.getParameter("fname").trim().toUpperCase();
          String lname= request.getParameter("lname").trim().toUpperCase();
          String address1 = request.getParameter("address1").trim().toUpperCase();
          String address2 = request.getParameter("address2").trim().toUpperCase();
          String contact = request.getParameter("contact").trim();
          String email= request.getParameter("email").trim();
          String pass = request.getParameter("pass").trim();
          
          int semNo = Integer.parseInt(request.getParameter("semNo"));
          int semMarks = Integer.parseInt(request.getParameter("semMarks"));
          int su = Integer.parseInt(request.getParameter("su"));
          String deptId= request.getParameter("deptId").trim().toUpperCase();
         int clgId = Integer.parseInt(request.getParameter("clgId"));
          String stdReg= request.getParameter("stdReg").trim().toUpperCase();
      
               
       ob = stdUpdation(fname,lname,address1,address2,contact,email,pass,semNo,semMarks,su,deptId,clgId,stdReg,s_ob.getEmail());
              
                
                
               if(ob.getFName()!= "null"){
               request.setAttribute("sccs", "Credentials Updation Successful");
               request.setAttribute("obj",ob );
               request.getRequestDispatcher("showTab.jsp").forward(request, response);
               System.out.println("updated");
              }
           }else{
                  request.setAttribute("sccs", "Invalid Datatype In Numeric Field ! Press Back button to go to previous page");
                  request.getRequestDispatcher("showTab.jsp").forward(request, response);
               
               }
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
    }

}
