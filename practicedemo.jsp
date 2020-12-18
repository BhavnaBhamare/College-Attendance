  <%@include file="TeacherHeader.jsp"%>
<%@ page import="com.model.BLmanager"%>
<%@ page import="com.pojo.Classdetail"%>
<%@ page import="com.pojo.Notice"%>
<%@ page import="com.pojo.Division"%>
<%@ page import="com.pojo.Teacherdetail"%>
<%@ page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>


</head>

<div class="right_col" role="main">

	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br />
			<div style="color: #00b300; text-align: center;">${MsgSub}</div>
			<%
				session.removeAttribute("MsgSub");
			%>

			<h3>Add Subject</h3>

			<div class="x_content">
				<br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form class="form-horizontal form-label-left"
							action="AddSubjectServ" method="post">

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
									Subject </label>
								<div class="col-md-6 col-sm-6 col-xs-12">


									<select name="subjectName"
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
								<label class="control-label col-md-3 col-sm-3 col-xs-12"><span
									class="required"></span> </label>
								<button type="submit"
									class="btn btn-primary col-md-6 col-sm-6 col-xs-12"
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

	<%@include file="Footer.jsp"%>

</div>