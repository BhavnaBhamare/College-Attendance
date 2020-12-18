<%@page import="java.sql.*"%>

<%
String state=request.getParameter("count");  

 String buffer="<select name='productCategoryId' class='form-control'><option  value='-1'>Select</option>";  

 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();  

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart","root","");  

 Statement stmt = con.createStatement();  

 ResultSet rs = stmt.executeQuery("SELECT * FROM productsubcategory WHERE productCategoryId='"+state+"' ");  

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