<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body id="body">
	<div class="navbar " id="navigation">
	
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
			<li><a href="#">Feedback</a></li>
			<li><a href="#" id="hide">Hide </a></li>
		</ul>
	</div>


<br>
<br>
<br>
<div class="col-md-offset-4 col-md-4" id="location">
		<form  action="Register" method="post">
	<table class="table">
	<tr>
	<td>
	<input type="text" name="username" value="${cusername}" placeholder="Enter username">
	</td>
	<td>
	<p style="color:white">${errorlist['eusername'] }</p>
	</td>
	</tr>
	<tr>
	<td>
	<input type="phone" name="phone" placeholder="enter phone" value="${cphone}">
	</td>
	<td>
	<p style="color:white">${errorlist['ephone'] }</p>
	</td>
	</tr>
	<tr>
	<td>
	<input type="address" name="address" placeholder="enter address" value="${caddress}">
	</td>
	<td>
	<p style="color:white">${errorlist['eaddress'] }</p>
	</td>
	</tr>
	<tr>
	<td>
	<input type="password" name="password" placeholder="Enter password">
	</td>
	<td>
	<p style="color:white">${errorlist['password'] }</p>
	</td>
	</tr>
	<tr>
	<td>
	<input type="password" name="cpassword" placeholder="confirm password">
	</td>
	
	</tr>
	<tr>
	<td>
	<input type="submit" value="Send">
	</td>
	</tr>
	<tr>
	<td>
	<a href="Login.jsp">Login</a>
	</td>
	</tr>
	
	</table>
</form>
</div>


</body>
</html>