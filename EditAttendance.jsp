  <%@include file="TeacherHeader.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.pojo.*"%>
<%@ page import="com.model.*"%>
<%@ page import="java.util.List"%>



<head>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-timepicker.min.js"></script>
</head>
<div class="right_col" role="main">
	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br /> <br />
			<h3>Edit Attendance</h3>
			<div style="color: #00b300; text-align: center;">${MsgSub}</div>
			<div class="x_content">
				<br /> <br /> <br />

<%
		session.removeAttribute("MsgSub");
	%>
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<form action="UpdateAttendance" method="post" id="demo-form2"
							 class="form-horizontal form-label-left">


							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Attendance ClassName<span
									class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendancecls" class="form-control"
										style="width: 100%;"readonly>
										

										
											<option value="${att.classdetail.className}" readonly>${att.classdetail.className}</option>
										

									</select>
								</div>
							</div>





							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Attendance Date<span
									class="required"></span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input  name="attendancedate" type="date" class="form-control" style="width: 100%;" value="${att.attndDate}" readonly>
								</div>
							</div>
							<br>

							<!-- dynamic subject -->
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Attendance SubjectName<span
									class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendancesubjectname" class="form-control"
										style="width: 100%;">
										
											<option value="${att.subject.subjectName}" readonly>${att.subject.subjectName}</option>
										

									</select>
								</div>
							</div>
				<!-- type -->
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Attendance Type*<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendancetype" class="form-control"
										style="width: 100%;" required>
																			
										<option value="${att.attndType }"readonly>${att.attndType }</option>
										

									</select>
								</div>
							</div>
							
							<!-- table -->
							 <br>
                         <br>
                         <br>
 <div class="table-responsive" align="center">                      
<table class="table table-striped table-bordered">

  <tr style="background-color:#d8dbdf; ">
    
    <th >Student EnrollN</th>
    <th>Studnet Name</th>
    <th>Present</th>
     <th>Absent</th>
  </tr>
 
   
  
  <tr>
    <td >
    
    <input type="hidden" name="enroll" value="${att.studentdetail.studEnrollmentN }">
    <input type="hidden" name="id" value="${att.attndId }">
    <c:out value="${att.studentdetail.studEnrollmentN }"></c:out></td>
    <td><c:out value="${att.studentdetail.studName }"></c:out></td>
    <td><input type="radio" name="Status" value="Present" ></td>
    <td><input type="radio" name="Status" value="Absent" ></td>
  </tr>
  
    
  
  
</table>
<br><br>
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

	<!-- footer content -->

	<footer>
	<div class="copyright-info">
		<p class="pull-right">
			Gentelella - Bootstrap Admin Template by <a
				href="https://colorlib.com">Colorlib</a>
		</p>
	</div>
	<div class="clearfix"></div>
	</footer>
	<!-- /footer content -->
</div>

</html>