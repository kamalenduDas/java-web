<%-- 
    Document   : suView
    Created on : 19 Jul, 2017, 8:56:50 AM
    Author     : mrrobot
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>su/admin view of table</title>
</head>
<body style="background-color: cadetblue">
	<sql:setDataSource
		var="myDS"
		driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
		url="jdbc:sqlserver://localhost\student:1433;databaseName=training"
		user="SA" password="Bxy.12hjxd"
	/>
	
	<sql:query var="listUsers"	dataSource="${myDS}">
		SELECT * FROM student;
	</sql:query>
	
	<div align="center">
		<table border="1" cellpadding="5">
			<caption><h2><u>ALL STUDENT DATA</u></h2></caption>
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
			<c:forEach var="user" items="${listUsers.rows}">
				<tr>
					<td><c:out value="${user.fname}" /></td>
                                        <td><c:out value="${user.lname}" /></td>
                                        <td><c:out value="${user.address1}" /></td>
                                        <td><c:out value="${user.address2}" /></td>
                                        <td><c:out value="${user.contact}" /></td>
					<td><c:out value="${user.email}" /></td>
                                        <td><c:out value="${user.sem_no}" /></td>
                                        <td><c:out value="${user.sem_marks}" /></td>
                                        <td><c:out value="${user.dept_id}" /></td>
                                        <td><c:out value="${user.college_id}" /></td>
                                        <td><c:out value="${user.std_reg}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
                <br>
                 <form style="text-align: center" action="updateServlet">
                <input type="hidden" value="logout" name="scrt"> 
              <input type="submit" value="LOG OUT">
          </form> 
</body>
</html>
