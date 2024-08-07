package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.Employee;

public class SpringApplication {
	 
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = (Employee) context.getBean("employee");
	
		System.out.println(e.getId() +" "+e.getName() +" "+e.getSalary() +" "+e.getAddress().getCity() +" "+e.getAddress().getState());		
 
	}
 
}
