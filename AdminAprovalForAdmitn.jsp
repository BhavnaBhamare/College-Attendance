<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.pojo.Applicationforadmission"%>
<%@page import="com.model.BlManagerAdmission"%>
<%@page import="java.util.List"%>
<jsp:include page="AdminHeader.jsp" />
<%
	BlManagerAdmission bl = new BlManagerAdmission();
	List<Applicationforadmission> StudentsApplicationList = bl.AprovalListOfStudents();
	;

	System.out.println(StudentsApplicationList);
	HttpSession ss = request.getSession();
	ss.setAttribute("StudentsApplicationList", StudentsApplicationList);
%>
<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>List of Student Application For New Admission</h2>
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

						<form class="form-horizontal form-label-left"
							action="ApprovalStatusOfAdmitnFromAdmin" method="post">

							<table class="table table-bordered">

								<thead>
									<tr>
										<th>Applied Course Name</th>
										<th>SSC Percentage</th>
										<th>HSC Percentage</th>
										<th>Diploma Percentage</th>
										<th>Bachelor's Percentage</th>
										<th>Master's Percentage</th>
										<th>Accept</th>
										<th>Reject</th>


									</tr>
								</thead>
								<c:forEach items="${sessionScope.StudentsApplicationList}"
									var="ls">

									<tr>
										<td><c:out value="${ls.course.courseName }" /></td>
										<td><c:out value="${ls.sscdetail.percentage }" /></td>
										<td><c:out value="${ls.hscdetail.percentage }" /></td>
										<td><c:out value="${ls.diplomadetail.percentage }" /></td>
										<td><c:out value="${ls.bachelordetail.percentage }" /></td>
										<td><c:out value="${ls.masterdetail.percentage }" /></td>
										<td><a
											href="ApprovalStatusOfAdmitnFromAdmin?AID=${ls.applicationId}">Accept</a></td>
										<td><a
											href="ApprovalStatusOfAdmitnFromAdmin?RID=${ls.applicationId}">Reject</a></td>



									</tr>

								</c:forEach>
							</table>

						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>

<jsp:include page="AdminFooter.jsp" />