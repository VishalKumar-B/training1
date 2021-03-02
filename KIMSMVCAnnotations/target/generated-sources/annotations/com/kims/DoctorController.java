package com.kims;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {

	@Autowired
	private DoctorDao doctorDao;

	@RequestMapping("/doctor_register")
	private String doctorregister(Model model) {
		model.addAttribute("register", new DoctorBean());
		return "doctor_register";
	}

	@RequestMapping(value = "/add_doctor", method = RequestMethod.POST)
	public ModelAndView doctorRegister(DoctorBean register) {
		doctorDao.doctorRegister(register);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("doctor_login");
		return mv;
	}

	@RequestMapping(value = "/doctor_login", method = RequestMethod.GET)
	public String doctorLoginPage() {
		return "doctor_login";
	}

	@RequestMapping(value = "/dlogin", method = RequestMethod.POST)
	public ModelAndView doctorLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletRequest request) {
		DoctorBean db = doctorDao.doctorLogin(email, password);
		ModelAndView mv = new ModelAndView();
		if (db != null) {
			HttpSession hs = request.getSession();
			hs.setAttribute("doctordetails", db);
			hs.setAttribute("Specialisation", db.getSpecialisation());
			hs.setAttribute("doctor_name", db.getName());
			mv.setViewName("doctor_home");
		} else {
			mv.setViewName("doctor_login");
		}
		return mv;
	}

	@RequestMapping(value = "/doctor_home", method = RequestMethod.GET)
	public String doctorHome() {
		return "doctor_home";
	}

	@RequestMapping(value = "/doctor_profile", method = RequestMethod.GET)
	public String doctorProfile(Model model, @SessionAttribute("doctordetails") DoctorBean doctor) {
		model.addAttribute("doctor", doctor);
		return "doctor_profile";
	}

	@RequestMapping(value = "/doctor_profile_update", method = RequestMethod.GET)
	public String doctorProfileUpdate(Model model, @SessionAttribute("doctordetails") DoctorBean doctor) {
		model.addAttribute("doctor", doctor);
		return "doctor_profile_update";
	}

	@RequestMapping(value = "update_doctor_profile", method = RequestMethod.POST)
	public ModelAndView updateDoctorProfile(DoctorBean update, HttpServletRequest request) {
		DoctorBean db = doctorDao.updateDoctorProfile(update);
		ModelAndView mv = new ModelAndView();
		if (db != null) {
			mv.setViewName("doctor_profile");
			mv.addObject("doctor", db);
			HttpSession hs = request.getSession();
			hs.setAttribute("doctordetails", db);
		} else {
			mv.setViewName("doctor_profile_update");
			mv.addObject("doctor", db);
		}
		return mv;
	}

	@RequestMapping(value = "view_appointment_details")
	public ModelAndView viewAppointmentDetails(@SessionAttribute("Specialisation") String specialisation) {
		List<AppointmentBean> list = doctorDao.viewAppointments(specialisation);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view_appointment_details");
		mv.addObject("appointments_list", list);
		return mv;
	}

	@RequestMapping(value = "accept_appointment/{id}", method = RequestMethod.GET)
	public ModelAndView acceptAppointment(@SessionAttribute("doctor_name") String name, @PathVariable("id") int id,
			@SessionAttribute("Specialisation") String Specialisation) {
		doctorDao.acceptAppointment(name, id);
		List<AppointmentBean> list = doctorDao.viewAppointments(Specialisation);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view_appointment_details");
		mv.addObject("appointments_list", list);
		return mv;
	}
}
