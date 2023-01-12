package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(com.training.spring.config.ApplicationConfig.class);
		
		
		// In spring we make the object like this
		Person person1 = (Person)context.getBean("person");
		
		System.out.println("Name is: " +person1.getFirstName()+" "+person1.getLastName());
		
		System.out.println("Age of the person is: "+person1.getAge());
		System.out.println("Person Detail: "+person1.personDetail());
		
		//Person person2 = (Person) context.getBean("person");
	//	person2.setFirstName("Kishan");
		// If we use scope sigleton then its value is changed
		// If we use prototype scope then its value same as previous object
		
		//System.out.println("Name of person 1: " +person1.getFirstName()+" "+person1.getLastName());
		
		
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println("Employee Data :"+e1.EmpDetails());
		
		
		
	}
	
	

}
