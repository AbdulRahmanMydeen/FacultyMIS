package com.faculty.info.controller;


import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.faculty.info.databaseOb.FacultyDatabaseOb;
import com.faculty.info.model.FacultyDetails;
import com.faculty.info.model.Login;

@Controller
public class MainController {
	
	
	@Autowired
	private FacultyDatabaseOb facultyDAO;
	
	
	@RequestMapping(value = "/")
	public ModelAndView getLoginPage() {
	 	return new ModelAndView("index","command", new FacultyDetails());
	}
	
	@RequestMapping(value = "/adminpanel")
	public ModelAndView getAdminPage() {
	 	return new ModelAndView("adminpage");
	}
	
	@RequestMapping(value = "/processLogin" , method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("login")Login login) {
		ModelAndView mav = null;
		String username = login.getUsername();
		String password = login.getPassword();
		FacultyDetails user = facultyDAO.validateUser(login);
		
		if("admin".equalsIgnoreCase(username) && "admin123".equalsIgnoreCase(password))
				return new ModelAndView("redirect:/adminpanel");
		else if(user != null) {
			 mav = new ModelAndView("welcome");
			 mav.addObject("firstname", user.getFacultyFirstName());
			 mav.addObject("lastname", user.getFacultyLastName());
			 mav.addObject("department", user.getDepartment());
			 mav.addObject("designation", user.getDesignation());
			 return mav;
		}
		else {	ModelAndView mv = new ModelAndView("error");
			return mv;
		}
			
	}
	
	                                                
	
	@RequestMapping(value = "/listfaculties")
	public ModelAndView listFaculties(ModelAndView model) {
		Date date = new Date(0);
		
		List<FacultyDetails> listFaculties = facultyDAO.list();
		model.addObject("listFaculties", listFaculties);
		model.setViewName("adminhome");
		return model;
	}
	 
	
	@RequestMapping(value = "/newfaculty", method = RequestMethod.GET)
	public ModelAndView newFaculty(ModelAndView model) {
		
		FacultyDetails newFaculty = new FacultyDetails();
		model.addObject("faculty", newFaculty );
		model.setViewName("newform");
		return model;
	}

	
	@RequestMapping(value = "/searchfaculty" , method = RequestMethod.POST)
	public ModelAndView searchFaculty(ModelAndView model , @RequestParam("searchbar") String searchBar ) {
		List<FacultyDetails> listFaculties = facultyDAO.list(searchBar);
		model.addObject("faculty",  listFaculties);
		model.setViewName("searchpage");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveFaculty(@ModelAttribute("faculty") @Valid FacultyDetails faculty , BindingResult bindingResult) {
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("newform");
		}
		
		else {
			if(faculty.getFacultyId() == null)
			{
				facultyDAO.save(faculty);
			}
			else {
				facultyDAO.update(faculty);
			}

			return new ModelAndView("redirect:/listfaculties");		
		}
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editFaculty(HttpServletRequest request ) {
		
		int facultyId = Integer.parseInt(request.getParameter("id"));
		FacultyDetails faculty = facultyDAO.get(facultyId);
		ModelAndView model = new ModelAndView("newform");
		model.addObject("faculty", faculty );
		return model;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editFaculty(@RequestParam int id) {
		
		facultyDAO.delete(id);
		return new ModelAndView("redirect:/listfaculties");
	}

}
