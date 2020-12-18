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
	
	int classId = Integer.parseInt(request.getParameter("className"));
	int divId = Integer.parseInt(request.getParameter("divName"));

	Classdetail cd = bl.searchByClassId(classId);
	Division div = bl.searchByDivId(divId);
	System.out.println("exmid="+examTypeId);
	
	Examtype etp = bl.searchExamType(examTypeId);

	List<Classdetail> l = bl.viewClassDetails();
	List<Division> l2 = bl.viewDivision();
	List<Subject> l3 = bl.searchBySubjectList();
	List<Examtype> l4 = bl.viewExamTypeList();

	int subSz=0;
	subSz = l3.size();
	System.out.println(subSz);
	int i = 0;

	List<Studentdetail> list = bl.seachByStudList(cd.getClassName(), div.getDivName());

	session.setAttribute("l", l);
%>
<head>
<style type="text/css">
details summary::-webkit-details-marker { 
    display:none; 
    
}

</style>
</head>



<!--  page content -->

<div class="right_col" role="main">


	<div class="row">

		<div class="col-md-12 col-sm-12 col-xs-12">
			<br>
			<div class="x_panel" id="op">
				<div class="x_title">
					<h2>
						<B>VIEW MARKS</B>
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

								<select id="className" name="className"
									class="form-control col-md-7 col-xs-12" required>

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

								<select id="divName" name="divName"
									class="form-control col-md-7 col-xs-12" required>

									<option value="<%=divId%>"><%=div.getDivName()%></option>
									<c:forEach items="${sessionScope.list}" var="c">
										<option value="${c.divId}">${c.divName}</option>
									</c:forEach>
								</select>
							</div>
						</div>

						<%
							session.removeAttribute("l2");
							session.setAttribute("list", l4);
						%>
						<br>
						<div class="form-group">

							<label class="control-label col-md-3 col-sm-3 col-xs-12" for="">
								Exam Type <span class="required">*</span>
							</label>
							<div class="col-md-6 col-sm-6 col-xs-12">

								<select id="examType" name="examType"
									class="form-control col-md-7 col-xs-12" required>

									<option value="<%=etp.getExamTypeId()%>"><%=etp.getExamTypeName()%></option>
									<c:forEach items="${sessionScope.list}" var="c">
										<option value="${c.examTypeId}">${c.examTypeName}</option>
									</c:forEach>
								</select>
							</div>
						</div>


						<br>


						<%
							session.removeAttribute("list");
							session.setAttribute("list", l3);
						%>
						<div class="form-group">
							<label class="control-label col-md-4 col-sm-4 col-xs-12"><span
								class="required"></span> </label>
							
							<button type="button" onclick="refresh()"
								class="btn btn-primary"
								data-toggle="modal" data-target="#myModal" style="width: 90px;">Reload
								</button>
							&nbsp;
							<button type="reset" class="btn btn-danger" style="width: 90px;">Clear</button>
							
						</div>
						
						<br>

						<div class="col-md-12 col-sm-12 col-xs-12">

							<div class="x_content" align="center">
							(Click on Marks to get Detail)
								<table id="datatable-fixed-header"
									class="table table-striped table-bordered">
									<thead>
										<tr style="background-color: #d8dbdf;">
											<th>Name</th>
											<c:forEach items="${sessionScope.list}" var="l" varStatus="headCount">
												<th id="h${headCount.count}"><c:out value="${l.subjectName}"></c:out></th>
											</c:forEach>
										</tr>
									</thead>
									<%
										session.removeAttribute("list");
										session.setAttribute("list1", list);
									%>
									<tbody>
										<c:forEach items="${sessionScope.list1}" var="li" varStatus="row">
											<tr id="r${row.count}">
												<td><c:out value="${li.studName}"></c:out></td>
												
												<c:forEach begin="1" end="<%=subSz%>" var="v" varStatus="cell">
												<c:forEach items="${li.examtransactions}" var="ex">
												<c:set var="exId" value="<%=examTypeId%>"/>
													<c:if test="${ex.examtype.examTypeId==exId}">
														<c:choose>
															<c:when test="${ex.subject.id!=v}">														
															</c:when>
															<c:otherwise>
															
																<td id="${row.count}${cell.count}">	
																	<input id="i${row.count}${cell.count}" type="hidden" value="${ex.subject.subjectName}">
																	
																<details>
																<summary style="color:#0033cc;"><c:out value="${ex.examTransTotalObtMark}"></c:out></summary>
																Subject        :<c:out value="${ex.subject.subjectName}"></c:out><br>
																Theory Marks   :<c:out value="${ex.examTransThObtMark}"></c:out><br>
																Practical Marks:<c:out value="${ex.examTransPractObtMark}"></c:out><br>
																Percent Marks  :<c:out value="${ex.examTransPercentage}"></c:out>%														
																</details>
																</td>		
																											
															</c:otherwise>
														</c:choose>
														</c:if>
													</c:forEach> 
													
													
												</c:forEach>
												
											</tr>
										</c:forEach>
									</tbody>
								</table>
								
							</div>
						</div>
					</form>
					<br>

				</div>
			</div>
		</div>
	</div>

	<!-- IMPORTANT SCRIPT -->
<script type="text/javascript">
var r=document.getElementById("datatable-fixed-header").rows.length;
var c= document.getElementById("datatable-fixed-header").rows[0].cells.length;

for(var i=1; i<=r-1; i++){
	for(var j=1; j<=c-1; j++){
		var a=document.getElementById("h"+i).innerHTML;
		var row=document.getElementById("r"+i);
		
		if(document.getElementById("i"+i+""+j)==null){			
			var cell = row.insertCell(j);
			cell.innerHTML = "NA";
			}
		else{
			console.log("false");
			}
		}
}

function refresh() {
	var className= document.getElementById("className").value;
	var divName = document.getElementById("divName").value;
	var examTypeId = document.getElementById("examType").value;
	//var subjectId = document.getElementById("subjectName").value;
	
	window.location.replace("viewMarksByClass.jsp?className="+className+"&divName="+divName+"&examType="+examTypeId);
}
</script>	
</div><%@include file="Footer.jsp"%>