<%-- 
    Document   : suFilterResult
    Created on : 31 Jul, 2017, 6:49:42 PM
    Author     : mrrobot
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="project1DefineStudent.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SELECTED STUDENT DATA</title>
    </head>
    <body style="background-color: cornflowerblue">
         <div align="center">
		<table border="1" cellpadding="5">
			<caption><h2>SELECTED STUDENT DATA</h2></caption>
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
<%  
// retrieve your list from the request, with casting 
ArrayList<Student> list = (ArrayList<Student>) request.getAttribute("list");

// print the information about every category of the list
for(Student std : list) {
    out.println("<tr>");
    out.println("<td>");
    out.println(std.getFName());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getLName());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getAddress1());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getAddress2());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getContact());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getEmail());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getSemNo());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getSemMarks());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getDeptId());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getClgId());
    out.println("</td>");
    out.println("<td>");
    out.println(std.getStdReg());
    out.println("</td>");
    out.println("</tr>");
}
%>
                        </tr>		
		</table>
	</div>
                        <br><br>
                <form style="text-align: center"  action="updateServlet">
                <input type="hidden" value="logout" name="scrt"> 
              <input type="submit" value="LOG OUT">
              <br></br>
                </form>             
    </body>
</html>
