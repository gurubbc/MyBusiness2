package com.ofss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class GuruController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public String insertData(Employee employee)
	{
		if (employee!=null){
			employeeDAO.saveEmployee(employee);
		}
		return "Success";
 
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView employee()
	{
		return new ModelAndView("EmployeeForm"," ",new Employee());
	}
	
	@RequestMapping("/getEmployeeList")  
	 public ModelAndView getEmployeeList() {  
	  List<Employee> employeeList = employeeDAO.getEmployeeList();  
	  return new ModelAndView("ShowEmployee", "employeeList", employeeList);  
	 }  
	

}
