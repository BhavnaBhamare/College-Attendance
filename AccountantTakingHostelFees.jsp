<%@page import="com.model.BlManagerAccount"%>
<%@page import="com.pojo.Hostelregistration"%>
<%@page import="com.pojo.Coursefees"%>
<%@page import="com.pojo.Course"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.pojo.Applicationforadmission"%>
<%@page import="com.model.BlManagerAdmission"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<jsp:include page="AdminHeader.jsp" />
<%
	BlManagerAccount bl = new BlManagerAccount();
	
	List<Hostelregistration> StudentsApplicationList = bl.AprovalListForHostelStudents();
	System.out.println(StudentsApplicationList);
	HttpSession ss = request.getSession();
	ss.setAttribute("StudentsApplicationList", StudentsApplicationList);
%>

<%
	String appId = request.getParameter("AID");
	int apId1 = Integer.parseInt(appId);
	Applicationforadmission apId=bl.fetchStudentApllicationId(apId1);
	Hostelregistration hr = bl.fetchHStudentApllicationId(apId);
	System.out.println(hr.getApplicationforadmission().getApplicantFirstName());
	HttpSession s = request.getSession();
	s.setAttribute("GoForPayment", hr);
	
%>
<%
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	Date currentDate = new Date();
	System.out.println(df.format(currentDate));
	HttpSession s1 = request.getSession();
	s1.setAttribute("currentDate", currentDate);
%>
<script type="text/javascript">
	function demo() {

		var x = document.getElementById('total').value;

		var y = document.getElementById('paid').value;

		var z = x - y;

		document.getElementById('remaining').value = z;
	}
</script>
<!-- /top navigation -->
<div class="right_col" role="main">

	<div class="">
		<div class="page-title">
			<div class="title_left">
				<h2>List of Student Application For New Admission</h2>
			</div>

			<div class="clearfix"></div>

			<div class="row">
				<div class="col-md-12 col-sm-12 col-xs-12">
					<div class="x_panel">
						<div class="x_title">
							<h2>
								<small> </small>
							</h2>
							<ul class="nav navbar-right panel_toolbox">
								<li><a class="collapse-link"><i
										class="fa fa-chevron-up"></i></a></li>

								<li><a class="close-link"><i class="fa fa-close"></i></a></li>
							</ul>
							<div class="clearfix"></div>
						</div>
						<div class="x_panel">
							<div class="x_content">
								<form action="AccountantTakingHostelFees" method="post">
									<label>Date&nbsp;</label> <u><c:out value="${currentDate}" /></u>

									<u style="float: right;">1</u> <label style="float: right;">Reciept
										No.&nbsp;</label> <br> <br>
									<div class="form-group ">
										<label>Registration Id&nbsp;</label> <u><c:out
												value="${GoForPayment.applicationforadmission.applicationId}" /></u>
									</div>
									<div class="form-group ">
										<label>Student Name&nbsp;</label> <u><c:out
												value="${GoForPayment.applicationforadmission.applicantFirstName}" /></u>
									</div>

									<div class="form-group">
										<label>Course&nbsp;</label> <u><c:out
												value="${GoForPayment.applicationforadmission.course.courseName}" /></u>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<label>Branch&nbsp;</label> <u><c:out
												value="${GoForPayment.applicationforadmission.branch.branchName}" /></u>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<label>Semester&nbsp;</label> <u><c:out value="1" /></u>
									</div>
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-3 col-xs-12"
											style="margin-left: -10px" for="payment">Payment Mode
										</label>
										<div class="col-md-6 col-sm-6 col-xs-12"
											style="margin-left: -45px">
											Cash: <input type="radio" class="flat" name="payment"
												id="paymentCash" value="Cash" checked="" required /> Check:
											<input type="radio" class="flat" name="payment"
												id="paymentCheck" value="Check" />
										</div>
									</div>
									<div class="clearfix"></div>

									<table
										class="table table-striped responsive-utilities jambo_table bulk_action">
										<thead>
											<tr class="headings">

												<th class="column-title">Sr.No</th>
												<th class="column-title">Fees Type</th>
												<th class="column-title">Amount</th>

											</tr>
										</thead>

										<tbody>

											<tr class="even pointer">

												<td class=" ">1</td>
												<td class=" ">First Year Hostel Fees</td>
												<td class=" "><c:out value="10000" /></td>
											</tr>
										</tbody>
									</table>

									 <div class="row" style="float: right; margin-right: 127px;">
										<%--<%
											HttpSession session3 = request.getSession();
											Coursefees a = (Coursefees) session3.getAttribute("CourseFees");

											Double total = a.getFees() + 10000.0;

											HttpSession session4 = request.getSession();
											session4.setAttribute("Total", total);
										%>
 --%>
									Total Amount:10000 <input type="hidden" value="10000"
										name="totalfees" id="total">
							</div>
							<br> <br>

							<div class="row" style="float: right; margin-right: 35px">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"
									for="paid">Paid Fees <span class="required red">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12"
									style="margin-top: -10px;">
									<input type="text" id="paid" required name="paid"
										class="form-control col-md-7 col-xs-12" onchange="demo()">
								</div>
							</div>


							<div class="row" style="float: right;">
								<label class="control-label col-md-4 col-sm-4 col-xs-12"
									style="margin-top: -5px;" for="remaining">Remaining
									Fees <span class="required red">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12"
									style="margin-top: -10px;">
									<input type="text" id="remaining" required name="remaining"
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<br> <br>
							<center>
								<input type="submit" class="btn btn-info " value="Make Payment">
							</center>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="AdminFooter.jsp" />