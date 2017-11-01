<%-- 
    Document   : suViewByFilter
    Created on : 30 Jul, 2017, 7:51:35 PM
    Author     : mrrobot
--%>

 <%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Super User View By Filtering College & Department</title>
    </head>
    <body style="background-color: cadetblue" >
        <h2 STYLE="text-align: center; font-family: serif"><u>CHOOSE COLLEGE & DEPARTMENT TO FILTER DATA</u></h2>
        <br><br><br>

         <form style="text-align: center" action="updateServlet" method="post">
        
                     
<%ResultSet resultset =null;%>
<%ResultSet resultsetD =null;%>


<%
    try{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
Connection connection = 
         DriverManager.getConnection
            ("jdbc:sqlserver://localhost:1433;databaseName=training","SA","Bxy.12hjxd");

       Statement statement = connection.createStatement() ;

       resultset =statement.executeQuery("select * from college") ;
       
%>

<h3 style="font-family: cursive"> College</h3>
<select id="college" name="clg_name">
        <%  while(resultset.next()){ %>
            <option><%= resultset.getString(2)%></option>
        <% } %>
       </select>
<%
//**Should I input the codes here?**
        }
        catch(Exception e)
        {
             out.println("wrong entry"+e);
        }
%>


<%
try{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
Connection conn = 
         DriverManager.getConnection
            ("jdbc:sqlserver://localhost:1433;databaseName=training","SA","Bxy.12hjxd");

       Statement stmt = conn.createStatement() ;

       resultsetD =stmt.executeQuery("select * from dept") ;
       
%>


    <h3 style="font-family: cursive"> Dept</h3>
    <select id="Dept" name="dname">
        <%  while(resultsetD.next()){ %>
            <option><%= resultsetD.getString(2)%></option>
        <% } %>
       </select>

<%
//**Should I input the codes here?**
        }
        catch(Exception e)
        {
             out.println("wrong entry"+e);
        }
%>


   
             <input type="hidden" value="filter" name="scrt">
            <input type="submit" value="Submit">
       </form> 
    </body>
</html>
