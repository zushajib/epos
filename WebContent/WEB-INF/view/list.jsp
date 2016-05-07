<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@include file="/header.jsp" %>

 <center>  
  
  <div style="color: teal; font-size: 30px">Being Java Guys | User  
   Details</div>  
  
  <c:if test="${!empty salesPersonList}">  
   <table border="1" bgcolor="black" width="600px">  
    <tr  
     style="background-color: teal; color: white; text-align: center;"  
     height="40px">  
       
     <td>First Name</td>  
     <td>Last Name</td>  
     <td>Edit</td>  
     <td>Delete</td>  
    </tr>  
    <c:forEach items="${salesPersonList}" var="salesperson">  
     <tr  
      style="background-color: white; color: black; text-align: center;"  
      height="30px">  
        
      <td><c:out value="${salesperson.firstName}" />  
      </td>  
      <td><c:out value="${salesperson.lastName}" />  
      </td>   
      <td><a href="edit?id=${salesperson.id}">Edit</a></td>  
      <td><a href="delete?id=${salesperson.id}">Delete</a></td>  
     </tr>  
    </c:forEach>  
   </table>  
  </c:if>  
  
  
  <a href="form">Click Here to add new User</a>  
 </center>  
<%@include file="/footer.jsp" %> 