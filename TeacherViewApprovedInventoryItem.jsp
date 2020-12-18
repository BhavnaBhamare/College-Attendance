<%@page import="com.pojo.Inventoryrequest"%>
<%@page import="java.util.List"%>
<%@page import="com.pojo.Transportservicereq"%>
<%@page import="com.model.BlManagerTransInvent"%>
<jsp:include page="AdminHeader.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	BlManagerTransInvent bl = new BlManagerTransInvent();
    String status = "1";
	List<Inventoryrequest> ApprovedListinventoryReq = bl.GetApprovedListOfInventoryReq(status);
   /*  System.out.print(ApprovedListinventoryReq.get(0).getInventoryRequestId()); */
	HttpSession ses = request.getSession();
	ses.setAttribute("ApprovedListOfInventoryReq", ApprovedListinventoryReq);
%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Approved Inventory Items</h3>
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

								<h2>View Approved Inventory Items</h2>

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
							

									<table class="table table-striped">

										<thead>
											<tr>
												<th>Teacher Id</th>
												<th>Items</th>
												<th>Quantity</th>	
											</tr>
										</thead>
										<c:forEach items="${sessionScope.ApprovedListOfInventoryReq}" var="ls">
											<tbody>
												<tr>
													<td scope="row"><c:out value="${ls.teacherdetail.teacherId}" /></td>
													<td><c:out value="${ls.inventoryName}" /></td>
													<td><c:out value="${ls.quantity}" /></td>
												</tr>
										</c:forEach>
									</table>
									<div class="ln_solid"></div>

							</div>
						</div>
					</div>
				</div>
				<jsp:include page="AdminFooter.jsp" />