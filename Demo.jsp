  <%@include file="TeacherHeader.jsp"%>
<!-- page content -->
<head>
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/bootstrap-timepicker.min.js"></script>
</head>
<div class="right_col" role="main">
	
		<div class="page-title">
			<div class="title_left"></div>

			<div class="title_right">
				<div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
					<div class="input-group"></div>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>

		<div class="row">

			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel" id="op">
					<div class="x_title">
						<h2>
							<B>TIMETABLE</B>
						</h2>
						<h2>
							<small></small>
						</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
							</li>


						</ul>
						<div class="clearfix"></div>
					</div>
					
					
					
					<div class="x_content">

						<form class="form-horizontal form-label-left"
							action="TimetableServlet" method="post">


							
						
							
							 <div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="">Class<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="TimetableClass" required
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<br>
							
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12"
									for="">Division<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="TimetableDivision" required
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<br>
							
							
                            
                            <div class="form-group">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
									class="required"></span> </label>
								<button type="submit"
									class="btn btn-primary col-md-4 col-sm-4 col-xs-12"
									data-toggle="modal" data-target="#myModal" style="width: 90px;">Submit</button>
								&nbsp;
								<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
								&nbsp; <a href="#"><button type="button" id="btncancel"
										class="btn btn-success" style="width: 90px;">Cancel</button></a>

							</div>

                     <div class="table-responsive" align="center">
								<table class="table table-striped table-bordered">
									<tr style="background-color: #d8dbdf;">
										<th>TimetableDate</th>
										<th>NoticeDept</th>
										<th>TimetableTime</th>
										<th>TimetableClass</th>
										<th>TimetableDivision</th>
										<th>TimetableSubjectName</th>

										<th>Absents</th>
									</tr>

								</table>
								<br> <br>
							</div>

						</form>
			







		</div>

	</div>

	<!-- footer content -->

	<footer>
		<div class="copyright-info">
			<p class="pull-right">
				Gentelella - Bootstrap Admin Template by <a
					href="https://colorlib.com">Colorlib</a>
			</p>
		</div>
		<div class="clearfix"></div>
	</footer>
	<!-- /footer content -->
</div>
<!-- /page content -->





<div id="custom_notifications" class="custom-notifications dsp_none">
	<ul class="list-unstyled notifications clearfix"
		data-tabbed_notifications="notif-group">
	</ul>
	<div class="clearfix"></div>
	<div id="notif-group" class="tabbed_notifications"></div>
</div>

<script src="js/bootstrap.min.js"></script>

<!-- gauge js -->
<script type="text/javascript" src="js/gauge/gauge.min.js"></script>
<script type="text/javascript" src="js/gauge/gauge_demo.js"></script>
<!-- bootstrap progress js -->
<script src="js/progressbar/bootstrap-progressbar.min.js"></script>
<!-- icheck -->
<script src="js/icheck/icheck.min.js"></script>
<!-- daterangepicker -->
<script type="text/javascript" src="js/moment/moment.min.js"></script>
<script type="text/javascript" src="js/datepicker/daterangepicker.js"></script>
<!-- chart js -->
<script src="js/chartjs/chart.min.js"></script>

<script src="js/custom.js"></script>

<!-- flot js -->
<!--[if lte IE 8]><script type="text/javascript" src="js/excanvas.min.js"></script><![endif]-->
<script type="text/javascript" src="js/flot/jquery.flot.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.pie.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.orderBars.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.time.min.js"></script>
<script type="text/javascript" src="js/flot/date.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.spline.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.stack.js"></script>
<script type="text/javascript" src="js/flot/curvedLines.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.resize.js"></script>
<script>
	$(document).ready(
			function() {
				// [17, 74, 6, 39, 20, 85, 7]
				//[82, 23, 66, 9, 99, 6, 2]
				var data1 = [ [ gd(2012, 1, 1), 17 ], [ gd(2012, 1, 2), 74 ],
						[ gd(2012, 1, 3), 6 ], [ gd(2012, 1, 4), 39 ],
						[ gd(2012, 1, 5), 20 ], [ gd(2012, 1, 6), 85 ],
						[ gd(2012, 1, 7), 7 ] ];

				var data2 = [ [ gd(2012, 1, 1), 82 ], [ gd(2012, 1, 2), 23 ],
						[ gd(2012, 1, 3), 66 ], [ gd(2012, 1, 4), 9 ],
						[ gd(2012, 1, 5), 119 ], [ gd(2012, 1, 6), 6 ],
						[ gd(2012, 1, 7), 9 ] ];
				$("#canvas_dahs").length
						&& $.plot($("#canvas_dahs"), [ data1, data2 ], {
							series : {
								lines : {
									show : false,
									fill : true
								},
								splines : {
									show : true,
									tension : 0.4,
									lineWidth : 1,
									fill : 0.4
								},
								points : {
									radius : 0,
									show : true
								},
								shadowSize : 2
							},
							grid : {
								verticalLines : true,
								hoverable : true,
								clickable : true,
								tickColor : "#d5d5d5",
								borderWidth : 1,
								color : '#fff'
							},
							colors : [ "rgba(38, 185, 154, 0.38)",
									"rgba(3, 88, 106, 0.38)" ],
							xaxis : {
								tickColor : "rgba(51, 51, 51, 0.06)",
								mode : "time",
								tickSize : [ 1, "day" ],
								//tickLength: 10,
								axisLabel : "Date",
								axisLabelUseCanvas : true,
								axisLabelFontSizePixels : 12,
								axisLabelFontFamily : 'Verdana, Arial',
								axisLabelPadding : 10
							//mode: "time", timeformat: "%m/%d/%y", minTickSize: [1, "day"]
							},
							yaxis : {
								ticks : 8,
								tickColor : "rgba(51, 51, 51, 0.06)",
							},
							tooltip : false
						});

				function gd(year, month, day) {
					return new Date(year, month - 1, day).getTime();
				}
			});
</script>



<!-- worldmap -->
<script type="text/javascript"
	src="js/maps/jquery-jvectormap-2.0.3.min.js"></script>
<script type="text/javascript" src="js/maps/gdp-data.js"></script>
<script type="text/javascript"
	src="js/maps/jquery-jvectormap-world-mill-en.js"></script>
<script type="text/javascript"
	src="js/maps/jquery-jvectormap-us-aea-en.js"></script>
<!-- pace -->
<script src="js/pace/pace.min.js"></script>
<script>
	$(function() {
		$('#world-map-gdp').vectorMap({
			map : 'world_mill_en',
			backgroundColor : 'transparent',
			zoomOnScroll : false,
			series : {
				regions : [ {
					values : gdpData,
					scale : [ '#E6F2F0', '#149B7E' ],
					normalizeFunction : 'polynomial'
				} ]
			},
			onRegionTipShow : function(e, el, code) {
				el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
			}
		});
	});
</script>
<!-- skycons -->
<script src="js/skycons/skycons.min.js"></script>
<script>
	var icons = new Skycons({
		"color" : "#73879C"
	}), list = [ "clear-day", "clear-night", "partly-cloudy-day",
			"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
			"fog" ], i;

	for (i = list.length; i--;)
		icons.set(list[i], list[i]);

	icons.play();
</script>

<!-- dashbord linegraph -->
<script>
	Chart.defaults.global.legend = {
		enabled : false
	};

	var data = {
		labels : [ "Symbian", "Blackberry", "Other", "Android", "IOS" ],
		datasets : [ {
			data : [ 15, 20, 30, 10, 30 ],
			backgroundColor : [ "#BDC3C7", "#9B59B6", "#455C73", "#26B99A",
					"#3498DB" ],
			hoverBackgroundColor : [ "#CFD4D8", "#B370CF", "#34495E",
					"#36CAAB", "#49A9EA" ]

		} ]
	};

	var canvasDoughnut = new Chart(document.getElementById("canvas1"), {
		type : 'doughnut',
		tooltipFillColor : "rgba(51, 51, 51, 0.55)",
		data : data
	});
</script>
<!-- /dashbord linegraph -->
<!-- datepicker -->
<script type="text/javascript">
	$(document)
			.ready(
					function() {

						var cb = function(start, end, label) {
							console.log(start.toISOString(), end.toISOString(),
									label);
							$('#reportrange span').html(
									start.format('MMMM D, YYYY') + ' - '
											+ end.format('MMMM D, YYYY'));
							//alert("Callback has fired: [" + start.format('MMMM D, YYYY') + " to " + end.format('MMMM D, YYYY') + ", label = " + label + "]");
						}

						var optionSet1 = {
							startDate : moment().subtract(29, 'days'),
							endDate : moment(),
							minDate : '01/01/2012',
							maxDate : '12/31/2015',
							dateLimit : {
								days : 60
							},
							showDropdowns : true,
							showWeekNumbers : true,
							timePicker : false,
							timePickerIncrement : 1,
							timePicker12Hour : true,
							ranges : {
								'Today' : [ moment(), moment() ],
								'Yesterday' : [ moment().subtract(1, 'days'),
										moment().subtract(1, 'days') ],
								'Last 7 Days' : [ moment().subtract(6, 'days'),
										moment() ],
								'Last 30 Days' : [
										moment().subtract(29, 'days'), moment() ],
								'This Month' : [ moment().startOf('month'),
										moment().endOf('month') ],
								'Last Month' : [
										moment().subtract(1, 'month').startOf(
												'month'),
										moment().subtract(1, 'month').endOf(
												'month') ]
							},
							opens : 'left',
							buttonClasses : [ 'btn btn-default' ],
							applyClass : 'btn-small btn-primary',
							cancelClass : 'btn-small',
							format : 'MM/DD/YYYY',
							separator : ' to ',
							locale : {
								applyLabel : 'Submit',
								cancelLabel : 'Clear',
								fromLabel : 'From',
								toLabel : 'To',
								customRangeLabel : 'Custom',
								daysOfWeek : [ 'Su', 'Mo', 'Tu', 'We', 'Th',
										'Fr', 'Sa' ],
								monthNames : [ 'January', 'February', 'March',
										'April', 'May', 'June', 'July',
										'August', 'September', 'October',
										'November', 'December' ],
								firstDay : 1
							}
						};
						$('#reportrange span').html(
								moment().subtract(29, 'days').format(
										'MMMM D, YYYY')
										+ ' - '
										+ moment().format('MMMM D, YYYY'));
						$('#reportrange').daterangepicker(optionSet1, cb);
						$('#reportrange').on('show.daterangepicker',
								function() {
									console.log("show event fired");
								});
						$('#reportrange').on('hide.daterangepicker',
								function() {
									console.log("hide event fired");
								});
						$('#reportrange')
								.on(
										'apply.daterangepicker',
										function(ev, picker) {
											console
													.log("apply event fired, start/end dates are "
															+ picker.startDate
																	.format('MMMM D, YYYY')
															+ " to "
															+ picker.endDate
																	.format('MMMM D, YYYY'));
										});
						$('#reportrange').on('cancel.daterangepicker',
								function(ev, picker) {
									console.log("cancel event fired");
								});
						$('#options1').click(
								function() {
									$('#reportrange').data('daterangepicker')
											.setOptions(optionSet1, cb);
								});
						$('#options2').click(
								function() {
									$('#reportrange').data('daterangepicker')
											.setOptions(optionSet2, cb);
								});
						$('#destroy').click(function() {
							$('#reportrange').data('daterangepicker').remove();
						});
					});
</script>
<script>
	NProgress.done();
</script>


<!-- /datepicker -->
<!-- /footer content -->
</body>





<script type="text/javascript">
	function isNumber(evt) {
		evt = (evt) ? evt : window.event;
		var charCode = (evt.which) ? evt.which : evt.keyCode;
		if (charCode > 31 && (charCode<48||charCode>57)) {
			alert("Enter Number only.");
			return false;
		}
		return true;
	}
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#Joining_date').daterangepicker({
			singleDatePicker : true,
			calender_style : "picker_4"
		}, function(start, end, label) {
			console.log(start.toISOString(), end.toISOString(), label);
		});
	});
</script>
<script type="text/javascript">
            $('#timepicker1').timepicker();
        </script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://iamrohit.in/lab/js/location.js"></script>

</html>
