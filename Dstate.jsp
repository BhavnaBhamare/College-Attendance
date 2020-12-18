<%@page import="java.sql.*"%>

<%
String country=request.getParameter("count");  



 String buffer="<select class='form-control' name='productCategoryName1' onchange='showCity(this.value);'><option value='-1'>Select</option>";  

 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();  

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart","root","");  

 Statement stmt = con.createStatement();  

 ResultSet rs = stmt.executeQuery("SELECT * FROM productcategory WHERE filterCategoryId='"+country+"' ");  

   while(rs.next()){

   buffer=buffer+"<option value='"+rs.getString(1)+"'>"+rs.getString(2)+"</option>";  

   }  
 buffer=buffer+"</select>";  

 response.getWriter().println(buffer); 

 }
 catch(Exception e){

     System.out.println(e);

 }

 %>