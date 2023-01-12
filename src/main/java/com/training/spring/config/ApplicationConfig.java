package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Car;
import com.training.spring.Employee;
import com.training.spring.Manager;
import com.training.spring.Person;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Person person() {
		Person p = new Person(42);
		p.setFirstName("Kevin");
		p.setLastName("Nishok");
		return p;
		
	}
	
	@Bean
	public Car car() {
		Car c = new Car();
		c.setMake("Maruti");
		c.setModel("800");
		c.setYear(1990);
		return c;
	}
	
	@Bean
	public Employee employee() {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("Ram");
		e.setDesigNation("Tester");
		e.setSalary(100);
		return e;
		
	}
	
	@Bean
	public Manager manager() {
		Manager m = new Manager();
		m.setName("Mahesh");
		m.setSalary(8000);
		return m;
		
	}

}
