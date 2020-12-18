<%@include file="TeacherHeader.jsp"%>
<%@ page import="com.model.BLmanager"%>
<%@ page import="com.pojo.Classdetail"%>
<%@ page import="com.pojo.Notice"%>
<%@ page import="com.pojo.Division"%>
<%@ page import="com.pojo.Teacherdetail"%>
<%@ page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<%
	BLmanager bLmanager = new BLmanager();
	List<Classdetail> l1 = bLmanager.searchByClassList();
	session.setAttribute("classList", l1);

	List<Division> l2 = bLmanager.searchByDivList();

	session.setAttribute("divList", l2);
%>


<head>


</head>







<div class="right_col" role="main">

	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br /> <br />

			<h3>STUDENT ATTENDANCE</h3>

			<div class="x_content">
				<br /> <br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form action="Addattendanceser" method="post" id="demo-form2"
							class="form-horizontal form-label-left">

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Attendance ClassName<span
									class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select name="attendanceclass"
										class="form-control col-md-7 col-xs-12">
										<option value="0">Select Class</option>

										<c:forEach items="${sessionScope.classList}" var="c">
											<option value="${c.className}">${c.className}</option>
										</c:forEach>

									</select>
								</div>
							</div>
							<br>


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





							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"><span
									class="required"></span> </label>
								<button type="submit"
									class="btn btn-primary col-md-6 col-sm-6 col-xs-12"
									data-toggle="modal" data-target="#myModal" style="width: 90px;">Submit</button>
								&nbsp;&nbsp;
								<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
								&nbsp; <a href="#"><button type="button" id="btncancel"
										class="btn btn-success" style="width: 90px;">Cancel</button></a>

							</div>


						</form>




					</div>
				</div>
				<!-- <p class="pull-righr">	<a >EDIT</a><a
					href="https://Edit">Colorlib</a>
			</p> -->
			</div>



		</div>

	</div>









</div>
<%@include file="Footer.jsp"%>