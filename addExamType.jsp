<%@include file="TeacherHeader.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.*"%>


<!-- page content -->

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

						<form action="" method="post" id="demo-form2"
							data-parsley-validate class="form-horizontal form-label-left">
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

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


	<%@include file="Footer.jsp"%>


</div>
