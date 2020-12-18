<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="TeacherHeader.jsp"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.pojo.*"%>
<%@ page import="com.model.*"%>
<%@ page import="java.util.List"%>
  

<%
	BLmanager bLmanager=new BLmanager();

List<Subject> l1=bLmanager.searchBySubjectList();
session.setAttribute("subjectList", l1);
List<Classdetail> l2=bLmanager.searchByClassList();
session.setAttribute("classList", l2);
%>

							<div class="right_col" role="main">
	<div class="x_panel" id="op">
		<div class="x_title">
		 <h3>Class Attendance</h3>
			<br /> <br /> <br />
			<div class="x_content">
				<br /> <br /> <br />


				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<form action="ViewAttendance" method="post" id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">

                          <!-- Date -->
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
                           
                            <!-- status -->
                            <div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Attendance Status<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendancestatus" class="form-control"
										style="width: 100%;" required>
										<option value="0">Choose..</option>
										<option value="Present">Present</option>
										<option value="Absent">Absent</option>
										

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



						
	
<!-- Table view -->
<table  class="table table-striped table-responsive" border="1">

 <thead>
      <tr>
      <th>Student EnrollNo</th>
       <th>Student Name</th>
        <th>Date</th>
        <th>Status</th>
       
      
      </tr>
    </thead>
    <tbody>
<tr>           
      <td rowspan="9">
<c:forEach items="${sessionScope.att}" var="l" >
      
	   <c:out value="${l.studentdetail.studEnrollmentN } "/><br>
	 </c:forEach>
	 </td>
	  <td rowspan="9">
<c:forEach items="${sessionScope.att}" var="l" >
      
	   <c:out value="${l.studentdetail.studName } "/><br>
	 </c:forEach>
	 
	 </td>
	  <td rowspan="9">
<c:forEach items="${sessionScope.att}" var="l" >
      
	   <c:out value="${l.attndDate } "/><br>
	 </c:forEach>
	 
	 </td>
	 <td rowspan="9">
<c:forEach items="${sessionScope.att}" var="l" >
      
	   <c:out value="${l. attndStaus} "/><br>
	 </c:forEach>
	 
	 </td>
	 
	 
	 
</tr>
</tbody>
</table>
<%

session.removeAttribute("att");
%>
</form>
					</div>
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