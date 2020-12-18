
<jsp:include page="AdminHeader.jsp" />
<%@page import="java.util.Set"%>
<%@ page import="com.model.BlManagerExamination"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="com.pojo.Applicationforadmission"%>
<%@ page import="com.pojo.Enrolledstudents"%>
<%@ page import="com.pojo.Dance"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





 <!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Exam Timetable Details</h3>
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

								<h2>View Exam TimeTable Details</h2>

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

                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th>Exam Type</th>
                        <th>Subject Code</th>
                        <th>Subject Name</th>
                        <th>Exam Date</th>
                        <th>Exam Time</th>
                      </tr>
                    </thead>
                    <c:forEach items="${sessionScope.ViewTimeTable}" var="viewTimetable">
                    <tbody>
                     <tr>

												<td scope="row">
												<c:out value="${viewTimetable.exType}" /></td>
												<td><c:out value="${viewTimetable.subCode}" /></td> 
												<td><c:out value="${viewTimetable.subName}" /></td>
												<td><c:out value="${viewTimetable.exdate}" /></td>
												<td><c:out value="${viewTimetable.exTime}" /></td>
												
												
																							</tr>
									</c:forEach>
                    </tbody>
                  </table>

                </div>
              </div>
            </div>
					</div>

<jsp:include page="AdminFooter.jsp" />