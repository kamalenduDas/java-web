package project1validation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project1DefineStudent.Student;

public class stdValidation {
public static Student stdValidation(String iemail,String ipass){
    int cnt=0;
    Student ob = new Student();
    try{
        System.out.println("in try of stdvalidation");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
        //
        String url = "jdbc:sqlserver://localhost\\student:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("select * from student where email =? and password = ?");
    stmt.setString(1, iemail);
    stmt.setString(2, ipass);
    System.out.println("statement created");

    // execute stament
    ResultSet rslt = stmt.executeQuery();
    // process result set
    while(rslt.next()){
        System.out.println("in while of stdvalidation");
      cnt++;
      ob = new Student(rslt.getString("fname"),rslt.getString("lname"),rslt.getString("address1"),rslt.getString("address2"),
              rslt.getString("contact"),rslt.getString("email"),rslt.getString("password"),rslt.getInt("sem_no"),
              rslt.getInt("sem_marks"),rslt.getInt("su"),rslt.getString("dept_id"),
              rslt.getInt("college_id"),rslt.getString("std_reg"),"null");
    }
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    if(cnt >= 1){
        System.out.println("in if stdvalidation");
        return ob;
    }
    else 
        System.out.println("in else stdvalidation");
          ob = new Student(iemail,ipass,"invalid");
          return ob;
   }
 

public static Student stdValidation(String iemail){
    int cnt=0;
    Student ob = new Student();
    try{
        System.out.println("in try of stdvalidation");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
        //
        String url = "jdbc:sqlserver://localhost\\student:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("select * from student where email =?");
    stmt.setString(1, iemail);
    System.out.println("statement created");

    // execute stament
    ResultSet rslt = stmt.executeQuery();
    // process result set
    while(rslt.next()){
        System.out.println("in while of stdvalidation");
      cnt++;
      ob = new Student(rslt.getString("fname"),rslt.getString("lname"),rslt.getString("address1"),rslt.getString("address2"),
              rslt.getString("contact"),rslt.getString("email"),rslt.getString("password"),rslt.getInt("sem_no"),
              rslt.getInt("sem_marks"),rslt.getInt("su"),rslt.getString("dept_id"),
              rslt.getInt("college_id"),rslt.getString("std_reg"),"null");
    }
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    if(cnt >= 1){
        System.out.println("in if stdvalidation");
        return ob;
    }
    else 
        System.out.println("in else stdvalidation");
          ob = new Student(iemail,"invalid","invalid");
          return ob;
   }


public static int clgValidation(int clg_id,String clg_name){
     int cnt=0;
  try{
        System.out.println("in try of clgvalidation");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //
        String url = "jdbc:sqlserver://localhost:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("select * from college where clg_id =? or clg_name = ?");
    stmt.setInt(1, clg_id);
    stmt.setString(2, clg_name);
    System.out.println("statement created");

    // execute stament
    ResultSet rslt = stmt.executeQuery();
    // process result set
    while(rslt.next()){
        System.out.println("in while of clgvalidation");
      cnt++;
     
    }
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     System.out.println(cnt);  
     return cnt;
 }

public static int clgValidation(int clg_id){
     int cnt=0;
  try{
        System.out.println("in try of clgvalidation");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //
        String url = "jdbc:sqlserver://localhost:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("select * from college where clg_id =?");
    stmt.setInt(1, clg_id);
    System.out.println("statement created");

    // execute stament
    ResultSet rslt = stmt.executeQuery();
    // process result set
    while(rslt.next()){
        System.out.println("in while of clgvalidation");
      cnt++;
     
    }
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     System.out.println(cnt);  
     return cnt;
 }

public static int deptValidation(int clg_id,String dname){
     int cnt=0;
  try{
        System.out.println("in try of clgvalidation");
        //Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //
        String url = "jdbc:sqlserver://localhost:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("select * from dept where clg_id =? and dname = ?");
    stmt.setInt(1, clg_id);
    stmt.setString(2, dname);
    System.out.println("statement created");

    // execute stament
    ResultSet rslt = stmt.executeQuery();
    // process result set
    while(rslt.next()){
        System.out.println("in while of clgvalidation");
      cnt++;
     
    }
    
    } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     System.out.println(cnt);  
     return cnt;
 }
}
    

