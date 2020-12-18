  <%@include file="TeacherHeader.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

						<form action="cDetail" method="post" id="demo-form2"
							class="form-horizontal form-label-left">

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12">
									Enter Class Name:<span class="required"></span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="className"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>


							<br>

							<div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
									class="required"></span> </label>
								<button type="submit"
									class="btn btn-primary col-md-8 col-sm-8col-xs-12"
									data-toggle="modal" data-target="#myModal" style="width: 90px;">Submit</button>
								&nbsp;&nbsp;
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="Footer.jsp"%>
</div>