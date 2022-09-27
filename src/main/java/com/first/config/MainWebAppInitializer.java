package com.first.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class MainWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("getServletConfigClasses called");
		
		// TODO Auto-generated method stub
		return  new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		System.out.println("getServletMappings called");
		// TODO Auto-generated method stub
		return new String[] { "/config1/*" };
	}
  
}