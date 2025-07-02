<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringMVC ORM</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<h1>Employee Registration Page</h1>
<form action="insert" method="post" name="insert">
			
			<p>
				Enter Name:<input type="text" name="name">
			</p>
			<p>
			Gender:
        <label for="male">Male</label>
        <input type="radio" name="ugender" id="male" value="male" checked>
        <label for="female">Female</label>
        <input type="radio" name="ugender" id="female" value="female">
     
			</p>
		
			
			<p>
				Enter Address:<input type="text" name="address">
			</p>
			<p>
				Enter city:<input type="text" name="ucity">
			</p>
			<p>
				Enter State:<input type="text" name="ustate">
			</p>
			<p>
				Enter email:<input type="email" name="uemail">
			</p>
			<p>
				Enter password:<input type="password" name="upassword">
			</p>
			
			<p>
				<input type="submit" value="insert" class="btn btn-primary">
			</p>
			
		</form>
		
		
</body>
</html>