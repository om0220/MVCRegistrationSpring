<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/js/index.js"></script>
</head>
<body>
 <div class="welcome-message">
    <h1>Welcome back!</h1>
  </div>
<h1>Employee Login page</h1>
<form action="WelcomeServlet" method="post" name="insert">
			
			<p>
				Enter name:<input type="text" name="name">
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