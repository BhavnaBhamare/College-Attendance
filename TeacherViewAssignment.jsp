<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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



%>
<head>

</head>

<div class="right_col" role="main">

	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br />

			<h3>View Assignment</h3>

			<div class="x_content">
				<br /> <br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form action="viewAssignment" method="post" id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">
					
							
							<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Select
							Assignment Subject <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							

							<select name="assignSubjectName"
								class="form-control col-md-7 col-xs-12">
								<option value="0">Select Subject Name</option>
								<c:forEach items="${sessionScope.subList}" var="c">
									<option value="${c.subjectName}">${c.subjectName}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<br>
							

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
							
							<!-- Table view -->
<table  class="table table-striped table-responsive" border="1">

 <thead>
      <tr>
      <th>Date of Starting</th>
       <th>Date of Ending</th>
        <th>Assignment Type</th>
       
      
      </tr>
    </thead>
    <tbody>
<tr>           
      <td rowspan="9">
<c:forEach items="${sessionScope.list}" var="l" >
      
	   <c:out value="${l.assignDateOfStarting } "/><br>
	 </c:forEach>
	 </td>
	  <td rowspan="9">
<c:forEach items="${sessionScope.list}" var="l" >
      
	   <c:out value="${l.assignDateOfEnding } "/><br>
	 </c:forEach>
	 
	 </td>
	  <td rowspan="9">
<c:forEach items="${sessionScope.list}" var="l" >
      
	   <c:out value="${l.assignType } "/><br>
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

</div>
	</div>


	<%@include file="Footer.jsp"%>


</html>