<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title></title>
<!-- Bootstrap Core CSS -->
<link href="static/css/bootstrap.min.css" rel="stylesheet" />

<!-- Website Font style -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css" />

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css' />
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css' />

<!--bootstrap date-time picker-->
<link href="static/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />

<!--data table-->
<link href="static/css/jquery.dataTable.min.css" rel="stylesheet" />
<link href="static/css/dataTables.bootstrap.min.css" rel="stylesheet" />

<!-- Custom CSS -->
<!--<link href="css/scrolling-nav.css" rel="stylesheet" />-->
<link href="static/css/main.css" rel="stylesheet" />
</head>
<body>
	<!-- Login Section -->
	<!--     <img class="img-responsive" src="/images/banner.png" alt="banner"/> -->
	<div class="container">
		<div class="row ">
			<div class="main-center ">
				<div class="bg-danger"">Invalid username and secret.</div>
				<div class="bg-danger">You have been logged out.</div>
				<form class="form-signin" action="#" method="post">
					<h2 class="form-signin-heading">Please sign in</h2>
					<div class="form-group">
						<label for="username" class="sr-only">Username</label> <input
							type="text" roleId="username" class="form-control"
							placeholder="Username" name="username" id="username"
							required="required" autofocus="autofocus" />
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">Password</label> <input
							type="password" roleId="inputPassword" class="form-control"
							placeholder="Password" id="password" name="password"
							required="required" />
					</div>
					<div class="form-group">
						<input type="checkbox" name="remember-me" id="remember-me" />
						&nbsp; Remember me
					</div>
					<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
						in</button>
				</form>

				<hr />

				<div class="form-group ">
					<a type="submit" class="btn btn-info btn-lg btn-block login-button"
						href="#">Sign up!</a>
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery -->
	<script src="static/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="static/js/bootstrap.min.js"></script>

	<script src="static/js/jquery.easing.min.js"></script>

	<!--bootstrap date-time picker-->
	<script src="static/js/bootstrap-datetimepicker.min.js"></script>

	<!--bootbox-->
	<script src="static/js/bootbox.min.js"></script>

	<!--data table-->
	<script src="static/js/jquery.dataTables.min.js"></script>
	<script src="static/js/dataTables.bootstrap.min.js"></script>

	<!--main js-->
	<script src="static/js/main.js"></script>

</body>
</html>