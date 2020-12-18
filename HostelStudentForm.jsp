<%@include file="HostelHeader.jsp"%>




<!-- page content -->
<div class="right_col" role="main">
	<div class="">

		<div class="page-title">
			<div class="title_left">
				<h3>Hostel Application</h3>
			</div>
			<div class="title_right">
				<div
					class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
					<div class="input-group"></div>
				</div>
			</div>
		</div>


		<div class="clearfix"></div>
		<div class="row">

			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							Form <small>different form elements</small>
						</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i></a></li>
							<li><a class="close-link"><i class="fa fa-close"></i></a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<br />



						<form action="HostelAdmissionServ" method="post"
							data-parsley-validate class="form-horizontal form-label-left">

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="first-name">First Name <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="Fname"
										value="${StudHostelFrm.applicantFirstName}"
										readonly="readonly" class="form-control col-md-7 col-xs-12">
								</div>
							</div>



							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="last-name">Last Name <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="Lname"
										value="${StudHostelFrm.applicantLastName}" readonly="readonly"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>


							<div class="form-group">
								<label for="middle-name"
									class="control-label col-md-3 col-sm-3 col-xs-12">Middle
									Name / Initial</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="middle-name" class="form-control col-md-7 col-xs-12"
										type="text" name="Mname"
										value="${StudHostelFrm.applicantMiddleName}"
										readonly="readonly">
								</div>
							</div>




							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Gender</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="gender" value="${StudHostelFrm.applicantGender}"
										readonly="readonly">
								</div>
							</div>




							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Local
									Address If Any</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input class="form-control col-md-7 col-xs-12" type="text"
										name="LocalAddress" required="required">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Select
									Room Type</label>
								<div class="col-md-6 col-xs-12">
									<select class="form-control col-md-7 col-xs-12" name="RoomType"
										required="required">
										<option value="">-Select Room Type-</option>
										<option value="AC">AC</option>
										<option value="NON-AC">NON-AC</option>

									</select>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12">Select
									Mess Food Type</label> <span class="required">*</span>
								<div class="col-md-6 col-xs-12">
									<select class="form-control col-md-7 col-xs-12" name="FoodType"
										required>
										<option value="">-Select Food Type-</option>
										<option value="Veg">VEG</option>
										<option value="Non-Veg">NON-VEG</option>
									</select>
								</div>
							</div>

							<div class="form-group">
								<div class="col-md-6 col-sm-6 col-xs-12">
									<h1>Mess Facility is compulsory</h1>
								</div>
							</div>


							<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
									<button type="submit" class="btn btn-primary">Cancel</button>
									<button type="submit" class="btn btn-success" name="flag"
										value="FrmSubmit">Submit</button>
								</div>
							</div>


						</form>
					</div>
				</div>
			</div>
		</div>


	</div>
	
	<!-- /page content -->

	<%@include file="HostelFooter.jsp"%>