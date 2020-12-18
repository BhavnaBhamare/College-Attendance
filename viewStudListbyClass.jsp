<!-- by Shailesh Jain -->
<%@include file="TeacherHeader.jsp"%>

<%@page import="java.util.Set"%>
<%@page import="com.pojo.Examtransaction"%>
<%@page import="com.pojo.Studentdetail"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.Subject"%>
<%@ page import="com.pojo.Department"%>
<%@ page import="com.model.BLmanager"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Insert title here</title>
<head>


<%
	String className = request.getParameter("className");
	String divName = request.getParameter("divName");
	BLmanager bl = new BLmanager();

	List<Studentdetail> list = bl.seachByStudList(className, divName);

	session.setAttribute("list", list);
%>

<!--  page content -->

<div class="right_col" role="main">


	<div class="row">

		<div class="col-md-12 col-sm-12 col-xs-12">
			<br>
			<div class="x_panel" id="op">
				<div class="x_title">
					<h2>
						<B>Select Student</B>
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
						action="addExamTransaction.jsp" method="post">



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
						<div class="col-md-12 col-sm-12 col-xs-12">


							<div class="x_content" align="center">
								<table id="datatable-fixed-header"
									class="table table-striped table-bordered">
									<thead>
										<tr style="background-color: #d8dbdf;">
											<th>Sr.No.</th>
											<th>Enrollment No.</th>
											<th>Name Of Students</th>
											<th>Fill Exam Details</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${sessionScope.list}" var="l"
											varStatus="counter">
											<tr>
												<td><c:out value="${counter.count}">${counter.count}</c:out></td>
												<td><input type="hidden" id="a${counter.count}"
													name="studIdtemp" value="${l.studId}"> <c:out
														value="${l.studEnrollmentN}">${l.studEnrollmentN}</c:out></td>
												<td><c:out value="${l.studName}">${l.studName}</c:out></td>
												<td><span id="b${counter.count}" name="span1"
													onmouseover="func1(${counter.count})" onmouseout="func1(${counter.count})"> Enter Marks</span></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<br>

							</div>

						</div>
					</form>
				</div>


			</div>

		</div>
	</div>

</div>
<script type="text/javascript">
function func1(q) {
	
	if(document.getElementById("stid")==null){
	var x=document.getElementById("a"+q).value;
	 document.getElementById("b"+q).innerHTML = "<input type='hidden' id='stid' name='studId' value='"+x+"'>"
														 +"<input type='submit' value='Enter Marks'>";
	 }
	else {
		for(var i=0; i<=document.getElementsByName("span1").length; i++ )
			if(document.getElementsByName("span1")[i]!=document.getElementById("b"+q)){
			document.getElementsByName("span1")[i].innerHTML="Enter Marks";			
			}
			} 
	
	}




</script>
<%@include file="Footer.jsp"%>

<!-- footer content -->