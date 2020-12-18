<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="AdminHeader.jsp"%>


<%@ page import="java.util.List"%>
<%@ page import="com.model.BlManagerHostel"%>
<%@ page import="com.pojo.Hostelregistration"%> 
<%@ page import="com.pojo.Hostelroomsallot"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>

<%
	BlManagerHostel bl = new BlManagerHostel();
	List<Hostelregistration> HRoomRegList = bl.getAllRegApplication();

	HttpSession session1 = request.getSession();
	session1.setAttribute("HRoomRegList", HRoomRegList);
%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>Applicant List</h2>
			</div>


		</div>
		<div class="clearfix"></div>
	</div>
	<div class="row">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_title">
					<h2>
						<small> </small>
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
						</li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-expanded="false"><i
								class="fa fa-wrench"></i></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Settings 1</a></li>
								<li><a href="#">Settings 2</a></li>
							</ul></li>
						<li><a class="close-link"><i class="fa fa-close"></i></a></li>
					</ul>
					<div class="clearfix"></div>
				</div>

				<table class="table table-bordered">

					<thead>
						<tr>
						<th>Application Number</th>
							<th>Student First Name</th>
							<th>Student Last Name</th>
							<th>Student Room Type</th>
							<th>Room Number</th>
							<th>Mess Number</th>
							<!-- <th>Approve</th> -->
							<th>Accept</th>
							<th>Reject</th>
							

						</tr>
					</thead>
					<c:forEach items="${sessionScope.HRoomRegList}" var="ls">
						<tbody>
							<tr>
								<td scope="row"><c:out value="${ls.hregId}" /></td>
								<td><c:out value="${ls.applicationforadmission.applicantFirstName }" /></td>
								<td><c:out value="${ls.applicationforadmission.applicantLastName }" /></td>
								<td><c:out value="${ls.hroomType }" /></td>
								<%-- <c:if test="${ls.hostelroomsallot.hostelRoomNumber !=null}"> --%>
								<td><c:out value="${ls.hostelroomsallot.hostelRoomNumber}" /></td>
								<%-- </c:if> --%>
								<td><c:out value="${ls.hostelmess.hmessId }" /></td>
								<td><a href="AdminHostelRejectServ?Aid=${ls.hregId}">Accept</a></td>
								<td><a href="AdminHostelRejectServ?Rid=${ls.hregId}">Reject</a></td>
								<%-- <td> <%
								//for(Hostelregistration h:HRoomRegList.get(index))
								
									
									
								if(HRoomRegList.get(2)==null){
									
									String a="Set";
									HttpSession session2 = request.getSession();
									session1.setAttribute("Stu", a);
								}
								else{String a="Alloted";
								
								HttpSession session2 = request.getSession();
								session1.setAttribute("Stu", a);
								}
								%>${Stu}</td> --%>

							</tr>
					</c:forEach>
				</table>

				<br />
			</div>
		</div>
	</div>
</div>

<%@include file="AdminFooter.jsp"%>