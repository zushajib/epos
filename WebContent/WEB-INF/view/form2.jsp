<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@include file="/header.jsp" %>

 <center>  
  
  <div style="color: teal; font-size: 30px">Being Java Guys |  
   Registration Form</div>  
  
  
  
  <c:url var="userRegistration" value="saveUser.html" />  
  <form:form id="registerForm" modelAttribute="salesperson" method="post" action="register">  
   <table width="400px" height="150px">  
    <tr>  
     <td><form:label path="firstName">First Name</form:label>  
     </td>  
     <td><form:input path="firstName" />  
     </td>  
    </tr>  
    <tr>  
     <td><form:label path="lastName">Last Name</form:label>  
     </td>  
     <td><form:input path="lastName" />  
     </td>  
    </tr>   
    <tr>  
     <td></td>  
     <td><input type="submit" value="Register" /></td>  
    </tr>  
   </table>  
  </form:form>  
  
  
  <a href="list">Click Here to see User List</a>  
 </center>  
</body>  
</html>  