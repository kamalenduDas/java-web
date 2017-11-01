<%-- 
    Document   : suInsert
    Created on : 29 Jul, 2017, 10:44:06 AM
    Author     : mrrobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New College / Department  Insert</title>
    </head>
   
    <body style="background-color: #006666">
        <h2 style="text-align: center; font-family: cursive"><u>INSERT NEW COLLEGE / DEPARTMENT</u></h2>
        
        
        <h3 style="text-align: center; font-size: initial; color:  #00cc66 ">INSERT COLLEGE</h3>
        <br>
        <form style="text-align: center" action="updateServlet" method="post">
            <input type="text" placeholder="College Name (eg:abc)" name="clg_name" required>
              <br></br>
            <input type="text" placeholder="College ID (eg:123)" name="clg_id" required>
              <br>
            <input type="hidden" value="suInsert" name="scrt">
               <br>
            <input type="submit" value="Insert">
            
        </form>
        <br>
        <div style="color: #99ffff; text-align: center">${msg} </div>
            <br><br>
            <h3 style="text-align: center; font-size: initial; color:  #00cc66 ">INSERT DEPARTMENT</h3>
                 <br>
        <form style="text-align: center" action="updateServlet" method="post">
            <input type="text" placeholder="Department Name (eg:abc)" name="dname" required>
            <br></br>
            <input type="text" placeholder="Department ID (eg:abc2)" name="dept_id" required>
            <br></br>
            <input type="text" placeholder="College ID (eg:123)" name="clg_id" required>
            <br>
            <input type="hidden" value="suInsertDept" name="scrt">
            <br>
            <input type="submit" value="Insert">
            
        </form>
                 <br><br><br>
                 <form style="text-align: center" action="updateServlet">
                <input type="hidden" value="logout" name="scrt"> 
              <input type="submit" value="LOG OUT">
          </form>
        
    </body>
</html>
