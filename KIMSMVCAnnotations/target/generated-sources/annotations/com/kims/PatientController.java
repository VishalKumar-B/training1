package com.kims;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {

	@Autowired
	private PatientDao patientDao;

	@RequestMapping(value = { "/", "/index" })
	private String indexpage() {
		return "index";
	}

	@RequestMapping("/patient_register")
	private String patientregister(Model model) {
		model.addAttribute("register", new PatientBean());
		return "patient_register";
	}

	@RequestMapping(value = "/add_patient", method = RequestMethod.POST)
	public ModelAndView patientRegister(PatientBean register) {
		patientDao.patientRegister(register);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("patient_login");
		return mv;
	}

	@RequestMapping(value = "/patient_login", method = RequestMethod.GET)
	public String patientLoginPage() {
		return "patient_login";
	}

	@RequestMapping(value = "/plogin", method = RequestMethod.POST)
	public ModelAndView patientLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletRequest request) {
		PatientBean pb = patientDao.patientLogin(email, password);
		ModelAndView mv = new ModelAndView();
		if (pb != null) {
			HttpSession hs = request.getSession();
			hs.setAttribute("patientdetails", pb);
			mv.setViewName("patient_home");
		} else {
			mv.setViewName("patient_login");
		}
		return mv;
	}

	@RequestMapping(value = "/patient_home", method = RequestMethod.GET)
	public String patientHome() {
		return "patient_home";
	}

	@RequestMapping(value = "/patient_profile", method = RequestMethod.GET)
	public String patientProfile(Model model, @SessionAttribute("patientdetails") PatientBean patient) {
		model.addAttribute("patient", patient);
		return "patient_profile";
	}

	@RequestMapping(value = "/patient_profile_update", method = RequestMethod.GET)
	public String patientProfileUpdate(Model model, @SessionAttribute("patientdetails") PatientBean patient) {
		model.addAttribute("patient", patient);
		return "patient_profile_update";
	}

	@RequestMapping(value = "update_patient_profile", method = RequestMethod.POST)
	public ModelAndView updatePatientProfile(PatientBean update, HttpServletRequest request) {
		PatientBean pb = patientDao.updatePatientProfile(update);
		ModelAndView mv = new ModelAndView();
		if (pb != null) {
			mv.setViewName("patient_profile");
			mv.addObject("patient", pb);
			HttpSession hs = request.getSession();
			hs.setAttribute("patientdetails", pb);
		} else {
			mv.setViewName("patient_profile_update");
			mv.addObject("patient", pb);
		}
		return mv;
	}
	
	@RequestMapping(value = "/appointment", method = RequestMethod.GET)
	public String appointment(Model model) {
		model.addAttribute("appointment",new AppointmentBean());
		return "appointment";
	}
	
	@RequestMapping(value = "/apply_appointment", method = RequestMethod.POST)
	public ModelAndView applyAppointment(AppointmentBean appointment, @SessionAttribute("patientdetails") PatientBean patient) {
		appointment.setPatient(patient);
		boolean status = patientDao.applyAppointment(appointment);
		ModelAndView mv = new ModelAndView();
		if(status) {
			mv.setViewName("patient_home");
		}
		else {
			mv.setViewName("appointment");
			mv.addObject("appointment", new AppointmentBean());
		}
		return mv;
	}
	
	@RequestMapping(value = "/view_appointment_status", method = RequestMethod.GET)
	public ModelAndView viewAppointmentStatus(@SessionAttribute("patientdetails") PatientBean patient) {
		List<AppointmentBean> list = patientDao.appointmentStatus(patient);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view_appointment_status");
		mv.addObject("list", list);
		return mv;
	}
}
