<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@include file="/header.jsp" %>

 <center>  
  
  <div style="color: teal; font-size: 30px">Being Java Guys | User  
   Details</div>  
  
  <c:if test="${!empty supplierList}">  
   <table border="1" bgcolor="black" width="600px">  
    <tr  
     style="background-color: teal; color: white; text-align: center;"  
     height="40px">  
       
     <td>Supplier Code</td>  
     <td>Supplier Name</td>  
     <td>Edit</td>  
     <td>Delete</td>  
    </tr>  
    <c:forEach items="${supplierList}" var="supplier">  
     <tr  
      style="background-color: white; color: black; text-align: center;"  
      height="30px">  
        
      <td><c:out value="${supplier.supplierCode}" />  
      </td>  
      <td><c:out value="${supplier.supplierName}" />  
      </td>   
      <td><a href="edit?id=${supplier.id}">Edit</a></td>  
      <td><a href="delete?id=${supplier.id}">Delete</a></td>  
     </tr>  
    </c:forEach>  
   </table>  
  </c:if>  
  
  
  <a href="form">Click Here to add new User</a>  
 </center>  
<%@include file="/footer.jsp" %> 