package com.te.empwebapp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.empwebapp.beans.EmployeeDetails;
import com.te.empwebapp.service.EmployeeService;

@Controller
public class SpringController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(path="/login")
	public String getData() {

		return "loginForm";
	}

	@GetMapping("/add")
	public String addForm() {
		return "addForm";
	}

	@PostMapping("/login")
	public String getLoginForm(int id, String pass, ModelMap map,HttpServletRequest request) {
        
		
		
		
		EmployeeDetails details = service.login(id, pass);
		
		 HttpSession session=request.getSession();
		 session.setAttribute("loggedIn", details);
		if (details != null) {
			map.addAttribute("data", details.getName());
			return "welcome";
		} else {
			map.addAttribute("errMsg", "invalid");
			return "loginForm";
		}

	}

	@PostMapping("/add")
	public String addData(EmployeeDetails details, ModelMap map) {
		if (service.addData(details)) {
			map.addAttribute("msg", "data inserted ");

		} else {
			map.addAttribute("error", "something went wrong");

		}
		return "addForm";
	}
	
	@GetMapping("/getForm")
	public String getEmployee() {
		return "getForm";
		
	}
	@PostMapping("/getDetails")
	public String  getDetails(int id,ModelMap map) {
		 EmployeeDetails details=service.getDetails(id);
		 if(details!=null) {
			 map.addAttribute("data", details);
		 }
		 else {
			 map.addAttribute("error", "data not found for id"+id);
			    
		 }
		 return "getForm";
		 
		
	}
    @GetMapping("/logOut") 
	public String logOut(ModelMap map ,HttpSession session) {
		session.invalidate();
		map.addAttribute("msg", "logged out successfuly");
		return "login";
		
	}
    
    @GetMapping("/updateDetails")
    public String updateDetails(@SessionAttribute(name="loggedIn",required=false)EmployeeDetails details,ModelMap map) {
    	  if(details!=null) {
    		  map.addAttribute("data", details.getId());
    		  return "updateDetails";
    	  }
    	  else {
    		  map.addAttribute("err", "please login first");
    		  return "loginForm";
    	  }
        
    	
    }
    @PostMapping("/updateDetails")
    public String updateDetails(@SessionAttribute(name="loggedIn",required =false)EmployeeDetails details,EmployeeDetails details2,ModelMap map) {
    	 if(details!=null) {
    		 
    	 
         if(service.updateDetails(details.getId(), details2)) {
        	 map.addAttribute("msg", "data updated successfully");
         
         }
         else {
        	 map.addAttribute("error", "something went wrong");
         }
    	 return "updateDetails";   
     }else {
    	    
         map.addAttribute("errorMsg", "plese login first");
    	 return "loginForm";
     }
    	 
    
    }
    
}
