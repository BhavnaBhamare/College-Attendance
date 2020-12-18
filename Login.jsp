<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>


<script type="text/javascript">
	history.pushState(null, null, '');

	window.addEventListener('popstate', function(event) {

		history.pushState(null, null, '');

	});
</script>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Login Form</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

	<link rel='stylesheet prefetch'
		href='http://fonts.googleapis.com/css?family=Roboto+Slab'>

		<style>
/* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

html, body {
	height:auto;
	width:auto; 
	 
	background-image: url("images/1487778761674301.jpg");
	background-repeat: no-repeat; 
    font-family: "Roboto Slab", serif;
	color: white;

}

.preload * {
	transition: none !important;
}

label {
	display: block;
	font-weight: bold;
	font-size: 50px;
	text-transform: uppercase;
	font-size: 0.7em;
	margin-bottom: 0.35em;
}

input[type="text"], input[type="password"] {
	width: 100%;
	border: thick;
	padding: 0.5em;
	border-radius: 2px;
	margin-bottom: 0.5em;
	border-radius: 2px;
	background: rgba(0, 0, 0, 0.10);
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.25);
	color: white;
	box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.45);
}

input[type="text"]:focus, input[type="password"]:focus {
	outline: none;
	box-shadow: inset -1px -1px 3px rgba(0, 0, 0, 0.3);
}

button {
	padding-left: 1.5em;
	padding-right: 1.5em;
	padding-bottom: 0.5em;
	padding-top: 0.5em;
	border-radius: 2px;
	background: rgba(0, 0, 0, 0.10);
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.25);
	color: white;
	box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.45);
}

small {
	font-size: 1em;
}

.login--login-submit {
	float: right;
}

.login--container {
	width: 600px;
	background: none;
	margin: 0 auto;
	position: relative;
	top: 25%;
	margin-top: 150px;
}

.login--toggle-container {
	position: absolute;
	background: black;
	right: 0;
	line-height: 2.5em;
	width: 50%;
	height: 140px;
	text-align: right;
	cursor: pointer;
	transform: perspective(1000px) translateZ(1px);
	transform-origin: 0% 0%;
	transition: all 1s cubic-bezier(0.06, 0.63, 0, 1);
	backface-visibility: hidden;
}

.login--toggle-container .js-toggle-login {
	font-size: 4em;
	text-decoration: underline;
}

.login--active .login--toggle-container {
	transform: perspective(1000px) rotateY(180deg);
	background: rgba(0, 0, 0, 0.5);
}

.login--username-container, .login--password-container {
	float: left;
	background: rgba(0, 0, 0, 0.5);
	width: 50%;
	height: 140px;
	padding: 0.5em;
}

.login--username-container {
	transform-origin: 100% 0%;
	transform: perspective(1000px) rotateY(180deg);
	transition: all 1s cubic-bezier(0.06, 0.63, 0, 1);
	background-color: #939393;
	backface-visibility: hidden;
}

.login--active .login--username-container {
	transform: perspective(1000px) rotateY(0deg);
	background: rgba(0, 0, 0, 0.5);
}

footer {
	position: absolute;
	bottom: 12px;
	left: 20px;
}

.textbox {
	border: thick;
	border-color: #F00;
	background: rgba(0, 0, 0, 0.10);
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.25);
	color: white;
	box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.45);
}
</style>

		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
		
</head>

<body  >
	<form action="AuthLogin" method="post">
		<div class='preload login--container'>

			<div class='login--form'>
				<div class='login--username-container'>
					<label style="font-size: 30px;">Username</label> <input autofocus placeholder='Username' required
						type='text' class="textbox" name="username">
				</div>
				<div class='login--password-container'>
					<label style="font-size: 30px;">Password</label> <input placeholder='Password' required
						type='password' class="textbox" name="password">
						<button class='js-toggle-login login--login-submit' type="submit">Login</button>
				</div>
			</div>

			<div class='login--toggle-container'>
				<small>Hey you,</small>
				<div class='js-toggle-login'>Login</div>
				<small>already</small>
			</div>
		</div>
		
		
		
		
		
		
		
	</form>
	<footer> </footer>
	<script src='js/jquery.min.js'></script>

	<script src="js/index.js"></script>




</body>
</html>
