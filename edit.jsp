  <%@include file="TeacherHeader.jsp"%>
<%@ page import="com.model.BLmanager"%>
<%@ page import="com.pojo.Classdetail"%>
<%@ page import="com.pojo.Notice"%>
<%@ page import="com.pojo.Teacherdetail"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- page content -->
<%
	//BLmanager bl=new BLmanager();

	//List<Classdetail> l = bl.searchByclassname();
	//session.setAttribute("classList", l);
%>
<head>

</head>

<div class="right_col" role="main">

	<!-- top tiles -->

	<!-- /top tiles -->

	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br /> <br />

			<div class="x_content">
				<br /> <br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form action="Editnotice" method="post" id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">


							<input type="hidden" name="id" value="${ed.noticeId}">

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
									Class Name <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

									<select name="className"
										class="form-control col-md-7 col-xs-12">
										<!-- <option value="0">Select Class Name</option> -->
										<%--  <c:forEach items="${sessionScope.ed}" var="c"> --%>
										<option value="${ed.classdetail.className}">
											${ed.classdetail.className}</option>

									</select>
								</div>
							</div>
							<br>


							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Notice
									Date<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="date" name="noticeDate" required
										value="${ed.noticeDate }"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Notice
									Description<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<textarea rows="10" cols="10" name="noticeDescription"
										class="form-control col-md-7 col-xs-12">
										<c:out value="${ed.noticeDescription}" />
									</textarea>
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
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="Footer.jsp"%></div>