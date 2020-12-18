<%-- <jsp:include page="StudentHeader.jsp" />
 --%>
<!-- /top navigation --> 
<div class="right_col" role="main">
	<div class="row">
		<div class="col-md-12 col-xs-12">
			<div class="x_panel">
				<div class="x_title">
					<h2>
						Student Details 
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="">

					<form class="form-horizontal form-label-left input_mask" method="post"
						action="cancelAdmissionServ">

						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="fname" name="fname"
								placeholder="First Name" value="${StudDetails.applicantFirstName}">
							<span class="fa fa-user form-control-feedback left"
								aria-hidden="true"></span>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly"  id="mname" name="mname"
								placeholder="Middle Name" value="${StudDetails.applicantMiddleName}">
							<span class="fa fa-user form-control-feedback left"
								aria-hidden="true"></span>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="lname" name="lname" placeholder="Last Name"
								value="${StudDetails.applicantLastName}"> <span
								class="fa fa-envelope form-control-feedback left"
								aria-hidden="true"></span>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="dob" name="dob"
								placeholder="Date Of Birth" value="${StudDetails.applicantDob}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>
						
						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="age" name="age"
								placeholder="Age" value="${StudDetails.applicantAge}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>
						
						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="emailid" name="emailid"
								placeholder="Email Id" value="${StudDetails.applicatantEmailId}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>

					<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="nativePlace" name="nativePlace"
								placeholder="Native Place" value="${StudDetails.applicantNativePlace}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="gender" name="gender"
								placeholder="Gender" value="${StudDetails.applicantGender}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>
					
						<div class="x_title">
					<h2>
						Student Payment Details 
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						
					</ul>
					<div class="clearfix"></div>
				</div>
				
				<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="paymentType" name="paymentType"
								placeholder="Payment Type" value="${StudDetails.paymentOption}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>	
				
				<div class="x_title"><br><br>
					<h2 style="margin-left: -230px;">
						Student Branch and Course Details 
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						
					</ul>
					<div class="clearfix"></div>
				</div>
				
				<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="branch" name="branch"
								placeholder="Branch Name" value="${StudentBranchDetails.branchName}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>
						
						<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
						
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="course" name="course"
								placeholder="course Name" value="${StudentCourseDetails.courseName}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>	
					
<%-- 				<div class="x_title"><br><br>
					<h2 style="margin-left: -230px;">
						Student Fees Details 
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						
					</ul>
					<div class="clearfix"></div>
				</div>	
				<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="deposite">Deposite Amount
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="deposite" type="text" name="deposite" readonly="readonly"
									value="${StudentFeesDetails.depositeAmount}"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
					<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="totalfees">Total Fees
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="totalfees" type="text" name="totalfees" readonly="readonly"
									value="${StudentFeesDetails.totalAmount}"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
				
				<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="paidfees">Paid Fees
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="paidfees" type="text" name="paidfees" readonly="readonly"
									value="${StudentFeesDetails.paidFees}"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
				<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="remainingfees">Total Fees
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="remainingfees" type="text" name="remainingfees" readonly="readonly"
									value="${StudentFeesDetails.remainingFees}"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div> --%>
						<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-8 col-md-offset-5">
									<button type="submit" class="btn btn-primary">Clear</button>
									<input type="submit" class="btn btn-success" value="Show Payment Details">
			        		</div>
							</div>	
					</form>
				</div>
					
				
				
			</div>
		</div>
	</div>
	

</div>



<%-- 
<jsp:include page="StudentFooter.jsp" /> --%>