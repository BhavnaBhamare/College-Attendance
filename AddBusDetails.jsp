<%@page import="java.util.List"%>
<%@page import="com.pojo.Busdriver"%>
<%@page import="com.model.BlManagerTransInvent"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="AdminHeader.jsp" />

<%
BlManagerTransInvent bl = new BlManagerTransInvent();
Busdriver bs = new Busdriver();
List<Busdriver> busDriverList = bl.getAllBusDrivers();
HttpSession s1 = request.getSession();
s1.setAttribute("AllBussDriver", busDriverList);
%>

<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3>Add New Driver Details</h3>
			</div>
		</div>
		<div class="clearfix"></div>

		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-md-8 col-sm-6 col-xs-8">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<small>sub title</small>
						</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
							</li>

							<li><a class="close-link"><i class="fa fa-close"></i></a></li>
						</ul>
						<div class="clearfix"></div>
					</div>

					<div class="x_content">

						<form class="form-horizontal form-label-left"
							action="AddBusDetailServ" method="post">

							<span class="section">Add New Driver</span>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="busDriverName"> Bus Driver Name <span class="required">*</span>
								</label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										name="busDriverName" id="busDriverName">
										<c:forEach items="${sessionScope.AllBussDriver}" var="ls">
											<option value="${ls.driverName}">${ls.driverName}</option>
										</c:forEach>
									</select>
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="BusNumber">Bus Number <span class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="BusNumber" type="text" name="BusNumber"
										required="required" class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="noOfSeats">Number Of Seats <span class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="noOfSeats" type="text" name="noOfSeats"
										required="required" class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="busType">Bus Type<span class="required">*</span>
								</label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										required="required" name="busType" id="busType">
										<option value="luxurybus">luxury buses</option>
										<option value="Minibuses">Mini Buses</option>
									</select>
								</div>
							</div>

								<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="tripTime">Trip Time<span class="required">*</span>
								</label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<select class="select2_single form-control" tabindex="-1"
										required="required" name="tripTime" id="tripTime">
										<option value="7to12AM">6:00 to 12:00 AM</option>
										<option value="12to4PM">12:00 to 04:00 PM</option>
										<option value="4to7PM">4:00 to 07:00 PM</option>
									</select>
								</div>
							</div>

							<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-6 col-md-offset-3">
									<button type="submit" class="btn btn-primary">Clear</button>
									<input type="submit" class="btn btn-success"
										value="Submit">
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</div>



<jsp:include page="AdminFooter.jsp" />