<%@page import="com.pojo.Events"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="AdminHeader.jsp"%>


<%@ page import="java.util.List"%>
<%@ page import="com.model.BlManagerADMIN"%>
<%@ page import="com.pojo.Holidays"%> 
<%@ page import="javax.servlet.http.HttpServletRequest"%>

<%
	BlManagerADMIN bl = new BlManagerADMIN();
	List<Events> EventList = bl.EventList() ;

	HttpSession session1 = request.getSession();
	session1.setAttribute("EventList", EventList);
%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>Event List</h2>
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
						<th>Event Name</th>
							<th>Date</th>
							

						</tr>
					</thead>
					<c:forEach items="${sessionScope.EventList}" var="ls">
						<tbody>
							<tr>
								
								<td><c:out value="${ls.eventName }" /></td>
								<td><c:out value="${ls.eventDate }" /></td>
								
								
							</tr>
					</c:forEach>
				</table>

				<br />
			</div>
		</div>
	</div>
</div>

<%@include file="AdminFooter.jsp"%>