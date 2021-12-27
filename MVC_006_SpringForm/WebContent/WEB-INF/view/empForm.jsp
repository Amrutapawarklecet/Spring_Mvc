<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <!--  for spring tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Portal</h1>
 <a href="#">Login </a>|
 <a href="#">Register</a>|
 <a href="showTheForm">Shout Your Name</a>
 <hr>
 <h3>Acknowledgement:</h3>${msg}
 <br>
 <!--  
 <form action="processFrom">
 <input type="text" name="myname" placeholder="Enter Your Name"/>
 <input type="submit" value="shoutOutLoud"/>
 </form>
 -->
 <form:form action="processFrom" modelAttribute="employeeBean">
 <!-- first call the getter method -->
 <form:input path="firstName" placeholder="First Name"/><br>
 <form:input path="lastName" placeholder="Last Name"/><br>
 <input type="submit" value="Register"/>
 <!-- when  u call setter method the call setter method and set value to employeeBean -->
 </form:form>
 
 
</body>
</html>