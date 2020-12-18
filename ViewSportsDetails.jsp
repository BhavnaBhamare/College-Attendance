
<jsp:include page="AdminHeader.jsp" />
<%@page import="java.util.Set"%>
<%@ page import="com.model.BlManager"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="com.pojo.Applicationforadmission"%>
<%@ page import="com.pojo.Enrolledstudents"%>
<%@ page import="com.pojo.Sports"%> 

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
BlManager Bl = new BlManager();
List<Sports> stusports=Bl.listsports();
HttpSession session1 = request.getSession();
session1.setAttribute("sportslist",stusports);

%>




 <!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Sports Details</h3>
			</div>

			<div class="title_right">
				<div
					class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Search for..."> <span
							class="input-group-btn">
							<button class="btn btn-default" type="button">Go!</button>
						</span>
					</div>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>

		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small> </small>
						</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Settings 1</a></li>
									<li><a href="#">Settings 2</a></li>
								</ul></li>
							<li><a class="close-link"><i class="fa fa-close"></i></a></li>
						</ul>
						<div class="clearfix"></div>
					</div>

					
					<div class="col-md-12 col-sm-12 col-xs-12">

						<div class="x_panel">

							<div class="x_title">

								<h2>View Sports Details</h2>

								<ul class="nav navbar-right panel_toolbox">

									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" role="button" aria-expanded="false"><i
											class="fa fa-wrench"> </i></a>

										<ul class="dropdown-menu" role="menu">

											<li><a href="#">Settings 1</a></li>

											<li><a href="#">Settings 2</a></li>
										</ul></li>
									<li><a class="close-link"><i class="fa fa-close"></i></a>

									</li>
								</ul>
								<div class="clearfix"></div>

							</div>
							<div class="x_content">
							<form action="updateAllInCurrentStudent" method="post">

								<table class="table table-striped">

									<thead>
										<tr>
											<th>Enrollment Number</th>
											<th>Name</th>
											<th>Sports type</th>
										
											
											

										</tr>
									</thead>
									<c:forEach items="${sessionScope.sportslist}" var="stusports">
										<tbody>
											<tr>

												<td scope="row">
												<c:out value="${stusports.enrolledstudents.enrollmentNumber }" /></td>
												<td><c:out value="${stusports.enrolledstudents.applicationforadmission.applicantFirstName}" /></td> 
												<td><c:out value="${stusports.sportsType}" /></td>
												
												
																							</tr>
									</c:forEach>
								</table>
								<div class="ln_solid"></div>
							
								</form>
							</div>
						</div>
					</div>
					</div>

<jsp:include page="AdminFooter.jsp" />