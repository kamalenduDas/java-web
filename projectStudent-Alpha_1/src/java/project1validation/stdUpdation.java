/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1validation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project1DefineStudent.Student;

/**
 *
 * @author mrrobot
 */
public class stdUpdation {
    public static Student stdUpdation(String fname,String lname,String address1,String address2,String contact,String email,String pass,int semNo,
            int semMarks,int su,String deptId,int clgId,String stdReg,String iemail){
    int cnt=0;
        Student ob = new Student();
    try{
        System.out.println("in try of stdUpdation");
       // Using the sqljdbc.jar class library, applications must first register the driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("class forname");
        //
        String url = "jdbc:sqlserver://localhost\\student:1433;databaseName=training";
        System.out.println("url");
   
        
    //create connectin 
    Connection conn = DriverManager.getConnection(url, "SA", "Bxy.12hjxd");
    
    // prepare sql statement
    PreparedStatement stmt = conn.prepareStatement("update student set fname= ?,lname = ?,address1 = ?,address2 = ?,contact = ?,"
            + "email = ?,password = ?,sem_no = ?,sem_marks = ?,su = ?,dept_id = ?,college_id = ?,std_reg = ? where email = ?");
    stmt.setString(1, fname);
    stmt.setString(2, lname);
    stmt.setString(3, address1);
    stmt.setString(4, address2);
    stmt.setString(5, contact);
    stmt.setString(6, email);
    stmt.setString(7, pass);
    stmt.setInt(8, semNo);
    stmt.setInt(9, semMarks);
    stmt.setInt(10, su);
    stmt.setString(11, deptId);
    stmt.setInt(12, clgId);
    stmt.setString(13, stdReg);
    stmt.setString(14, iemail);
    System.out.println("create statment");

    // execute stament
    stmt.executeUpdate();
        System.out.println("after rslt execute query");
   
      
     ob = new Student(fname,lname,address1,address2,contact,email,pass,semNo,semMarks,0,deptId,clgId,stdReg,"null");
      
    
    
    }   
      catch (ClassNotFoundException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           } 
    
       catch (SQLException ex) {
        Logger.getLogger(stdValidation.class.getName()).log(Level.SEVERE, null, ex);
           }
    
    
        System.out.println("in last line of stdUpdation");
//        System.out.println(ob.getFName());
//        System.out.println(ob.getEmail());
//        System.out.println(ob.getPass());
        return ob;
    
   }
 
    
    } 
    

