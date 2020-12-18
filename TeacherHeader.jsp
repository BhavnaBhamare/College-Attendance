<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>User_Dash</title>





<!-- Bootstrap core CSS -->

<link href="new/css/bootstrap.min.css" rel="stylesheet">

<link href="new/fonts/css/font-awesome.min.css" rel="stylesheet">
<link href="new/css/animate.min.css" rel="stylesheet">

<!-- Custom styling plus plugins -->
<link href="new/css/custom.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="new/css/maps/jquery-jvectormap-2.0.3.css" />
<link href="new/css/icheck/flat/green.css" rel="stylesheet" />
<link href="new/css/floatexamples.css" rel="stylesheet" type="text/css" />

<script src="new/js/jquery.min.js"></script>
<script src="new/js/nprogress.js"></script>

<!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->


<style>
.filter a {
	padding: 10px 20px;
	display: inline-block;
	color: #003;
	background: #afd9ee;
	text-decoration: none;
	transition: all 0.2s;
	border-radius: 9px;
}

.filter a:hover {
	color: #fff;
	background-color: #1abb9c;
	border-color: #398439
}
</style>
</head>


<body class="nav-md">

	<c:set var="user" scope="session" value="${sessionScope.regFirstName}" />


	<!---<script type="text/javascript"> 
 
        function displaycontent(a){ 
            if(a.value==user){ 

              document.getElementById("stud").style.visibility='hidden'; 
             
            } 
            else { 
                document.getElementById("stud").style.visibility='visible'; 
               
            } 
      
		}
        
    </script> -->


	<div class="container body">


		<div class="main_container">

			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">

					<div class="navbar nav_title" style="border: 0;">

						<a href="#" class="site_title"><i class="fa fa-user"></i> <span>TEACHER_DASH</span></a>
					</div>
					<div class="clearfix"></div>

					<!-- menu prile quick info -->

					<!-- /menu prile quick info -->

					<br />



					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">

						<div class="menu_section">
							<%--  <h3> WELCOME &nbsp;${UserName}</h3> --%>
							<ul class="nav side-menu">
								<li><a><i class="fa fa-home"></i> Home <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="TeacherDashboard.jsp">Dashboard</a></li>
									</ul></li>




								<li><a><i class="fa fa-edit"></i>Add Detail<span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="Addattendance.jsp">Add Attendance</a></li>
										<li><a href="Notice.jsp">Add Notice</a></li>
										<li><a href="addSubject.jsp">Add New Subject</a></li>
										<li><a href="assignmentAdd.jsp">Add Assignment</a></li>
										<li><a href="syllabusAdd.jsp">Add Syllabus</a></li>
										<li><a href="timetable.jsp">Add TimeTable</a></li>
										<li><a href="selectClass.jsp">Add Exam Result</a></li>
										
										



									</ul></li>
									
										<li><a><i class="fa fa-table"></i> Update Detail <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										
										<li><a href="viewAttendance.jsp">Attendance</a></li>
										<li><a href="selectExamType.jsp">Update Marks</a></li>
                                        <li><a href="UpdateNotice.jsp">Update Notice</a></li>
                                        

									</ul></li>
									
									<li><a><i class="fa fa-table"></i> View Detail <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="TeacherViewNotice.jsp">Notice</a></li>
										<li><a href="selectExamType2.jsp">Marks list</a></li>
                                        <li><a href="TeacherviewAttd.jsp">Attendance</a></li>
                                        <li><a href="viewTimetable.jsp">Timetable</a></li>
                                        <li><a href=" TeacherViewAssignment.jsp">Assignment</a></li>
                                        <li><a href="TeacherViewSyllabus.jsp">Syllabus</a></li>
                                        
									</ul></li>




								<li><a><i class="fa fa-table"></i> Delete Detail <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="NoticeDelete.jsp">Notice</a></li>

									</ul></li>
									
									<li><a><i class="fa fa-table"></i> View report <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu" style="display: none">
										<li><a href="ViewAttendanceReort.jsp">Attendance</a></li>

									</ul></li>


							





							</ul>
						</div>

					</div>
					<!-- /sidebar menu -->



					<!-- /menu footer buttons -->

					<!-- /menu footer buttons -->
				</div>
			</div>







			<!-- top navigation -->
			<div class="top_nav">

				<div class="nav_menu">
					<nav class="" role="navigation">
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>

						<ul class="nav navbar-nav navbar-right">
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <B style="font-size: 20px;">${UserName}</B>
									<span class=" fa fa-angle-down"></span>
							</a>
								<ul
									class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
									<li><a href="ViewUserStudentProfile.jsp"> Profile</a></li>
									<li></li>
									<li></li>
									<li><a href="LogoutServlet"><i
											class="fa fa-sign-out pull-right"></i> Log Out</a></li>
								</ul></li>

							<li role="presentation" class="dropdown">

								<ul id="menu1"
									class="dropdown-menu list-unstyled msg_list animated fadeInDown"
									role="menu">
									<li><a> <span class="image"> <img
												src="images/img.jpg" alt="Profile Image" />
										</span> <span> <span>John Smith</span> <span class="time">3
													mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li><a> <span class="image"> <img
												src="images/img.jpg" alt="Profile Image" />
										</span> <span> <span>John Smith</span> <span class="time">3
													mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li><a> <span class="image"> <img
												src="images/img.jpg" alt="Profile Image" />
										</span> <span> <span>John Smith</span> <span class="time">3
													mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li><a> <span class="image"> <img
												src="images/img.jpg" alt="Profile Image" />
										</span> <span> <span>John Smith</span> <span class="time">3
													mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li>
										<div class="text-center">
											<a> <strong>See All Alerts</strong> <i
												class="fa fa-angle-right"></i>
											</a>
										</div>
									</li>
								</ul>
							</li>

						</ul>
					</nav>
				</div>

			</div>