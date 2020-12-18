<jsp:include page="AdminHeader.jsp" />
<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h3> </h3>
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
							action="Teacherdutylist" method="post">

 
							<span class="section">Enter Teacher Id Number</span>
					
							
							<div class="item form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="TeacherId">Teacher Id Number
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="EnrollId" type="text" name="TeacherId" 
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							
							
							<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-8 col-md-offset-5">
									<button type="submit" class="btn btn-primary">Clear</button>
									<input type="submit" class="btn btn-success" value="Submit">
			
								</div>
							</div>
						</form>
					</div>
</div></div><div class="col-sm-2"></div></div></div></div>

<jsp:include page="AdminFooter.jsp" />


