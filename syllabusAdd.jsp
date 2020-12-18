<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%@include file="TeacherHeader.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.Subject"%>
<%@ page import="com.pojo.Department"%>
<%@ page import="com.model.BLmanager"%>
<!-- page content -->
<%
	BLmanager bl = new BLmanager();

	List<Subject> l = bl.searchBySubjectList();
	session.setAttribute("subList", l);

	List<Department> l1 = bl.searchByDepartmentList();
	session.setAttribute("deptList", l1);
%>



<head>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-timepicker.min.js"></script>
</head>




<div class="right_col" role="main">

	<div class="page-title">
		<div class="title_left"></div>

		<div class="title_right">
			<div
				class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
				<div class="input-group"></div>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>

	<div style="color: #00b300; text-align: center;">${MsgTeacher}</div>
	<%
		session.removeAttribute("MsgSyllabus");
	%>

	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="x_panel" id="op">
			<div class="x_title">
				<h2>
					<B>Add New Syllabus</B>
				</h2>
				<h2>
					<small></small>
				</h2>
				<ul class="nav navbar-right panel_toolbox">
					<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
					</li>


				</ul>
				<div class="clearfix"></div>
			</div>



			<div class="x_content">

				<form class="form-horizontal form-label-left"
					action="SyllabusAddServ" method="post">
					
					<div class="form-group">




						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Subject <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

							<select name="syllabusClass"
								class="form-control col-md-7 col-xs-12">
								<option value="0">Select Subject Name</option>
								<c:forEach items="${sessionScope.subList}" var="c">
									<option value="${c.subjectName}">${c.subjectName}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<br> <input type="hidden" name="tcherFirstName"
						value="${user}">

					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Department <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

							<select name="syllabusSubject"
								class="form-control col-md-7 col-xs-12">
								<option value="0">Select Subject Name</option>
								<c:forEach items="${sessionScope.deptList}" var="c">
									<option value="${c.departmentName}">${c.departmentName}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<br>

					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Syllabus Modules<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="syllabusModules" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>

					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Syllabus Practical <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="syllabusPracticals" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>
					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Syllabus Chapter<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="syllabusChapters" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>

					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Syllabus Chapter Subject <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="syllabusChapSubPoint" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>
					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
							Syllabus Total Hours<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="syllabusTotalHours" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>
					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Syllabus Date<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="date" name="syllabusDate" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>
					<!-- <div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Syllabus TacherID <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="syllabusTcherId" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br> -->

					<div class="form-group">
						<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
							class="required"></span> </label>
						<button type="submit"
							class="btn btn-primary col-md-4 col-sm-4 col-xs-12"
							data-toggle="modal" data-target="#myModal" style="width: 90px;">Submit</button>
						&nbsp;
						<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
						&nbsp; <a href="#"><button type="button" id="btncancel"
								class="btn btn-success" style="width: 90px;">Cancel</button></a>

					</div>


				</form>

			</div>
		</div>
	</div>

</div>
<%@include file="Footer.jsp"%>