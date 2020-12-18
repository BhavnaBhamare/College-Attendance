<!--by Shailesh Jain  -->
<%@include file="TeacherHeader.jsp"%>
<%@page import="java.util.Set"%>
<%@page import="com.pojo.Examtransaction"%>
<%@page import="com.pojo.Studentdetail"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.Subject"%>
<%@ page import="com.pojo.Department"%>
<%@ page import="com.model.BLmanager"%>
<%@page import="com.pojo.Division"%>
<%@page import="com.pojo.Classdetail"%>
<%@page import="com.pojo.Examtype"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
		BLmanager bl = new BLmanager();

		List<Classdetail> l = bl.viewClassDetails();
		List<Division> l2 = bl.viewDivision();		
		List<Examtype> l4 = bl.viewExamTypeList();
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
						<B>VIEW REPORT</B>
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
							action="viewMarksByClass.jsp" method="post">
							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Class <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select id="className" name="className"
										class="form-control col-md-7 col-xs-12" required>

										<option value="">Select Class</option>
										<c:forEach items="${sessionScope.l}" var="c">
											<option value="${c.classId}">${c.className}</option>
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

									<select id="divName" name="divName" class="form-control col-md-7 col-xs-12" required>

										<option value="">Select Division</option>
										<c:forEach items="${sessionScope.list}" var="c">
											<option value="${c.divId}">${c.divName}</option>
										</c:forEach>
									</select>
								</div>
							</div>							
							<br>

							
							<%
								session.removeAttribute("l2");
								session.setAttribute("list", l4);
							%>
							
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Exam Type <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">

									<select id="examType" name="examType" class="form-control col-md-7 col-xs-12" required> 

										<option value="">Select Exam Type</option>
										<c:forEach items="${sessionScope.list}" var="c">										
											<option value="${c.examTypeId}">${c.examTypeName}</option>
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
								data-toggle="modal" data-target="#myModal" style="width: 110px;">View Report</button>
							&nbsp;
							<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
							

						</div>
						<br>

					</form>
				</div>
			</div>
		</div>
	</div>

</div>
<script type="text/javascript">
function refresh() {
			var className= document.getElementById("className").value;
			var divName = document.getElementById("divName").value;
			var examTypeId = document.getElementById("examType").value;
			var subjectId = document.getElementById("subjectName").value;
			
			window.location.href="viewMarksByClass.jsp?className="+className+"&divName="+divName+"&examType="+examTypeId+"&subjectName="+subjectId;
		}
</script>
<%@include file="Footer.jsp"%>