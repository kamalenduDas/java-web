<%-- 
    Document   : RegisterNow
    Created on : 20 Jul, 2017, 7:52:19 AM
    Author     : mrrobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Registration</title>
    </head>
    <body style="background-color: #3399ff; text-align: center">
        
        <br>
        <u><h1 style="font-family: serif; " >New Student Entry</h1>
        <br>
        <div style="color: greenyellow;font-family: cursive">${sccs}</div>
        <div style="color: greenyellow;font-family: cursive">${data}</div>
        <br>
        <form style="text-align: center" action="updateServlet" method="post">
            First Name: <input type="text" placeholder="eg: John" name="fname"required>            
            <br></br>
            Last Name:<input   type="text" placeholder="eg: Doe" name="lname"required>
            <br></br>
            Address 1:<input   type="text" placeholder="eg: sdf building,saltlake" name="address1"required>
            <br></br>
            Address 2:<input   type="text" placeholder="eg: sdf building,saltlake" name="address2"required>
            <br></br>
            Contact No:<input  type="text" placeholder="eg: 897635201912" name="contact"required>
            <br></br>
            Valid Email:<input type="email" placeholder="eg: johnDoe@xyz.com" name="email"required>
            <br></br>
            Password:<input    type="password" placeholder="eg: Pass!23@" name="pass"required>
            <br></br>
            Semester No:<input type="text" placeholder="eg: 2" name="semNo"required>
            <br></br>
            Semester Marks:<input type="text" placeholder="eg: 87" name="semMarks"required>
            <br></br>
            Department Id:<input type="text" placeholder="eg: mca1" name="deptId"required>
            <br></br>
            College Id:<input type="text" placeholder="eg: 117" name="clgId"required>
            <br></br>
            Registration No:<input type="text" placeholder="eg: johndoe117mca1" name="stdReg"required>
            <input type="hidden" value="new" name="scrt"></u>
            <input type="submit" value="SUBMIT">
            </form>
    </body>
</html>
