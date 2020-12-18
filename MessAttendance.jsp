<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="AdminHeader.jsp"%>


<%@ page import="java.util.List"%>
<%@ page import="com.model.BlManagerHostel"%>
<%@ page import="com.pojo.Hostelregistration"%>
<%@ page import="com.pojo.Hostelmess"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>

<%
	BlManagerHostel bl = new BlManagerHostel();
	List<Hostelmess> HMessList = bl.getAllmessStudList() ; 

	HttpSession session4 = request.getSession();
	session4.setAttribute("HMessList", HMessList);
%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>Mess Attendance</h2>
			</div>


		</div>
		<div class="clearfix"></div>
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

						<li><a class="close-link"><i class="fa fa-close"></i></a></li>
					</ul>
					<div class="clearfix"></div>
				</div>


				<form action="MessAttendance" method="post"
					data-parsley-validate class="form-horizontal form-label-left">


					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">Select
							Attendance Type</label>
						<div class="col-md-6 col-xs-12">
							<select class="form-control col-md-7 col-xs-12" name="AttendanceType"
								required="required">
								<option value="Present">Present</option>
								<option value="Absent">Absent</option>
								<option value="Leave">Leave</option>
							</select>
						</div>
					</div>
					<br>
					<br>
					<br>
					<br>


					<table class="table table-bordered">

						<thead>
							<tr>
								<th>Mess Number</th>
								<th>Student First Name</th>
								<th>Student Last Name</th>
								<th>Attendance</th>

							</tr>
						</thead>
						<c:forEach items="${sessionScope.HMessList}" var="ls">
							<tbody>
								<tr>
									<td scope="row"><c:out value="${ls.hmessId}" /></td>
									<td><c:out
											value="${ls.hostelregistration.applicationforadmission.applicantFirstName }" /></td>
									<td><c:out
											value="${ls.hostelregistration.applicationforadmission.applicantLastName }" /></td>
									<td><input type="checkbox" class="flat" name="attendance"
										value="${ls.hmessId}"></td>

								</tr>
						</c:forEach>
					</table>


					<div class="ln_solid"></div>
					<div class="form-group">
						<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
							<button type="submit" class="btn btn-primary">Cancel</button>
							<button type="submit" class="btn btn-success" name="flag"
								value="FrmSubmit">Submit</button>
						</div>
					</div>

				</form>

				<br />
			</div>
		</div>
	</div>
</div>

<%@include file="AdminFooter.jsp"%>