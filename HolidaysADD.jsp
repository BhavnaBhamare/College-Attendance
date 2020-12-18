<%@include file="HostelHeader.jsp"%>




<!-- page content -->
<div class="right_col" role="main">
	<div class="">

		<div class="page-title">
			<div class="title_left">
				<h3>Add New Holiday</h3>
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



						<form action="HolidayServ" method="post"
							data-parsley-validate class="form-horizontal form-label-left">

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="first-name">Holiday Name <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="HolidayName"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							
							
							
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									>Holiday Date <span class="required"></span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="Issue" name="Hdate"
										class="date-picker form-control col-md-7 col-xs-12" required
										type="text">
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
	
	
	
	<script type="text/javascript">
			$(document).ready(function() {
				$('#Issue').daterangepicker({
					singleDatePicker : true,
					calender_style : "picker_4"
				}, function(start, end, label) {
					console.log(start.toISOString(), end.toISOString(), label);
				});
			});

			
		</script>

	<%@include file="HostelFooter.jsp"%>