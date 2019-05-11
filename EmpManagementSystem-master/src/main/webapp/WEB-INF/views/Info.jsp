<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./postparam" method="post">

		<label for="inputEmpId">EmployeeId</label> 
		<input type="text" class="form-control" name="EmpId" placeholder="EmpId"> 
		<br>
		<br>
		<label for="inputEmpLName">EmployeeFirstName</label> 
		<input type="text" class="form-control" name="EmpFirstName" placeholder="EmpFName">
		<br>
		<br>
		<label for="inputEmpLName">EmployeeLastName</label> 
		<input type="text" class="form-control" name="EmpLastName" placeholder="EmpLName">
		<br>
		<br>
		<label for="inputEmpDateOfBirth">EmployeeDateOfBirth</label> 
		<input type="text" class="form-control" name="EmpDateOfBirth"	placeholder="EmpDateOfBirth"> 
		<br>
		<br>
		<label for="inputEmpDateOfJoin">EmployeeDateOfJoin</label>
		<input type="text" class="form-control" name="EmpDateOfJoining"placeholder="EmpDateOfJoin"> 
		<br>
		<br>
		<label for="inputEmpDeptId">EmployeeDeptId</label>
		<input type="text" class="form-control" name="EmpDeptID" placeholder="empDeptId"> 
		<br>
		<br>
		<label for="inputEmpGrade">EmployeeGrade</label>
		<input type="text" class="form-control" name="EmpGrade" placeholder="Empgrade"> 
		<br>
		<br>
		<label for="inputEmpDesign">EmployeeDesignation</label>
		<input type="text" class="form-control" name="EmpDesignation" placeholder="EmpDesign"> 
		<br>
		<br>
		<label for="inputEmpBasic">EmployeeBasic</label>
		<input type="text" class="form-control" name="EmpBasic" placeholder="Empbasic"> 
		<br>
		<br>
		<label for="inputEmpGender">EmployeeGender</label>
		<input type="text" class="form-control" name="EmpGender" placeholder="EmpGender"> 
		<br>
		<br>
		<label for="inputEmpMarital">EmployeeMarital</label>
		<input type="text" class="form-control" name="EmpMaritalStatus"placeholder="EmpMarital"> 
		<br>
		<br>
		<label for="inputEmpHomeaddress">EmployeeHomeaddress</label>
		<input type="text" class="form-control" name="EmpHomeAddress" placeholder="EmpHomeaddress"> 
		<br>
		<br>
		<label for="inputCity">EmployeeContactnum</label>
		<input type="text" class="form-control" name="EmpContactNum" placeholder="contactnum">
		<br>
		<br>
			<button type="submit" class="btn btn-primary">Create</button>
	</form>
</body>
</html>