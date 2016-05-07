<div class="row">
	<div class="col-lg-6">
	    <div class="form-group">
	        <form:label path="supplierCode">Supplier Code</form:label> 
	        <form:input path="id" type="hidden" value="${supplierObject.id}"  class="form-control" /> 
	        <form:input path="supplierCode" value="${supplierObject.supplierCode}"  class="form-control" />  
	    </div>
             
        <div class="form-group">
            <form:label path="supplierName">Supplier Name</form:label>  
            <form:input path="supplierName" value="${supplierObject.supplierName}" class="form-control" />  
        </div>
        
        <div class="form-group">
            <form:label path="address">Address</form:label> 
            <form:input path="address" value="${supplierObject.address}" class="form-control" />  
        </div>
             
	 	<div class="form-group">
	     	<form:label path="phoneNumber">Phone Number</form:label> 
	     	<form:input path="phoneNumber" value="${supplierObject.phoneNumber}" class="form-control" />  
	 	</div>
             
        <div class="form-group">
            <form:label path="contactPerson">Contact Person</form:label>  
            <form:input path="contactPerson" value="${supplierObject.contactPerson}" class="form-control" />  
        </div>
     </div>
     <div class="col-lg-6">
     </div>
 </div>
 <!-- /.row -->
