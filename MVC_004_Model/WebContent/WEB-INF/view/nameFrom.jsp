<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
 <a href="showTheNameForm">Shout Your Name</a>
 <hr>
 <h3>Acknowledgement:</h3>${msg}
 <br>
 <form action="displayMyName">
 <input type="text" name="myname" placeholder="Enter Your Name"/>
 <input type="submit" value="shoutOutLoud"/>
 </form>
</body>
</html>