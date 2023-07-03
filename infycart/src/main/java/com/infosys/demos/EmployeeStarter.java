package com.infosys.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//Starter class. This application works with AnnotationConfigApplicationContext and no XML is needed.
@ComponentScan(basePackages={"demos"})
public class EmployeeStarter {
	public static void main(String[] args) 	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(EmployeeStarter.class);
		appContext.refresh();
		//code that gets beans from the bean factory and works with them
         System.out.println("Spring application context has been initialized.");
		appContext.close();

	}
}
