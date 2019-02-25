<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron text-center">
  <h1>SPRING RMS CASE STUDY</h1>
  <p>SIMPLE CRUD PROJECT USING SPRING FRAMEWORK </p> 
</div>

  <div class="container">
            <div class="row" style="margin-top: 100px">
            	<div class="col-md-6">                	  
                		<button type="button" class="btn btn-secondary" onclick="location.href='http://localhost:8080/displayEmployee';">Show All Employee</button>              		               
	                	<button type="button" class="btn btn-info" onclick="location.href='http://localhost:8080/updateEmployee';">Update Employee</button>	                               
	                	<button type="button" class="btn btn-danger" onclick="location.href='http://localhost:8080/deleteEmployee';">Delete Employee</button>	                
                </div>
                <div class="col-md-6">                	
                		<button type="button" class="btn btn-dark" onclick="location.href='http://localhost:8080/addEmployee';">Insert Employee</button>	                	               
	                	<button type="button" class="btn btn-info" onclick="location.href='http://localhost:8080/editEmployee';">Edit Employee</button>	                	               
	                	<button type="button" class="btn btn-secondary" onclick="location.href='http://localhost:8080/editEmployee';">Logout</button>	                
                </div>
                
                
                
            </div>
  </div>
        
</body>
</html>