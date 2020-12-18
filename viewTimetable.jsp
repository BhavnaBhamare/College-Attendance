  <%@include file="TeacherHeader.jsp"%>
<%@page import="com.model.BLmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.pojo.*"%>
<%@ page import="com.model.*"%>
<%@ page import="java.util.List"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	BLmanager bLmanager=new BLmanager();

List<Classdetail> l1=bLmanager.searchByClassList();
session.setAttribute("classList", l1);
%>

							<div class="right_col" role="main">
	<div class="x_panel" id="op">
		<div class="x_title">
		 <h3>Class TimeTable</h3>
			<br /> <br /> <br />
			<div class="x_content">
				<br /> <br /> <br />


				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<form action="Teacherviewtimetable" method="post" id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">


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



						
	
<!-- Table view -->
<table  class="table table-striped table-responsive" border="1">

 <thead>
      <tr>
      <th>Sr.No</th>
       <th>Time</th>
        <th>Day</th>
        <th>Subject</th>
      
      </tr>
    </thead>
    <tbody>
<tr>           
      <td rowspan="9">
<c:forEach items="${sessionScope.timeTable}" var="l" >
      
	   <c:out value="${l.timeTableId } "/><br>
	 </c:forEach>
	 </td>
	  <td rowspan="9">
<c:forEach items="${sessionScope.timeTable}" var="l" >
      
	   <c:out value="${l.timeTableTime } "/><br>
	 </c:forEach>
	 
	 </td>
	  <td rowspan="9">
<c:forEach items="${sessionScope.timeTable}" var="l" >
      
	   <c:out value="${l.timeTableDay } "/><br>
	 </c:forEach>
	 
	 </td>
	 <td rowspan="9">
<c:forEach items="${sessionScope.timeTable}" var="l" >
      
	   <c:out value="${l.subject.subjectName} "/><br>
	 </c:forEach>
	 
	 </td>
</tr>
</tbody>
</table>
</form>
					</div>
				</div>

			</div>









		</div>

	<!-- footer content -->

		<%@include file="Footer.jsp"%>
</div>
</html>