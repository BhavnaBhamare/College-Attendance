<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div class="animate form login_form"
		style="padding-left: 450px; padding-top: 120px;">

		<form action="LoginServlet" method="post">
			<h1>Login Form</h1>

			<div>
				<select class="form-control" name="department" style="width: 300px;">
					<option value="none">Select Department</option>
					<option value="Teacher">Teacher</option>
					<option value="Head Of Computer Science">Head Of Computer
						Science</option>
				</select>
			</div>

			<br> <br>
			<div>
				<input type="text" style="width: 300px;" class="form-control"
					name="tcherEmailId" />
			</div>
			<br> <br>
			<div>
				<input type="password" style="width: 300px;" name="tcherPassword"
					class="form-control" />
			</div>

			<h3 style="color: red;">${masg }</h3>
			<%
				session.removeAttribute("masg");
			%>

			<br> <br>

			<div>
				<input type="submit" value="Login">

			</div>

			<div class="clearfix"></div>


		</form>

	</div>
</body>
</html>