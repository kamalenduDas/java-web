
package Project1Show;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project1DefineStudent.Student;
import project1validation.stdValidation;


public class showStudent {
    
    public static ArrayList showStudent(String clg_name,String dname){
    
        ArrayList <Student>stdlist = new ArrayList<Student>();
        int cnt=0;
    Student ob = new Student();
    try{
        System.out.println("in try of showStudent");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
       
        String url = "jdbc:sqlserver://localhost:1433;databaseName=training";
        
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    // use join error in sql sub query
    PreparedStatement stmt = conn.prepareStatement("select * from student where college_id =(select clg_id from college where clg_name = ?)"
                                                + " and dept_id = (select dept_id from dept where dname =? and "
                                                + "clg_id = (select clg_id from college where clg_name = ?))");
    stmt.setString(1, clg_name);
    stmt.setString(2, dname);
    stmt.setString(3, clg_name);
    System.out.println("statement created");

    // execute stament
    ResultSet rslt = stmt.executeQuery();
    // process result set
    while(rslt.next()){
        System.out.println("in while of showStudent");
      cnt++;
      ob = new Student(rslt.getString("fname"),rslt.getString("lname"),rslt.getString("address1"),rslt.getString("address2"),
              rslt.getString("contact"),rslt.getString("email"),rslt.getString("password"),rslt.getInt("sem_no"),
              rslt.getInt("sem_marks"),rslt.getInt("su"),rslt.getString("dept_id"),
              rslt.getInt("college_id"),rslt.getString("std_reg"),"null");
      
      stdlist.add(ob);
        
      System.out.println(ob.getFName());
    }
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
        return stdlist;
    
 
    }
    
 }
    
    

