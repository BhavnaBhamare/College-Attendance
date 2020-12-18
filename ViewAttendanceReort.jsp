<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="TeacherHeader.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.*"%>
<%@ page import="com.model.*"%>
<%
	BLmanager bLmanager=new BLmanager();

List<Subject> l1=bLmanager.searchBySubjectList();
session.setAttribute("subjectList", l1);
List<Classdetail> l2=bLmanager.searchByClassList();
session.setAttribute("classList", l2);
List<Division> l3 = bLmanager.searchByDivList();

session.setAttribute("divList", l3);
%>
<!-- page content -->

<head>

</head>

<div class="right_col" role="main">

	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br />

			<h3>Report Attendance</h3>

			<div class="x_content">
				<br /> <br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form action="ViewAttndReportServ" method="post"  id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">
							
							
							 <div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Attendance Date<span
									class="required"></span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input  name="attendancedate" type="date" class="form-control" style="width: 100%;" required>
								</div>
							</div>
							<br>
             

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Timetable Subject<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendancesubject" class="form-control"
										style="width: 100%;">
											<option value="0">Select Subject</option>
										<c:forEach items="${sessionScope.subjectList}" var="c">
											<option value="${c.subjectName}">${c.subjectName}</option>
										</c:forEach>
										

									</select>
								</div>
							</div>
                           
                           <!-- class -->
                           <div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Timetable Class<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendanceclass" class="form-control"
										style="width: 100%;">
											<option value="0">Select Subject</option>
										<c:forEach items="${sessionScope.classList}" var="c">
											<option value="${c.className}">${c.className}</option>
										</c:forEach>
										

									</select>
								</div>
							</div>
                           
                           
                           <div class="form-group">
								<label for="middle-name"
									class="control-label col-md-3 col-sm-3 col-xs-12">Select
									Division</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<select id="middle-name"
										class="form-control col-md-7 col-xs-12" name="attnddiv">
										<option value="0">Select Division</option>
										<c:forEach items="${sessionScope.divList}" var="c">
											<option value="${c.divName}">${c.divName}</option>
										</c:forEach>





									</select>
								</div>
							</div>
							<br>
                           
                           
                           
                           
                           
                           	<!-- type -->
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Attendance Type*<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendancetype" class="form-control"
										style="width: 100%;" required>
										<option value="0">Choose..</option>
										<option value="Theory">Theory</option>
										<option value="Practical">Practical</option>
										

									</select>
								</div>
							</div>
                           
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
									class="required"></span> </label>
								<button type="submit"
									class="btn btn-primary col-md-4 col-sm-4 col-xs-12"
									data-toggle="modal" data-target="#myModal" style="width: 90px;">Submit</button>
								&nbsp;&nbsp;
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


	<%@include file="Footer.jsp"%>


</html>