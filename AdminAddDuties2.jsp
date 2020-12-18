
<jsp:include page="AdminHeader.jsp" />
<%@page import="java.util.Set"%>
<%@ page import="com.model.BlManagerExamination"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>

<%@ page import="com.pojo.Enrolledstudents"%>
<%@ page import="com.pojo.Teacherdetail"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
BlManagerExamination bl1 = new BlManagerExamination();
								List<Teacherdetail> teacherlist = bl1.SearchAllTeacher();

								HttpSession session2 = request.getSession();
								session2.setAttribute("tlist",teacherlist);
%>



 <!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Add Exam Duties Details</h3>
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

								<h2>Add Exam Duties  Details</h2>

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
<form action="AddDuties2" method="post">
                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th>Exam Type</th>
                        <th>Subject Code</th>
                        <th>Subject Name</th>
                        <th>Exam Date</th>
                        <th>Exam Time</th>
                        <th>Building Name</th>
                        <th>Room Number</th>
                        <th>Teacher Name</th>
                      </tr>
                    </thead>
                    <c:forEach items="${sessionScope.Timetabledetails}" var="viewTimetable">
                    <tbody>
                     <tr>

												<td scope="row">
												<c:out value="${viewTimetable.exType}" /></td>
												<td><c:out value="${viewTimetable.subCode}" /></td> 
												<td><c:out value="${viewTimetable.subName}" /></td>
												<td><c:out value="${viewTimetable.exdate}" /></td>
												<td><c:out value="${viewTimetable.exTime}" /></td>
												<td><select class="select2_single form-control" tabindex="-1" name="Building" value="">
														<option value="IT">IT</option>
														<option value="EC">EC</option>
														<option value="MBA">MBA</option>
														<option value="MCA">MCA</option>
														<option value="CIVIL">CIVIL</option>
														<option value="COMPUTER SCIENCE">COMPTER SCIENCE</option>
														<option value="COMMERCE">COMMERCE</option>
														</td>
														
														
												<td><select class="select2_single form-control" tabindex="-1" name="RoomNo" value="">
														<option value="101">101</option>
														<option value="102">102</option>
														<option value="103">103</option>
														<option value="202">201</option>
														<option value="204">204</option>
														<option value="205">205</option>
														<option value="302">301</option>
														<option value="302">302</option>
														<option value="304">304</option>
														<option value="305">305</option>
														<option value="405">405</option>
														</td>	
														
														<td><select class="select2_single form-control" tabindex="-1"
										name="Teachername" id="Teachername">
										<c:forEach items="${sessionScope.tlist}" var="ls">
											<option value="${ls.tcherFirstName}">${ls.tcherFirstName}</option>
										</c:forEach>
									</select></td>	
												
												
																							</tr>
									</c:forEach>
                    </tbody>
                  </table>
                  <div class="form-group">
								<div class="col-md-6 col-md-offset-3">
									<button type="submit" class="btn btn-primary">Cancel</button>
									<input type="submit" class="btn btn-success" value="Arrange Duties">
								</div>
							</div>
</form>
                </div>
              </div>
            </div>
					</div>

<jsp:include page="AdminFooter.jsp" />