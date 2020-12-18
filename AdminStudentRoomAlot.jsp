<%@include file="HostelHeader.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ page import="java.util.List"%>
<%@ page import="com.model.BlManagerHostel"%>
<%@ page import="com.pojo.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>

<%
	BlManagerHostel bl = new BlManagerHostel();
	List<Hostelmess> HostelmessID = bl.getAllMessIDList() ; 
	
	int a= HostelmessID.get(1).getHmessId()+1;
	

	HttpSession sessionHostelmessID = request.getSession();
	sessionHostelmessID.setAttribute("MessId", a);
%>
<!-- page content -->
<div class="right_col" role="main">
	<div class="">

		<div class="page-title">
			<div class="title_left">
				<h3>Allotment For Student</h3>
			</div>
			<div class="title_right">
				<div
					class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
					<div class="input-group"></div>
				</div>
			</div>
		</div>


		<div class="clearfix"></div>
		<div class="row">

			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							Form <small>different form elements</small>
						</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i></a></li>
							<li><a class="close-link"><i class="fa fa-close"></i></a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<br />



						<form action="HostelAdmissionServ" method="post"
							data-parsley-validate class="form-horizontal form-label-left">





							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">
									Name</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="Sname"
										value="${ListOfReg.applicationforadmission.applicantFirstName}">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">
									Last Name</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="Sname"
										value="${ListOfReg.applicationforadmission.applicantLastName}">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">
									Room Type</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="Sname"
										value="${ListOfReg.hroomType}">
								</div>
							</div>
							
							
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">
									Food Type</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="Sname"
										value="${ListOfReg.messFoodType}">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Mess
									Id</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="messNum" value="${MessId}">
								</div>
							</div>

							
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
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


				<table class="table table-striped">
					<thead>
						<tr>
							<th>No</th>
							<th>Room Number</th>
							<th>Room Members</th>
							<th>Set Room & Mess</th>
						</tr>
					</thead>
					<c:forEach items="${sessionScope.HroomAlotList}" var="ls">
						<tbody>
							<tr>
								<td scope="row"><c:out value="${ls.hostelRoomId}" /></td>
								<td><c:out value="${ls.hostelRoomNumber }" /></td>
								<td><c:out value="${ls.hostelRoomMembers}" /></td>
								<td><a	href="AdminHostelSetStudentRoomServ?Rid=${ls.hostelRoomId}">Set</a></td>
							</tr>
					</c:forEach>
				</table>

				<br />
			</div>
		</div>
	</div>
	<!-- /page content -->

	<%@include file="HostelFooter.jsp"%>