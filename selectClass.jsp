<!--by Shailesh Jain  -->
<%@include file="TeacherHeader.jsp"%>
<%@page import="com.pojo.Division"%>
<%@page import="com.pojo.Classdetail"%>
<%@ page import="java.util.List"%>
<%@ page import="com.model.BLmanager"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	BLmanager bl = new BLmanager();

	List<Classdetail> l = bl.viewClassDetails();
	List<Division> l2 = bl.viewDivision();
	session.setAttribute("l", l);
%>




<!--  page content -->

<div class="right_col" role="main">


	<div class="row">

		<div class="col-md-12 col-sm-12 col-xs-12">
			<br>
			<div class="x_panel" id="op">
				<div class="x_title">
					<h2>
						<B>Select Class</B>
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
						action="viewStudListbyClass.jsp" method="post">

						<br>
						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
								Class <span class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select name="className" class="form-control col-md-7 col-xs-12">

									<option value="">Select Class</option>
									<c:forEach items="${sessionScope.l}" var="c">
										<option value="${c.className}">${c.className}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<%
							session.removeAttribute("l");
							session.setAttribute("list", l2);
						%>
						<br>
						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Division<span
								class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select name="divName" class="form-control col-md-7 col-xs-12">

									<option value="">Select Division</option>
									<c:forEach items="${sessionScope.list}" var="c">
										<option value="${c.divName}">${c.divName}</option>
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
							&nbsp;
							<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
							&nbsp; <a href="#"><button type="button" id="btncancel"
									class="btn btn-success" style="width: 90px;">Cancel</button></a>

						</div>
						<br>

					</form>
				</div>
			</div>
		</div>
	</div>

</div><%@include file="Footer.jsp"%>