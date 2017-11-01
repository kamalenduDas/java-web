<%-- 
    Document   : project1_login
    Created on : 16 Jul, 2017, 11:40:35 AM
    Author     : mrrobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Login</title>
    </head>
      <body style="background-color: royalblue">
          <br><br><br>
         <u><h2 style="text-align: center; font-family: serif;font-weight: inherit">WELCOME TO STUDENT DATABASE </h2></u>
          <br><br><br><br>
          <!--<h2 style="text-align: center; font-family: serif;font-weight: inherit">WELCOME TO STUDENT DATABASE </h2>-->
        <h3 style="text-align:center;font-family: cursive;font-weight: bold"> Proceed To Login</h3>
        
        <form style="text-align:center;" action="Servlet1" method="post">
           <!--<div style="color: #FF0000;">${errmsg}</div>-->
            <br>
          <input type="email" placeholder="email"  name="email"required><br>
            <br>
          <input type="password" placeholder="password" name="pass"required><br>
          <br>
          <input type="submit" value="LOGIN">
          <br></br>
           </form>
             <form style="text-align: center" action="RegisterNow.jsp">
              <input type="submit" value="REGISTRATION">
          </form>   
            <br><br>
            <div style="color: #ff0033; text-align: center; font-family: sans-serif; font-size: x-large">${errmsg}</div>         
    </body>
</html>