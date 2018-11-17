package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Employee;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@RequestMapping(value="empDetails",method=RequestMethod.GET)
	public String addEmployees() {
		return "empDetails";
	}
	
	
	/*
	@RequestMapping(value="addEmployee",method=RequestMethod.POST)
	public String addEmployees(Model m,@RequestParam("name") String name,@RequestParam("department") String dept) {
		m.addAttribute("msg","Employee details for "+name+" added successfully!");
		m.addAttribute("empName",name);
		m.addAttribute("empDept",dept);
		return "addEmployees";
	}
	*/
	
	public String addEmployees(@ModelAttribute("emp")Employee e) {
		
		return "addEmployees";
	}
}
