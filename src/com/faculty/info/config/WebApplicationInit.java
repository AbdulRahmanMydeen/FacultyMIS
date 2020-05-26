package com.faculty.info.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;	

public class WebApplicationInit implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext(); 
		appContext.register(SpringMvcConfig.class);
		
		ServletRegistration.Dynamic dispatcher = 
				servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	
		
	}

}
