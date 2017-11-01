
package project1DefineStudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project1validation.stdValidation;


public class stdInsertion {
    public static Student stdInsertion(String fname,String lname,String address1,String address2,String contact,String email,String pass,int semNo,
            int semMarks,String deptId,int clgId,String stdReg){
        
        System.out.println("called stdInsertion & in it");
    Student ob = new Student();
    try{
        System.out.println("in try of stdInsertion");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
        //
        String url = "jdbc:sqlserver://localhost\\student:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        System.out.println("after execution of prep stmt");
    stmt.setString(1, fname);
    stmt.setString(2, lname);
    stmt.setString(3, address1);
    stmt.setString(4, address2);
    stmt.setString(5, contact);
    stmt.setString(6, email);
    stmt.setString(7, pass);
    stmt.setInt(8, semNo);
    stmt.setInt(9, semMarks);
    stmt.setInt(10, 0);
    stmt.setString(11, deptId);
    stmt.setInt(12, clgId);
    stmt.setString(13, stdReg);
   
    System.out.println("statement created");

    // execute stament
     stmt.executeUpdate();
    
      ob = new Student(fname,lname,address1,address2,contact,email,pass,semNo,semMarks,0,deptId,clgId,stdReg,"null");  
    
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        System.out.println("returning ob from insertion");
          return ob;
   }
    
    
    public static void clgInsertion(int clg_id,String clg_name){
      try{
        System.out.println("in try of stdInsertion");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
        //
        String url = "jdbc:sqlserver://localhost:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("insert into college values(?,?)");
        System.out.println("after execution of prep stmt");
        stmt.setInt(1, clg_id);
        stmt.setString(2, clg_name);
   
    System.out.println("statement created");

    // execute stament
     stmt.executeUpdate();
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    public static void deptInsertion(String dept_id,String dname,int clg_id){
      try{
        System.out.println("in try of deptInsertion");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
        //
        String url = "jdbc:sqlserver://localhost:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("insert into dept values(?,?,?)");
        System.out.println("after execution of prep stmt");
        stmt.setString(1,dept_id);
        stmt.setString(2, dname);
        stmt.setInt(3, clg_id);
   
    System.out.println("statement created");

    // execute stament
     stmt.executeUpdate();
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    }
}
