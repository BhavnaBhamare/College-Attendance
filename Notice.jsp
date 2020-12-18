  <%@include file="TeacherHeader.jsp"%>
<%@ page import="com.model.BLmanager"%>
<%@ page import="com.pojo.Classdetail"%>
<%@ page import="com.pojo.Notice"%>
<%@ page import="com.pojo.Teacherdetail"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- page content -->
<%
	BLmanager bl = new BLmanager();

	List<Classdetail> l = bl.searchByclassname();
	session.setAttribute("classList", l);
%>
<head>

</head>

<div class="right_col" role="main">

	<div class="x_panel" id="op">
		<div class="x_title">
		 
		
			

			<h3>Add Notice</h3>

			<div class="x_content">
				<br /> <br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form action="noticeservlet" method="post" id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
									Class Name <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

									<select name="className"
										class="form-control col-md-7 col-xs-12">
										<option value="0">Select Class Name</option>
										<c:forEach items="${sessionScope.classList}" var="c">
											<option value="${c.className}">${c.className}</option>
										</c:forEach>
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
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Notice
									Description<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<textarea rows="10" cols="10" name="noticeDescription" required
										class="form-control col-md-7 col-xs-12"></textarea>
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
			










			</div>
		</div>
	</div>









</div>
	<%@include file="Footer.jsp"%>