<jsp:include page="AdminHeader.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.pojo.Studentadmitnfees"%>
<%@page import="com.model.BlManagerAdmission"%>
<%@page import="java.util.List"%>

<%
	BlManagerAdmission bl = new BlManagerAdmission();
	List<Studentadmitnfees> ApplicableStudentsList = bl.ApplicableStudentsList();

	System.out.println(ApplicableStudentsList);
	HttpSession ss = request.getSession();
	ss.setAttribute("ApplicableStudentsList", ApplicableStudentsList);
%>
<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>List of Applicable Student For Enrollment</h2>
			</div>

			<div class="clearfix"></div>

			<div class="row">
				<div class="col-md-12 col-sm-12 col-xs-12">
					<div class="x_panel">
						<div class="x_title">
							<h2>
								<small> </small>
							</h2>
							<ul class="nav navbar-right panel_toolbox">
								<li><a class="collapse-link"><i
										class="fa fa-chevron-up"></i></a></li>

								<li><a class="close-link"><i class="fa fa-close"></i></a></li>
							</ul>
							<div class="clearfix"></div>
						</div>

						<table class="table table-stripped table-hover">

							<thead>
								<tr>
									<th>Application Id</th>
									<th>Student Name</th>
									<th>Applied Course Name</th>
									<th>Applied Branch Name</th>
								</tr>
							</thead>
							<c:forEach items="${sessionScope.ApplicableStudentsList}"
								var="ls">

								<tr>
									<td><c:out
											value="${ls.applicationforadmission.applicationId}" /></td>
									<td><c:out
											value="${ls.applicationforadmission.applicantFirstName }" /></td>
									<td><c:out value="${ls.course.courseName }" /></td>
									<td><c:out
											value="${ls.applicationforadmission.branch.branchName }" /></td>
									<td><a
										href="AdminGenerateEnrollment?AID=${ls.feesPaymentId }">Generate
											Enrollment</a></td>
								</tr>

							</c:forEach>
						</table>

					</div>
				</div>

			</div>
		</div>
	</div>
</div>
<jsp:include page="AdminFooter.jsp"></jsp:include>