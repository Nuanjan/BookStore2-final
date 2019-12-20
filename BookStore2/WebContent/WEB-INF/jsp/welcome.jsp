<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Welcome</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- Favicon -->
	<link rel="shortcut icon" href="images/favicon.ico" />
	<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
	<link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500,700,900" rel="stylesheet">
	<!-- Bootstrap Css -->
	
	<link rel="stylesheet" href="css/style.css">
	
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
</head>
<body>

<div id="header" class="header-area">
	<div class="overlay-section">
		<div class="top-bar">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-6 col-xs-12">
						
					</div>
					<div class="col-lg-6 col-md-6 col-xs-12">
						
					</div>
				</div>
			</div>
		</div>
		<div class="banner-content container">
			<div class="inner-content">
				<h1>Hi! <span>Welcome to Book Store</span></h1>
				<form action="StoreServlet" method="post">
				<input type="hidden" name="source" value="admin">
				<button type="submit">Admin?</button>
				 
				</form>
				
				<form action="StoreServlet" method="post">
			<input type="hidden" name="source" value="customer">
				<button type="submit">Customer?</button>
				
				</form>
			</div>
		</div>
	</div>
</div>


	
<!-- Modal -->
<script src="js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/form-validator.min.js"></script>
<script src="js/contact-form-script.js"></script> 
<script src="js/custom.js"></script>
</body>
</html>
