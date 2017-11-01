<%-- 
    Document   : showTab
    Created on : 16 Jul, 2017, 3:46:49 PM
    Author     : mrrobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@  taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STUDENT DETAILS</title>
    </head>
    <body style="background: seagreen">
        <div align="center">
		<table border="1" cellpadding="5">
                    <caption><h2 style="text-align:center; font-family: cursive">STUDENT DETAILS OF ${obj.getFName()}</h2></caption>
			<tr>
				<th>FNAME</th>
                                <th>LNAME</th>
                                <th>ADDRESS1</th>
                                <th>ADDRESS2</th>
                                <th>CONTACT</th>
                                <th>EMAIL</th>
				<th>SEM NO</th>
                                <th>SEM MARKS</th>
                                <th>DEPT ID</th>
                                <th>COLLEGE ID</th>
                                <th>STUDENT REG</th>
			</tr>
                    
			 
				<tr>
					<td><c:out value="${obj.getFName()}" /></td>
                                        <td><c:out value="${obj.getLName()}" /></td>
                                        <td><c:out value="${obj.getAddress1()}" /></td>
                                        <td><c:out value="${obj.getAddress2()}" /></td>
                                        <td><c:out value="${obj.getContact()}" /></td>
					<td><c:out value="${obj.getEmail()}" /></td>
					<td><c:out value="${obj.getSemNo()}" /></td>
                                        <td><c:out value="${obj.getSemMarks()}" /></td>
                                        <td><c:out value="${obj.getDeptId()}" /></td>
                                        <td><c:out value="${obj.getClgId()}" /></td>
					<td><c:out value="${obj.getStdReg()}" /></td>
                                        </tr>
			
		</table>
                                        <br>
                <div style="color: greenyellow;font-family: cursive">${sccs}</div>
	</div>
        <br>
        <br>
            <form style="font-family: cursive;text-align: center"  action = "updateServlet">
            FNAME:<input type="text"  value= "${obj.getFName()}" name="fname"required>
            <br><br>
            LNAME:<input type="text"  value= "${obj.getLName()}" name="lname"required>
            <br><br>
            ADDRESS1:<input type="text"  value= "${obj.getAddress1()}" name="address1"required>
            <br><br>
            ADDRESS2:<input type="text"  value= "${obj.getAddress2()}" name="address2"required>
            <br><br>
            CONTACT:<input type="text"  value= "${obj.getContact()}" name="contact"required>
            <br><br>
            EMAIL:<input  type="email"  value="${obj.getEmail()}" name="email"required>
            <br><br>
            PASSWORD:<input type="password" value="${obj.getPass()}" name="pass"required>
            <br><br>
            SEM NO:<input type="text"  value= "${obj.getSemNo()}" name="semNo"required>
            <br><br>
            SEM MARKS:<input type="text"  value= "${obj.getSemMarks()}" name="semMarks"required>
            <input type="hidden"  value= "${obj.getSu()}" name="su"required>
           <br><br>
            DEPT ID:<input type="text" value="${obj.getDeptId()}" name="deptId"required>
            <br><br>
            COLLEGE ID:<input type="text"  value= "${obj.getClgId()}" name="clgId"required>
            <br><br>
            STUDENT REG:<input type="text"  value= "${obj.getStdReg()}" name="stdReg"required>
            <br><br>
            <input type="hidden" value="nrml" name="scrt">
            <BR><BR>
            <input type="submit" value="UPDATE / ALTER">
       </form>
            <br>
            <form style="text-align: center" action="updateServlet">
                <input type="hidden" value="logout" name="scrt"> 
              <input type="submit" value="LOG OUT">
          </form> 
    </body>
</html>
