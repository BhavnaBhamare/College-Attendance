<%@page import="com.model.BlManagerAccount"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.pojo.Applicationforadmission"%>
<%@page import="com.model.BlManagerAdmission"%>
<%@page import="java.util.List"%>
<jsp:include page="AccountantHeader.jsp" />
<%
	BlManagerAccount bl = new BlManagerAccount();
	List<Applicationforadmission> ApprovedStudentsList = bl.AprovalListOfStudents();
	System.out.println(ApprovedStudentsList);
	HttpSession ss = request.getSession();
	ss.setAttribute("ApprovedStudentsList", ApprovedStudentsList);
%>

<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>STUDENT LIST FOR PAYMENT OF ADMISSION</h2>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small> </small>
						</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>

							<li><a class="close-link"><i class="fa fa-close"></i></a></li>
						</ul>
						<div class="clearfix"></div>
					</div>

					<form class="form-horizontal form-label-left"
						action="ApprovalStatusOfAdmitnFromAdmin" method="post">

						<table class="table table-striped">

							<thead>
								<tr>
									<th>Registration Id</th>
									<th>Student Name</th>
									<th>Course</th>
									
								</tr>
							</thead>
							<c:forEach items="${sessionScope.ApprovedStudentsList}" var="ls">

								<tr>
									<td><c:out value="${ls.registration.regId}" /></td>
									<td><c:out value="${ls.applicantFirstName }" /></td>
									<td><c:out value="${ls.course.courseName }" /></td>
									
									<td><a
										href="AccontantTakingAdmitnFees.jsp?AID=${ls.applicationId}">Go
											For Payment</a></td>
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