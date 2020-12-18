<jsp:include page="AdminHeader.jsp" />
<%@page import="java.util.Set"%>
<%@ page import="com.model.BlManager"%>
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
			<div class="col-md-10 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small>Add Sports Details</small>
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
					
					
					
					<form class="form-horizontal form-label-left" action="AddSports"
							method="post">


							<span class="section">Add Sports Details</span>
							
						<div class="item form-group" style="margin-right:-80px; ">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"
									for="EnrollId">Enrollment Number </label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="EnrollId" type="text" name="EnrollId"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							
				
				
						
							 <div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12">Sports Type<span class="required">*</span>
								</label>
								<div class="col-md-8 col-sm-8 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										name="Sportstype" value="">
										<option value="Cricket">Cricket
											</option>
										<option value="Hockey">Hockey</option>
										<option value="Football">Football
											</option>
										<option value="	Tennis">Tennis</option>
										<option value="Badminton">Badminton</option>
										<option value="	Basketball">Basketball</option>
										<option value="Table tennis"> Table tennis
										</option>
										<option value="	Golf">Golf
										</option>
										<option value="Volleyball">Volleyball
										</option>
										
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