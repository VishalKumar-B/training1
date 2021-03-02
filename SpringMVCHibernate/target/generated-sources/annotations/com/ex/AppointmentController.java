package com.ex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppointmentController {

	@Autowired
	private PatientDao patientdao;
	
	@RequestMapping("/")
	private String indexpage(Model model) {
		model.addAttribute("register",new PatientBean());
		return "index";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView patientRegister(PatientBean register) { 
		
		patientdao.savePatient(register);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("username", register.getUsername());
		mv.addObject("password", register.getPassword());
		mv.addObject("email", register.getEmail());
		mv.addObject("phone", register.getPhone());
		return mv;
	}
}
