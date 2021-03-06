<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title> Admin </title>

  <!-- Bootstrap core CSS -->

  <link href="css/bootstrap.min.css" rel="stylesheet">

  <link href="fonts/css/font-awesome.min.css" rel="stylesheet">
  <link href="css/animate.min.css" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="css/custom.css" rel="stylesheet">
  <link href="css/icheck/flat/green.css" rel="stylesheet">
  <!-- editor -->
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.css" rel="stylesheet">
  <link href="css/editor/external/google-code-prettify/prettify.css" rel="stylesheet">
  <link href="css/editor/index.css" rel="stylesheet">
  <!-- select2 -->
  <link href="css/select/select2.min.css" rel="stylesheet">
  <!-- switchery -->
  <link rel="stylesheet" href="css/switchery/switchery.min.css" />

  <script src="js/jquery.min.js"></script>

  <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>


<body class="nav-md">

  <div class="container body">


    <div class="main_container">

      <div class="col-md-3 left_col">
        <div class="left_col scroll-view">

          <div class="navbar nav_title" style="border: 0;">
            <a href="ADMINDASH.jsp" class="site_title"><i class="fa fa-paw"></i> <span>Admin</span></a>
          </div>
          <div class="clearfix"></div>


          <!-- menu prile quick info -->
          <div class="profile">
            <div class="profile_pic">
              <img src="images/img.jpg" alt="..." class="img-circle profile_img">
            </div>
            <div class="profile_info">
              <span>Welcome,</span>
              <h2>${adminLogin.adminEmail}</h2>
            </div>
          </div>
          <!-- /menu prile quick info -->

          <br />

          <!-- sidebar menu -->
          <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

            <div class="menu_section">
              <h3>To Admin Dash</h3>
              <ul class="nav side-menu">
                <li><a><i class="fa fa-plus-circle"></i> Admission <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AdminAprovalForAdmitn.jsp">Approved List</a>
                    
                    </li>
                  </ul>
                </li>
                
                 </ul>
                
                
                 <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Hostel <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AdminHostelRoomApplicationList.jsp">Application List</a>
                    <li><a href="AdminListAllotHostelMess.jsp">Hostel RoomAllot & Mess Reg</a>
                    <li><a href="MessAttendance.jsp">Mess Attendance</a>
                    <li><a href="HostelAttendance.jsp">Hostel Attendance</a>
                    </li>
                   </ul>
                     </ul>
                  
                  
                   <ul class="nav side-menu">
                  <li><a><i class="fa fa-pencil-square-o"></i> Exam <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="index.html">Approved List</a>
                    <li><a href="index.html">Registration Form</a> 
                    </li>
                  </ul>
                  </ul>
                  
                </li>
                
                
                <ul class="nav side-menu">
                 <li><a><i class="fa fa-car"></i> Transport <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="index.html">Add Bus Detail </a>
                    <li><a href="index.html">Add Bus Driver Details</a> 
                    </li>
                  </ul>
                </li>
               </ul>
             
             
              <ul class="nav side-menu">
                 <li><a><i class="fa fa-calendar"></i> Holidays And Events <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="HolidaysADD.jsp">Holidays Add </a>
                    <li><a href="HolidayList.jsp">Holiday List</a> 
                    <li><a href="EventsADD.jsp">Event Add</a> 
                    <li><a href="EventList.jsp">Event List</a> 
                    </li>
                  </ul>
                </li>
               </ul>
             
             
             <ul class="nav side-menu">
                 <li><a><i class="fa fa-music"></i> Music <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AddMusicDetails.jsp">Student Admission for Music Class</a>
                    <li><a href="ViewMusicDetails.jsp">View All Student</a> 
                    </li>
                  </ul>
                </li>
               </ul>
             
             
             <ul class="nav side-menu">
                 <li><a><i class="fa fa-users"></i> Dance <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AddDanceDetails.jsp">Student Admission for Dance Class</a>
                    <li><a href="ViewDanceDetails.jsp">View All Student</a> 
                    </li>
                  </ul>
                </li>
               </ul>
               
               
               <ul class="nav side-menu">
                 <li><a><i class="fa fa-futbol-o"></i> Sport <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AddSportsDetails.jsp">Student Admission for Sport Class</a>
                    <li><a href="ViewSportsDetails.jsp">View All Student</a> 
                    </li>
                  </ul>
                </li>
               </ul>
             
             
               <ul class="nav side-menu">
                 <li><a><i class="fa fa-pencil-square-o"></i> Examination <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AdminExTimeTable1.jsp">Exam Schedule</a>
                    <li><a href="#">View Schedule</a> 
                    </li>
                  </ul>
                </li>
               </ul>
             
             
             <ul class="nav side-menu">
                 <li><a><i class="fa fa-child"></i>Employee <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="EmployeeADD.jsp">Add New Employee</a>
                    <li><a href="TeacherAttendance.jsp">Attendance</a>
                    <li><a href="AllEmployeeList.jsp">View All Employees</a> 
                    </li>
                  </ul>
                </li>
               </ul>
             
             
             
             
                  
                </li>
                
              </ul>
            </div>
         

          </div>
          <!-- /sidebar menu -->

          <!-- /menu footer buttons -->
          <div class="sidebar-footer hidden-small">
            
            <a data-toggle="tooltip" data-placement="top" title="FullScreen">
              <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="Lock">
              <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="Logout">
              <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
            </a>
          </div>
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
              <li class="">
                <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                  <img src="images/img.jpg" alt="">${adminLogin.adminEmail}
                  <span class=" fa fa-angle-down"></span>
                </a>
                <ul class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
                  <li><a href="javascript:;">  Profile</a>
                  </li>
                 
                 
                  <li><a href="Login.jsp"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
                  </li>
                </ul>
              </li>

              <li role="presentation" class="dropdown">
                <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                  <i class="fa fa-envelope-o"></i>
                  <span class="badge bg-green">6</span>
                </a>
                <ul id="menu1" class="dropdown-menu list-unstyled msg_list animated fadeInDown" role="menu">
                  <li>
                    <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                    </a>
                  </li>
                  <li>
                    <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                    </a>
                  </li>
                  <li>
                    <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                    </a>
                  </li>
                  <li>
                    <a>
                      <span class="image">
                                        <img src="images/img.jpg" alt="Profile Image" />
                                    </span>
                      <span>
                                        <span>John Smith</span>
                      <span class="time">3 mins ago</span>
                      </span>
                      <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where...
                                    </span>
                    </a>
                  </li>
                  <li>
                    <div class="text-center">
                      <a>
                        <strong>See All Alerts</strong>
                        <i class="fa fa-angle-right"></i>
                      </a>
                    </div>
                  </li>
                </ul>
              </li>

            </ul>
          </nav>
        </div>

      </div>
      <!-- /top navigation -->
