
<%@include file="TeacherHeader.jsp"%>
<%@ page import="com.pojo.Examtransaction"%>
<%@ page import="com.pojo.Studentdetail"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.Subject"%>
<%@ page import="com.pojo.Department"%>
<%@ page import="com.pojo.Examtype"%>

<%@ page import="com.model.BLmanager"%>

<%
	String className = request.getParameter("className");
	String divName = request.getParameter("divName");
	BLmanager bl = new BLmanager();
	
	List<Subject> list=bl.searchBySubjectList();
	
	List<Examtype> list2 =bl.viewExamTypeList();
	
	List<Studentdetail> list3 = bl.seachByStudList(className, divName);	
	
	int id = Integer.parseInt(request.getParameter("studId"));
	Studentdetail sd = bl.searchBystudId(id);
%>


<head>
<script type="text/javascript">

function addMarks() {
	var a=document.getElementById("obThM").value;
	var b=document.getElementById("ToThM").value;
	var c=document.getElementById("obPrM").value;
	var d=document.getElementById("ToPrM").value;
	var e=Number(a)+Number(c);
	var f=Number(b)+Number(d);
	document.getElementById("num1").value=e;
	document.getElementById("num2").value=f;

	var x=document.getElementById("num1").value;
 	var y=document.getElementById("num2").value;
 	var z=Number(x)/Number(y)*100;

 	document.getElementById("percMarks").value=z.toPrecision(4);
}

// Script to check entry is a Number
function isNumberKey(evt){
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (charCode > 31 && (charCode < 48 || charCode > 57)){
    	alert("Enter Number only!!!");
         return false;}
    return true;
}
</script>


</head>

<div class="right_col" role="main">

	<div class="x_panel" id="op">
		<div class="x_title">
			<br /> <br /> <br />

			<h3>ADD MARKS DETAILS</h3>

			<div class="x_content">
				<br /> <br /> <br />
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">

						<form class="form-horizontal form-label-left"
							action="AddExamTransactionServ" method="post">

							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Enrollment No.<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="hidden" name="studId" value="<%=sd.getStudId()%>"
										readonly required class="form-control col-md-7 col-xs-12">
									<input type="text" name="studEnN"
										value="<%=sd.getStudEnrollmentN()%>" readonly required
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Name of Student <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="studName"
										value="<%=sd.getStudName()%>" readonly required
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Class<span
									class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="className" required
										value=<%=className%> readonly
										class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Division<span
									class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" name="divName" required value=<%=divName%>
										readonly class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<br>
							<%
								session.setAttribute("list", list);
							%>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Subject <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

									<select name="subjectName"
										class="form-control col-md-7 col-xs-12" required>

										<option value="0">Select Subject Name</option>
										<c:forEach items="${sessionScope.list}" var="c">
											<option value="${c.id}">${c.subjectName}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<%
								session.removeAttribute("list");
								session.setAttribute("list", list2);
							%>

							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Exam Type <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<!-- <input type="text" name="subjectName" required
								class="form-control col-md-7 col-xs-12"> -->

									<select name="examType" class="form-control col-md-7 col-xs-12"
										required>

										<option value="0">Select Exam Type</option>
										<c:forEach items="${sessionScope.list}" var="d">
											<option value="${d.examTypeId}">${d.examTypeName}</option>
										</c:forEach>
									</select>
								</div>
							</div>

							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Date<span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="date" name="examTransDate" required
										class="form-control col-md-7 col-xs-12">
								</div>


							</div>

							<br>
							<div class="form-group">

								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
									Obtained Marks (Theory) <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" id="obThM" name="examTransThObtMark"
										onkeyup="addMarks()" onkeypress="return isNumberKey(event)"
										required class="form-control col-md-7 col-xs-12">
								</div>
							</div>

							<br>
							<div class="x_content">
								<div class="form-group">

									<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
										Out Of<span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<input type="text" id="ToThM" name=examTransThOutOfMark
											onkeyup="addMarks()" onkeypress="return isNumberKey(event)"
											required class="form-control col-md-7 col-xs-12">
									</div>
								</div>

								<br>
								<div class="form-group">

									<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Enter
										Obtained Marks (Practical)<span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<input type="text" id="obPrM" name="examTransPractObtMark"
											onkeyup="addMarks()" onkeypress="return isNumberKey(event)"
											required class="form-control col-md-7 col-xs-12">
									</div>
								</div>

								<br>
								<div class="form-group">

									<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
										Out Of <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<input type="text" id="ToPrM" name="examTransPractOutOfMark"
											onkeyup="addMarks()" onkeypress="return isNumberKey(event)"
											required class="form-control col-md-7 col-xs-12">
									</div>
								</div>

								<br>

								<div class="form-group">

									<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Total
										Marks Obtained <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<input type="text" id="num1" name="examTransTotalObtMark"
											 onkeypress="return isNumberKey(event)" readonly required
											class="form-control col-md-7 col-xs-12">
									</div>
								</div>

								<br>
								<div class="form-group">

									<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
										Total Out of <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<input type="text" id="num2" name="examTransTotalOutOfMark"
											onkeypress="return isNumberKey(event)" readonly required
											class="form-control col-md-7 col-xs-12">
									</div>
								</div>
								<br>


								<div class="form-group">

									<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">Total
										Mark Obtained (%)<span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<input type="text" id="percMarks" name="examTransPercentage"
											onkeypress="return isNumberKey(event)" readonly required
											class="form-control col-md-7 col-xs-12">

									</div>
								</div>
								<br>

								<div class="form-group">
									<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
										class="required"></span> </label>
									<button type="submit"
										class="btn btn-primary col-md-4 col-sm-4 col-xs-12"
										data-toggle="modal" data-target="#myModal"
										style="width: 90px;">Submit</button>
									&nbsp;
									<button type="reset" class="btn btn-danger"
										style="width: 90px;">Clear</button>
									&nbsp; <a href="#"><button type="button" id="btncancel"
											class="btn btn-success" style="width: 90px;">Cancel</button></a>

								</div>
								<br> <br>
						</form>


					</div>
				</div>
				
			</div>



		</div>

	</div>


</div>
<%@include file="Footer.jsp"%>