
<%@include file="TeacherHeader.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.pojo.*"%>
<%@ page import="com.model.*"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<%
	BLmanager bLmanager = new BLmanager();
	List<Subject> l = bLmanager.searchBySubjectList();
	session.setAttribute("subList", l);

	List<Classdetail> l1 = bLmanager.searchByClassList();
	session.setAttribute("classList", l1);
	/* 
	 List<Studentdetail> l2=bLmanager.searchByStudentList();
	 session.setAttribute("studentList",l2);

	 List<Teacherdetail> l3=bLmanager.searchByTeacherList();
	 session.setAttribute("teacherList", l3);  */
%>
<head>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-timepicker.min.js"></script>
</head>
<div class="right_col" role="main">
	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br /> <br />
			<div class="x_content">
				<br /> <br /> <br />


				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<form action="AddTimeTable" method="post" id="demo-form2"
							class="form-horizontal form-label-left">


							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Timetable Day<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="timeTableDay" class="form-control"
										style="width: 100%;">
										<option value="">Choose..</option>
										<option value="SUNDAY">SUNDAY</option>
										<option value="MONDAY">MONDAY</option>
										<option value="TUESDAY">TUESDAY</option>
										<option value="WEDNESDAY">WEDNESDAY</option>
										<option value="THURSDAY">THURSDAY</option>
										<option value="FRIDAY">FRIDAY</option>
										<option value="SATURDAY">SATURDAY</option>


									</select>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">TimetableDate<span
									class="required"></span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input name="timeTableDate" type="date" class="form-control"
										style="width: 100%;">
								</div>
							</div>
							<br>




							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">TimetableTime<span
									class="required"></span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="birthday" name="timeTablTime"
										class="date-picker form-control col-md-7 col-xs-12"
										type="time">
								</div>
							</div>
							<!-- dynamic subject -->





							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Timetable SubjectName<span
									class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="timetablesubjectname" class="form-control"
										style="width: 100%;">
										<option value="0">Select Subject</option>

										<c:forEach items="${sessionScope.subList}" var="c">
											<option value="${c.subjectName}">${c.subjectName}</option>
										</c:forEach>

									</select>
								</div>
							</div>
							<!-- Dynamic class -->
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Timetable Class<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="timetableclass" class="form-control"
										style="width: 100%;">
										<option value="0">Select class</option>
										<c:forEach items="${sessionScope.classList}" var="c">
											<option value="${c.className}">${c.className}</option>
										</c:forEach>

									</select>
								</div>
							</div>

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

	</div>

</div>



<%@include file="Footer.jsp"%>