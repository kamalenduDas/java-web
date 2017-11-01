<%-- 
    Document   : suDash
    Created on : 28 Jul, 2017, 11:50:47 AM
    Author     : mrrobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SuperUser Dashboard</title>
    </head>
    <body>
        <h1 style="text-align: center; font-family: serif; font-weight: inherit " >WELCOME ADMIN ${obj.getFName()}</h1>
    <body style="background: seagreen">
            <div>
                <form style="text-align: center" action="index.jsp" method="post">
    <p><input type="submit" value = "HOME"> 
        <span style="width: 100px"></span>
      <a href ="suView.jsp"><span>
        <input type="button" value = "SHOW ALL DATA">
        <span style="width: 100px"></span>
        <a href ="suViewByFilter.jsp">
        <input type="button" value = "SHOW DATA BY COLLEGE / DEPT">
        
        <a href ="suInsert.jsp">
        <input type="button" value = "INSERT COLLEGE / DEPARTMENT"></span></a></p>
        </div>
            </form>
<!--                <form  action="updateServlet">
                <input type="hidden" value="logout" name="scrt"> 
              <input type="submit" value="LOG OUT">
              <br></br>
                </form>-->
                
        <div align="center">
            <div style="color: #0099ff;font-family: cursive">${sccs}</div>
        </div>
            <h3 style="text-align: center;font-family: cursive" >CHANGE OR UPDATE DATA</h3>
            
            <form style="font-family: cursive;text-align: center"  action = "updateServlet" method="post">
            FName:<input type="text"  value= "${obj.getFName()}" name="fname"required>
            <br><br>
            LName:<input type="text"  value= "${obj.getLName()}" name="lname"required>
            <br><br>
            Address1:<input type="text"  value= "${obj.getAddress1()}" name="address1"required>
            <br><br>
            Address2:<input type="text"  value= "${obj.getAddress2()}" name="address2"required>
            <br><br>
            Contact:<input type="text"  value= "${obj.getContact()}" name="contact"required>
            <br><br>
            Email:<input  type="email"  value="${obj.getEmail()}" name="email"required>
            <br><br>
            Password:<input type="password" value="${obj.getPass()}" name="pass"required>
            <br><br>
            Sem No:<input type="text"  value= "${obj.getSemNo()}" name="semNo"required>
            <br><br>
            Sem Marks:<input type="text"  value= "${obj.getSemMarks()}" name="semMarks"required>
            
                      <input type="hidden"  value= "${obj.getSu()}" name="su">
           <br><br>
            Dept Id:<input type="text" value="${obj.getDeptId()}" name="deptId"required>
            <br><br>
            College Id:<input type="text"  value= "${obj.getClgId()}" name="clgId"required>
            <br><br>
            Student Reg:<input type="text"  value= "${obj.getStdReg()}" name="stdReg"required>
            <br><br>
            <input type="hidden" value="nrml" name="scrt">
            <br><br>
            <input type="submit" value="Update">
          </form>
            <br><br>
        <form  style="text-align: center" action="updateServlet">
                <input type="hidden" value="logout" name="scrt"> 
              <input type="submit" value="LOG OUT">
              <br></br>
                </form>
    </body>
</html>
