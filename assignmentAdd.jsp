
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

	List<Department> l1 = bl.searchByDepartmentList();
	session.setAttribute("deptList", l1);
%>


<div class="right_col" role="main">

	<div class="page-title">
		<div class="title_left"></div>

		<div class="title_right">
			<div
				class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
				<div class="input-group"></div>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>

	<div style="color: #00b300; text-align: center;">${MsgTeacher}</div>

	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="x_panel" id="op">
			<div class="x_title">
				<h2>
					<B>Add New Assignment</B>
				</h2>
				<h2>
					<small></small>
				</h2>
				<ul class="nav navbar-right panel_toolbox">
					<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
					</li>

				</ul>
				<div class="clearfix"></div>
			</div>



			<div class="x_content">

				<form class="form-horizontal form-label-left"
					action="AssignmentAddServ" method="post">



					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Select
							Assignment Subject <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

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

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Assignment DateOf Starting<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="date" name="assignDateOfStarting" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>
					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Assignment DateOf Ending<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="date" name="assignDateOfEnding" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>
					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
							Assignment Late Submit Date<span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="date" name="assignLateSubDate" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br>

					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Assignment Type <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="text" name="assignType" required
								class="form-control col-md-7 col-xs-12">
						</div>
					</div>
					<br> <br>


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
	<%@include file="Footer.jsp"%>

