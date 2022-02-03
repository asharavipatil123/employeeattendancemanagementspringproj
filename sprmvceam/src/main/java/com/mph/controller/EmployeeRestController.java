package com.mph.controller;

import java.util.List;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.mph.entity.Employee;
import com.mph.service.EmployeeService;


@RestController
@RequestMapping("/employee")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT} )
public class EmployeeRestController {
	
	@Autowired
	public EmployeeService employeeService;
	Employee employee;
	
	
	@GetMapping("/allemp")
	public ResponseEntity<List<Employee>> listAllEmployees() {
		List<Employee> li = employeeService.getAllEmployee();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
	}
	
	/*
	@GetMapping("/getemp")
	public ResponseEntity<List<Employee>> getEmployee() {
		List<Employee> li = employeeService.getEmployee();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
	}
	*/
	
	@PostMapping("/createEmp")
	public Employee createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return employee;
	}
	/*
	
	@PutMapping("/updateEmp")
	public ResponseEntity<List<Register>> updateEmployee(@RequestBody Register employee) {
		List<Register> li = employeeService.updateEmployee(employee);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Register>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Register>>(li,HttpStatus.OK);
	}
	*/
	@GetMapping("/getEmp/{eid}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("eid") int eid) {
        
		Employee employee = employeeService.getEmployee(eid);
    	if (employee == null) {
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Employee>((Employee) employee,HttpStatus.OK);
    }
	/*
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam("txtemail") String email, @RequestParam("txtpass") String password) {

		employee = new Employee();
		employee.setEmail(email);

		Employee empl = employeeService.getEmployee();

		if (empl == null) {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("NOTIFICATION", "Employee Doesn't exist...");
			return mv;

		} else {

			return allEmployee();
		}
	}
	public ModelAndView allEmployee() {
		List<Employee> li = employeeService.getAllEmployee();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("allemp", li);
		return mv;

	}

	
*/

}
