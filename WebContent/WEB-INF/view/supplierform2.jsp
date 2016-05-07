<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@include file="/header.jsp" %>

<div>New Supplier</div>  
 
<c:url var="supplierSave" value="/supplier/save" />  
<form:form id="createForm" modelAttribute="supplier" method="post" action="${supplierSave}">  
	<div class="row">
	 	<div class="col-md-6">
			<div class="row">
		  		<div class="col-md-3">
		  			<form:label path="supplierCode">Supplier Code</form:label> 
		  		</div>  
			  	<div class="col-md-9">
			  		<form:input path="supplierCode" />  
			  	</div>
			</div>
			<div class="row">
		  		<div class="col-md-3">
		  			<form:label path="supplierName">Supplier Name</form:label>  
		  		</div>  
			  	<div class="col-md-9">
			  		<form:input path="supplierName" />  
			  	</div>
			</div>
			<div class="row">
		  		<div class="col-md-3">
		  			<form:label path="address">Address</form:label>  
		  		</div>  
			  	<div class="col-md-9">
			  		<form:input path="address" />   
			  	</div>
			</div>
			<div class="row">
		  		<div class="col-md-3">
		  			<form:label path="phoneNumber">Phone Number</form:label> 
		  		</div>  
			  	<div class="col-md-9">
			  		<form:input path="phoneNumber" />  
			  	</div>
			</div>
			<div class="row">
		  		<div class="col-md-3">
		  			<form:label path="contactPerson">Contact Person</form:label>  
		  		</div>  
			  	<div class="col-md-9">
			  		<form:input path="contactPerson" />   
			  	</div>
			</div>
		</div>  
	  <div class="col-md-6">
	  	
	  </div>
  	</div>
  	
  	<div>
  		<div class="col-md-6">
	  		<input type="submit" value="Save" />
	  	</div>
		<div class="col-md-6">
	  	
	  	</div>
  	</div>
 
 
 
 
  
   <table width="400px" height="400px">  
    <tr>  
     <td> 
     </td>  
     <td>
     </td>  
    </tr>  
    <tr>  
     <td>
     </td>  
     <td> 
     </td>  
    </tr>   
    <tr>  
     <td>
     </td>  
     <td>
     </td>  
    </tr> 
    <tr>  
     <td> 
     </td>  
     <td>
     </td>  
    </tr> 
    <tr>  
     <td> 
     </td>  
     <td>
     </td>  
    </tr> 
    <tr>  
     <td></td>  
     <td></td>  
    </tr>  
   </table>  
  </form:form>  
  
  
  <a href="list">Click Here to see Supplier List</a>  
 
 
<%@include file="/footer.jsp" %> 