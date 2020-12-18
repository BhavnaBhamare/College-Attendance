<jsp:include page="AdminHeader.jsp" />

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
						action="UpdateStream2">
						
						<input type="hidden" name="appid" value="${addid}">

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
					
					<ul class="nav navbar-right panel_toolbox">
						
					</ul>
					<div class="clearfix"></div>
				</div>
				
					
				
				<div class="x_title"><br><br>
					<h2 style="margin-left: -5px;">
						Student Course and Branch Details 
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						
					</ul>
					<div class="clearfix"></div>
				</div>
				
				<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
						
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="course" name="course"
								placeholder="course Name" value="${StudentCourseDetails.courseName}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>
				
				<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<input type="text" class="form-control has-feedback-left"
								readonly="readonly" id="branch" name="branch"
								placeholder="Branch Name" value="${StudentBranchDetails.branchName}"> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div>
						<br>
						<br>
						
						
						 <div class="form-group">
						 <div class="col-md-2 col-sm-2 col-xs-2">
								<label class="control-label col-md-3 col-sm-3 col-xs-12" style="margin-left: -700px;">Course<span class="required">*</span>
								</label>
								</div>
								<div class="col-md-5 col-sm-5 col-xs-11">
									<select class="select2_single form-control" tabindex="-1"
										name="branch" value="" style="margin-left: 100px; margin-top: -25px;">
										<option value="Bachelor of Engineering">Bachelor of Engineering
											</option>
										<option value="Master of Engineering">Master of Engineering</option>
										<option value="Master of Computer Applications">Master of Computer Applications
											</option>
												<option value="Master of Business Administrator">Master of Business Administrator
											</option>
										<option value="Bachelor of Computer Applications">Bachelor of Computer Applications</option>
										<option value="Bachelor of Science">Bachelor of Science</option>
										<option value="Master of Science">Master of Science</option>
										
									</select>
								</div>
							</div> 
							
							<br>
							<div class="col-md-4 col-sm-4 col-xs-12 form-group has-feedback">
							<label class="control-label col-md-3 col-sm-3 col-xs-12">Upload Document<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="file" class="form-control has-feedback-left"
								 id="branch" name="Profid"
								 value=""> <span
								class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
						</div></div>
						
				
						<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-8 col-md-offset-5">
									<button type="submit" class="btn btn-primary">Clear</button>
									<input type="submit" class="btn btn-success" value="submit">
			        		</div>
							</div>	
					</form>
				</div>
					
				
				
			</div>
		</div>
	</div>
	

</div>




<jsp:include page="AdminFooter.jsp" />