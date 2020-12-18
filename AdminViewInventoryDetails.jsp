<%@page import="com.pojo.Inventoryrequest"%>
<%@page import="java.util.List"%>
<%@page import="com.pojo.Transportservicereq"%>
<%@page import="com.model.BlManagerTransInvent"%>
<jsp:include page="AdminHeader.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	BlManagerTransInvent bl = new BlManagerTransInvent();
	List<Inventoryrequest> ListinventoryReq = bl.GetWholeListOfInventoryReq();

	HttpSession ses = request.getSession();
	ses.setAttribute("ListOfInventoryReq", ListinventoryReq);
%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Inventory Requests From Teacher</h3>
			</div>

			<!-- 	<div class="title_right">
				<div
					class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Search for..."> <span
							class="input-group-btn">
							<button class="btn btn-default" type="button">Go!</button>
						</span>
					</div>
				</div>
			</div> -->
		</div>
		<!-- <div class="clearfix"></div> -->

		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small> </small>
						</h2>
						<!-- <ul class="nav navbar-right panel_toolbox">
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
						</ul> -->
						<div class="clearfix"></div>
					</div>


					<div class="col-md-12 col-sm-12 col-xs-12">

						<div class="x_panel">

							<div class="x_title">

								<h2>View Inventory Request Details</h2>

								<ul class="nav navbar-right panel_toolbox">

									<!-- <li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i></a></li>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" role="button" aria-expanded="false"><i
											class="fa fa-wrench"> </i></a>

										<ul class="dropdown-menu" role="menu">

											<li><a href="#">Settings 1</a></li>

											<li><a href="#">Settings 2</a></li>
										</ul></li> -->
									<li><a class="close-link"><i class="fa fa-close"></i></a>

									</li>
								</ul>
								<div class="clearfix"></div>

							</div>
							<div class="x_content">
								<form action="updateAllInCurrentStudent" method="post">

									<table class="table table-striped">

										<thead>
											<tr>
												<th>Teacher Id</th>
												<th>Quantity</th>
												<th>Items</th>
												
												<th>Approve/Reject</th>
											</tr>
										</thead>
										<c:forEach items="${sessionScope.ListOfInventoryReq}" var="ls">
											<tbody>
												<tr>

													<td scope="row"><c:out
															value="${ls.teacherdetail.teacherId}" /></td>
													<td><c:out
															value="${ls.quantity}" /></td>
													<td><c:out value="${ls.inventoryName}" /></td>
													<td><a href="AdminApproveOrRejectsInventoryRequest?ApproveId=${ls.inventoryRequestId}">Approve</a>
													  <span>  |  </span>   <a href="AdminApproveOrRejectsInventoryRequest?RejectId=${ls.inventoryRequestId}">Reject</a>
													
													
													
													</td>
													

												</tr>
										</c:forEach>
									</table>
									<div class="ln_solid"></div>

								</form>
							</div>
						</div>
					</div>
				</div>
				<jsp:include page="AdminFooter.jsp" />