<%@page import="com.pojo.Inventoryrequest"%>
<%@page import="java.util.List"%>
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
				<h3>Add Inventory Details</h3>
			</div>

		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small> </small>
						</h2>
						<div class="clearfix"></div>
					</div>


					<div class="col-md-12 col-sm-12 col-xs-12">

						<div class="x_panel">

							<div class="x_title">

								<h2>Add Inventory Items</h2>

								<ul class="nav navbar-right panel_toolbox">

									<li><a class="close-link"><i class="fa fa-close"></i></a>

									</li>
								</ul>
								<div class="clearfix"></div>

							</div>
							<div class="x_content">
								<form action="AdminAddInventoryServ" method="post">

									<table class="table table-striped">

										<thead>
											<tr>
												<th>Teacher Id</th>
												<th>Items</th>
												<th>Quantity</th>
												<th>Received Quantity</th>
											</tr>
										</thead>
										<c:forEach items="${sessionScope.ListOfInventoryReq}" var="ls">
											<tbody>
												<tr>

													<td scope="row"><c:out
															value="${ls.teacherdetail.teacherId}" /></td>
													<td><c:out value="${ls.inventoryName}" /></td>
													<td><c:out value="${ls.quantity}" /></td>
													<td><input type="number" name="ReceivedQty"></td>
												</tr>
										</c:forEach>

									</table>
									<div class="ln_solid"></div>
									<div class="form-group">
										<div class="col-md-6 col-md-offset-3">
											<button type="submit" class="btn btn-primary">Clear</button>
											<input type="submit" class="btn btn-success" value="Submit">
										</div>
									</div>

								</form>
							</div>
						</div>
					</div>
				</div>

				<jsp:include page="AdminFooter.jsp" />