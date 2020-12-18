<!-- by Shailesh Jain -->
<%@include file="TeacherHeader.jsp"%>
<%@page import="com.pojo.Division"%>
<%@page import="com.pojo.Classdetail"%>
<%@page import="java.util.Set"%>
<%@page import="com.pojo.Examtransaction"%>
<%@page import="com.pojo.Studentdetail"%>
<%@page import="java.util.List"%>
<%@page import="com.pojo.Subject"%>
<%@page import="com.pojo.Department"%>
<%@page import="com.model.BLmanager"%>
<%@page import="com.pojo.Examtype"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	BLmanager bl = new BLmanager();

	int examTypeId = Integer.parseInt(request.getParameter("examType"));
	int subjectId = Integer.parseInt(request.getParameter("subjectName"));
	int classId = Integer.parseInt(request.getParameter("className"));
	int divId = Integer.parseInt(request.getParameter("divName"));

	Classdetail cd = bl.searchByClassId(classId);
	Division div = bl.searchByDivId(divId);
	Subject sub = bl.searchSubject(subjectId);
	Examtype etp = bl.searchExamType(examTypeId);

	List<Classdetail> l = bl.viewClassDetails();
	List<Division> l2 = bl.viewDivision();
	List<Subject> l3 = bl.searchBySubjectList();
	List<Examtype> l4 = bl.viewExamTypeList();

	List<Examtransaction> list = bl.searchByExamType(examTypeId, subjectId, classId, divId);

	session.setAttribute("l", l);
%>




<!--  page content -->

<div class="right_col" role="main">


	<div class="row">

		<div class="col-md-12 col-sm-12 col-xs-12">
			<br>
			<div class="x_panel" id="op">
				<div class="x_title">
					<h2>
						<B>UPDATE MARKS</B>
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
						action="UpdateExamTransaction" method="post">



						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
								Class <span class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select id="className" name="className" class="form-control col-md-7 col-xs-12"
									required>

									<option value="<%=classId%>"><%=cd.getClassName()%></option>
									<c:forEach items="${sessionScope.l}" var="c">
										<option value="${c.classId}">${c.className}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<%
							session.removeAttribute("l");
							session.setAttribute("list", l2);
						%>
						<br>
						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Division<span
								class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select id="divName" name="divName" class="form-control col-md-7 col-xs-12"
									required>

									<option value="<%=divId%>"><%=div.getDivName()%></option>
									<c:forEach items="${sessionScope.list}" var="c">
										<option value="${c.divId}">${c.divName}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<%
							session.removeAttribute("l2");
							session.setAttribute("list", l3);
						%>
						<br>



						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
								Subject <span class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select name="subjectName" id="subjectName"
									class="form-control col-md-7 col-xs-12" required>

									<option value="<%=sub.getId()%>"><%=sub.getSubjectName()%></option>
									<c:forEach items="${sessionScope.list}" var="c">
										<option value="${c.id}">${c.subjectName}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<br>
						<%
							session.removeAttribute("l3");
							session.setAttribute("list", l4);
						%>

						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
								Exam Type <span class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select id="examType" name="examType" class="form-control col-md-7 col-xs-12"
									required>

									<option value="<%=etp.getExamTypeId()%>"><%=etp.getExamTypeName()%></option>
									<c:forEach items="${sessionScope.list}" var="c">
										<option value="${c.examTypeId}">${c.examTypeName}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<br>
						<div class="form-group">
							<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
								class="required"></span> </label>
							
							<button type="button" onclick="refresh()"
								class="btn btn-primary col-md-4 col-sm-4 col-xs-12"
								data-toggle="modal" data-target="#myModal" style="width: 90px;">Reload
								</button>
							&nbsp;
							<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
							
						</div>

						<br>
						<%
							session.removeAttribute("l4");
							session.setAttribute("list", list);
						%>
						<br>

						<div class="col-md-12 col-sm-12 col-xs-12">


							<div class="x_content" align="center">
							(To Update Marks Doubleclick on Marks)
								<table id="datatable-fixed-header"
									class="table table-striped table-bordered">
									<thead>
										<tr style="background-color: #d8dbdf;">
											<th>Sr.No.</th>
											<th>Enrollment No.</th>
											<th>Name</th>
											<th>Theory Mark</th>
											<th>Practical Marks</th>
											<th>Total Marks</th>
											<th>Marks(%)</th>
											<th>Update Marks</th>
											<th>Cancel</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${sessionScope.list}" var="l"
											varStatus="counter">
											<tr>
												<td><input type="hidden" name="examTransDate"	value="${l.examTransDate}">
												<c:out value="${counter.count}">${counter.count}</c:out></td>
												
												<td><input type="hidden" name="examTransId"	value="${l.examTransId}"> 
												<input type="hidden" name="studId" value="${l.studentdetail.studId}">
												<c:out value="${l.studentdetail.studEnrollmentN}">${l.studentdetail.studEnrollmentN}
												</c:out></td>
												
												<td><c:out value="${l.studentdetail.studName}">${l.studentdetail.studName}</c:out>
												</td>

												<td><span id="a${counter.count}" ondblclick="check(${counter.count})">
												<input	type='hidden' id='obtMarks${counter.count}' name='examThObtMark'
																			 value="${l.examTransThObtMark}">
												<c:out value="${l.examTransThObtMark}">${l.examTransThObtMark}</c:out></span>
												<span ondblclick="check(${counter.count})"><input type='hidden'
														name='examTransThOutOfMark'
														value="${l.examTransThOutOfMark}">/${l.examTransThOutOfMark}</span>
												</td>

												<td><span id="b${counter.count}" ondblclick="check(${counter.count})">
													<input	type='hidden' id='practMarks${counter.count}'
													name='examPractObtMark' value="${l.examTransPractObtMark}">
													<c:out value="${l.examTransPractObtMark}">${l.examTransPractObtMark}</c:out></span>
													<span ondblclick="check(${counter.count})"><input type='hidden'
														name='examTransPractOutOfMark'
														value="${l.examTransPractOutOfMark}">/${l.examTransPractOutOfMark}</span>
												</td>

												<td><span id="c${counter.count}"> <input
														type='hidden' id='totObtMarks${counter.count}'
														name='examTransTotalObtMark'
														value='${l.examTransTotalObtMark}'> <c:out
															value="${l.examTransTotalObtMark}">${l.examTransTotalObtMark}</c:out>
													</span>
													<span><input type='hidden'
														id='totMarks${counter.count}'
														name='examTransTotalOutOfMark'
														value='${l.examTransTotalOutOfMark}'>
														/${l.examTransTotalOutOfMark}</span></td>

												<td><span id="d${counter.count}"> <input
														type='hidden' id='percMarks${counter.count}'
														name='examTransPercentage'
														value='${l.examTransPercentage}'> <c:out
															value="${l.examTransPercentage}">${l.examTransPercentage}</c:out>
													</span>
												</td>
												<td><span id="e${counter.count}">UPDATE</span></td>
												<td><span id="f${counter.count}">Cancel</span></td>
											</tr>											
											
										</c:forEach>
									</tbody>
								</table>
								(To Update Marks Doubleclick on Marks)
							</div>
						</div>
					</form>
					<br>

				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function check(q) {
			var up = document.getElementById('upBttn');
			if (up == null) {
				document.getElementById("e" + q).innerHTML = "<input id='upBttn' type='submit' value='Update'>"
				document.getElementById("f" + q).innerHTML = "<input type='button' onClick='history.go(0)' value='Cancel'>"
				fun1(q);
			} else {

				window.alert("Update one Record at a time");
			}
		}

		function fun1(q) {
			console.log(q);

			var x = document.getElementById("obtMarks" + q).value;
			document.getElementById("a" + q).innerHTML = "<input type='text' id='obtMarks"
					+ q
					+ "' name='examTransThObtMark' value='"
					+ x
					+ "' onkeyup='fun3(" + q + ")' size='1' length='3'>";
			var y = document.getElementById("practMarks" + q).value;
			document.getElementById("b" + q).innerHTML = "<input type='text' id='practMarks"
					+ q
					+ "' name='examTransPractObtMark' value='"
					+ y
					+ "' onkeyup='fun3(" + q + ")' size='1' lenght='3'>";

		}

		function fun3(q) {
			var x = document.getElementById("obtMarks" + q).value;
			var y = document.getElementById("practMarks" + q).value;
			var t = document.getElementById("totMarks" + q).value;
			var z = Number(x) + Number(y);
			var p = Number(z) / Number(t) * 100;
			console.log(z);

			document.getElementById("c" + q).innerHTML = 
				"<input type='hidden' id='totObtMarks"+q+"' name='examTransTotalObtMark' value='"+z+"'>"+ z;

			document.getElementById("d" + q).innerHTML = "<input type='hidden' id='percMarks"
					+ q
					+ "' name='examTransPercentage' value='"
					+ p.toPrecision(4) + "'>" + p.toPrecision(4);

		}

		function refresh() {
			var className= document.getElementById("className").value;
			var divName = document.getElementById("divName").value;
			var examTypeId = document.getElementById("examType").value;
			var subjectId = document.getElementById("subjectName").value;
			
			window.location.replace("updateMarks.jsp?className="+className+"&divName="+divName+"&examType="+examTypeId+"&subjectName="+subjectId);
		}
	</script>
</div><%@include file="Footer.jsp"%>