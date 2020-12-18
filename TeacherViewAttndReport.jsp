<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="TeacherHeader.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pojo.*"%>
<%@ page import="com.model.*"%>
<%@ page import="java.sql.Date"%>


<!-- page content -->

<head>

</head>
<style>
table {
    border-collapse: collapse;
    margin-left:-50px; 
  ;
}

table, td, th {
    border: 1px solid black;
}

.double {
margin-left:150px;
border-style: double;
padding:50px;
}

table tr,th,td{
pad
}

</style>
        
      <!-- page content -->
      <div class="right_col" >

        <div class="">
          <div class="page-title">
            <div class="title_left">
           <h2><B> ATTENDANCE Report</B></h2>
            </div>

            <div class="title_right">
              <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                <div class="input-group">
                 
                </div>
              </div>
            </div>
          </div>
          <div class="clearfix"></div>

          <div class="row">

            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2> <small></small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    
                    
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">


                  <!-- Smart Wizard -->

                      
                
      


<form class="ui form">    
<fieldset style="width:700px; ">


 <div class="double" id="ignorePDF" >
             <b style="margin-left:100px; font-size:25px;color:#039; "><u>ATTENDANCE REPORT</u></b><hr>
                       
                          <b>Total Present:</b><c:out value="${list.get(0) }"></c:out><br>
                          
                          <b>Total Absent </b><c:out value="${list1.get(0) }"></c:out><br>
                     
                        
                       
                         <br><br><center>
<table class="table-responsive"  style="margin-left:-10px;" id="example">
<thead>
 <tr>                      
  <th style="padding:3px;">PRESENT Student</th>
  <th style="padding:3px;">ABSENT Student</th>
  

</tr>

<tbody>
<tr>

  <td style="padding-left:40px;" rowspan="9">
  <c:forEach items="${sessionScope.list2 }" var="l">
 Mr. <c:out value="${l.studentdetail.studName}"></c:out><br>
  </c:forEach>
  </td>
 
 
  <td style="padding-left:40px;" rowspan="9">
  <c:forEach items="${sessionScope.list3 }" var="l1">
 Mr. <c:out value="${l1.studentdetail.studName}"></c:out><br>
  </c:forEach>
  </td>
 

</tr>    

  </tbody>


</table> </center> <br>


</div>


</fieldset>
</form>
</div> 
 
</div>
</div>
</div>
           </div>                 
      


  
  
  



















	<%@include file="Footer.jsp"%>


</div>

</html>