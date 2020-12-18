
  <%@include file="TeacherHeader.jsp"%>
<%@ page import="com.model.BLmanager"%>
<%@ page import="com.pojo.Subject"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- page content -->
<%
	BLmanager bl = new BLmanager();

	List<Subject> l = bl.searchBySubjectList();
	session.setAttribute("subList", l);
%>



<div class="right_col" role="main">

	<div class="page-title">
		<div class="title_left"></div>

		<div class="title_right"></div>
	</div>
	<div class="clearfix"></div>

	<div style="color: #00b300; text-align: center;">${MsgSub}</div>
	<%
		session.removeAttribute("MsgSub");
	%>

	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="x_panel" id="op">
			<div class="x_title">
				<h2>
					<B>Add Subject</B>
				</h2>
				<h2>
					<small></small>
				</h2>

				<div class="clearfix"></div>
			</div>



			<div class="x_content">

				<form class="form-horizontal form-label-left"
					action="AddSubjectServ" method="post">





					<div class="form-group">

						<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
							Subject <span class="required">*</span>
						</label>
						<div class="col-md-6 col-sm-6 col-xs-12">
							<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

							<input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12">
							
								
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
<%@include file="Footer.jsp"%>