package com.bridgelabz.employeepayroll.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.employeepayroll.dto.EmployeePayrollDto;
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<String> getEmployeeData() {
		return new ResponseEntity<String>("Get Call Success",HttpStatus.OK);
	}
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeeData(@PathVariable("empId") int empId) {
		return new ResponseEntity<String>("Get Call Success for id:"+empId,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<String> addEmployeeData(@RequestBody EmployeePayrollDto employeePayrolldto) {
		return new ResponseEntity<String>("Created Employee Payroll Data For:"+employeePayrolldto,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeeData(@RequestBody EmployeePayrollDto employeePayrolldto) {
		return new ResponseEntity<String>("Updated Employee Payroll Data For:"+employeePayrolldto,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeeData(@PathVariable("empId") int empId) {
		return new ResponseEntity<String>("Delete Call Success for id:"+empId,HttpStatus.OK);
	}
}	