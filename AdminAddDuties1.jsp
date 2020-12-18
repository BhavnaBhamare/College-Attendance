<jsp:include page="AdminHeader.jsp" />
<%@page import="java.util.Set"%>
<%@ page import="com.model.BlManagerExamination"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="com.pojo.Applicationforadmission"%>
<%@ page import="com.pojo.Enrolledstudents"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Add Invigilation Duties</h3>
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
			<div class="col-md-10 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small>Add Invigilation Duties</small>
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
					<div class="x_content">
					
					
					
					<form class="form-horizontal form-label-left" action="AddDuties1"
							method="post">


							<span class="section">Add Invigilation Duties Details</span>
							
							<div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12">Course<span class="required">*</span>
								</label>
								<div class="col-md-8 col-sm-8 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										name="Course" value="">
										<option value="Bachelor of Engineering">Bachelor of Engineering
											</option>
										<option value="Master of Engineering">Master of Engineering</option>
										<option value="Master of Computer Applications">Master of Computer Applications
											</option>
										<option value="Bachelor of Computer Applications">Bachelor of Computer Applications</option>
										<option value="Bachelor of Science">Bachelor of Science</option>
										<option value="Master of Science">Master of Science</option>
										<option value="Architecture, Building and Planning">Architecture, Building and Planning</option>
										<option value="Business and Management">Business and Management</option>
										<option value="Journalism, Media and Communication">Journalism, Media and Communication</option>
										
									</select>
								</div>
							</div> 
							
							
				
				
						
							 <div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12">Branch<span class="required">*</span>
								</label>
								<div class="col-md-8 col-sm-8 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										name="branch" value="">
										<option value="Chemical Engineering">Chemical Engineering
											</option>
										<option value="Computer Engineering">Computer Engineering</option>
										<option value="Food Technology">Food Technology
											</option>
										<option value="Computer Science">Computer Science</option>
										<option value="Microbiology">Microbiology</option>
										<option value="Biological Sciences">Biological Sciencesoption</option>
										<option value="Applied Psychology"> Applied Psychology
										</option>
										<option value="Mathematics"> Mathematics
										</option>
										<option value="Mechanical & Automation Engineering"> Mechanical & Automation Engineering
										</option>
										<option value="Information Technology"> Information Technology
										</option>
										<option value="M.E Signal Processing">M.E Signal Processing</option>
									</select>
								</div>
							</div> 
							 	
							 <div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"> Semester<span class="required">*</span>
								</label>
								<div class="col-md-8 col-sm-8 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										name="sem" value="">
										<option value="1">1st</option>
										<option value="2">2nd</option>
										<option value="3">3rd</option>
											
										<option value="4">4th</option>
										<option value="5">5th</option>
										<option value="6">6th</option>
										<option value="7">7th</option>
										<option value="8">8th</option>
									</select>
								</div>
							</div> 
							
							
							
							
							<div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12">Exam Type<span class="required">*</span>
								</label>
								<div class="col-md-8 col-sm-8 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										name="ExamType" value="">
										<option value="Internal Exam">Internal Exam
											</option>
										<option value="External Exam">External Exam</option>
										
									</select>
								</div>
							</div> 
							
							
							
							
							
							
							<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-6 col-md-offset-3">
									<button type="submit" class="btn btn-primary">Cancel</button>
									<input type="submit" class="btn btn-success" value="Submit">
								</div>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="AdminFooter.jsp" />