<jsp:include page="AdminHeader.jsp" />
<script type="text/javascript">
 
  function ShowLicenceType() 
  {
	  var i=document.getElementById("driverLicenceCategory");
   if(i.value == "MediumSizedVehicles")
    {
     document.getElementById("chooseLicenceType").value="CategoryC1 | CategoryC1E";    
    }
   else if(i.value == "LargeVehicles")
   {
	   document.getElementById("chooseLicenceType").value="CategoryC | CategoryCE";  
   }
   else if(i.value == "Minibuses")
   {
	   document.getElementById("chooseLicenceType").value="CategoryD1 | CategoryD1E";  
   }
   else{
	   document.getElementById("chooseLicenceType").value="CategoryD | CategoryDE";  
   }
  }
  </script>  

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
							action="AdminAddNewDriverServ" method="post" enctype="multipart/form-data">

							<span class="section">Add New Driver</span>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverName">Driver Name <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="driverName" type="text" name="driverName" required="required"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverAddress">Address <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<textarea id="driverAddress" type="text" name="driverAddress" required="required"
										class="form-control col-md-7 col-xs-12"></textarea>
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverContactNum">Contact Number <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="driverContactNum" type="text"
										name="driverContactNum" required="required"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverEmail">EmailId <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="driverEmail" type="text" name="driverEmail" required="required"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10">Date
									Of Birth <span class="required">*</span>
								</label>
								<div
									class="col-md-9 col-sm-9 col-xs-12 xdisplay_inputx form-group has-feedback">
									<input type="text" class="form-control has-feedback-left"
										id="single_cal1" name="driverDOB" required="required"
										aria-describedby="inputSuccess2Status4"> <span
										class="fa fa-calendar form-control-feedback left"
										aria-hidden="true"></span> <span id="inputSuccess2Status4"
										class="sr-only">(success)</span>
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverAge">Age <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="driverAge" type="number" name="driverAge" required="required"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverLicenceNum">Licence Number <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="driverLicenceNum" type="text"
										name="driverLicenceNum" required="required"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverLicenceCategory">Licence Category<span
									class="required">*</span>
								</label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<select class="select2_single form-control" tabindex="-1" required="required"
										name="driverLicenceCategory" id="driverLicenceCategory" onchange="ShowLicenceType()">

										<option value="MediumSizedVehicles">Medium-sized vehicles</option>
										<option value="LargeVehicles">Large vehicles</option>
										<option value="Minibuses">MiniBuses</option>
										<option value="Buses">Buses</option>

									</select>
								</div>
							</div>

							
							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="chooseLicenceType">Choose Licence Type </label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<textarea id="chooseLicenceType" type="text" name="chooseLicenceType"
										class="form-control col-md-7 col-xs-12" disabled="disabled"></textarea>
								</div>
							</div>
							
							
							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverLicenceType">Licence Type From Listed Above <span
									class="required">*</span></label>
								<div class="col-md-9 col-sm-9 col-xs-12">
									<input id="driverLicenceType" type="text" name="driverLicenceType" required="required"
										class="form-control col-md-7 col-xs-12" >
								</div>
							</div>
							

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10">Licence
									Approval Date <span class="required">*</span>
								</label>
								<div
									class="col-md-9 col-sm-9 col-xs-12 xdisplay_inputx form-group has-feedback">
									<input type="text" class="form-control has-feedback-left"
										id="single_call" name="licenceApprovalDate"
										aria-describedby="inputSuccess2Status4" required="required"> <span
										class="fa fa-calendar form-control-feedback left"
										aria-hidden="true"></span> <span id="inputSuccess2Status4"
										class="sr-only">(success)</span>
								</div>
							</div>



							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10">Licence
									Expiry Date <span class="required">*</span>
								</label>
								<div
									class="col-md-9 col-sm-9 col-xs-12 xdisplay_inputx form-group has-feedback">
									<input type="text" class="form-control has-feedback-left"
										id="single_call1" name="licenceExpiryDate"
										aria-describedby="inputSuccess2Status4" required="required"> <span
										class="fa fa-calendar form-control-feedback left"
										aria-hidden="true" ></span> <span id="inputSuccess2Status4"
										class="sr-only">(success)</span>
								</div>
							</div>


							<!-- Image Upload -->
							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-10"
									for="driverPhoto">Upload Driver's Photograph <span
									class="required">*</span> </label>
								<div class="col-md-9 col-sm-9 col-xs-12"
									style="margin-top: 25px;">
									<input id="driverPhoto" type="file" name="driverPhoto" required="required">
								</div> 
							</div>

							<!-- Image Upload End -->

							<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-6 col-md-offset-3">
									<button type="submit" class="btn btn-primary">Clear</button>
									<input type="submit" class="btn btn-success"
										value="Send Request">
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




<jsp:include page="Datepicker.jsp" />
<jsp:include page="AdminFooter.jsp" />