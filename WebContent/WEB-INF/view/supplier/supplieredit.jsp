<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@include file="/header.jsp" %>

 <!-- Page Heading -->
 <div class="row">
     <div class="col-lg-12">
         <ol class="breadcrumb">
             <li>
                 <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
             </li>
             <li class="active">
                 <i class="fa fa-edit"></i> Forms
             </li>
         </ol>
         <h1 class="page-header">
             Edit Supplier
         </h1>

     </div>
 </div>
 <!-- /.row -->

<c:url var="supplierUpdate" value="/supplier/update" />  
<form:form id="editForm" modelAttribute="supplier" method="post" action="${supplierUpdate}">  

<c:set var="supplierObject" value="${supplierObject}" scope="request" />
<%@include file="/partial-forms/supplier/supplierform.jsp" %>

<div class="row">
	<div class="col-lg-8">
 		<input type="reset" value="Reset" class="btn btn-default">
 	</div>
 	<div class="col-lg-4">
    	<input type="submit" value="Save" class="btn btn-default">
    </div>
</div>
 </form:form>
 
<%@include file="/footer.jsp" %> 