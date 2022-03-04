package com.in28minutes.jpa.hibernate.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.jpa.hibernate.demo.entity.Employee;
import com.in28minutes.jpa.hibernate.demo.repository.EmployeeRepository;

@ComponentScan("com.in28minutes.jpa.hibernate.demo.message")
@ComponentScan("com.in28minutes.jpa.hibernate.demo.restcontroller")
@ComponentScan("com.in28minutes.jpa.hibernate.demo.repository")
@EntityScan("com.in28minutes.jpa.hibernate.demo.entity")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext allBeans = SpringApplication.run(DemoApplication.class, args);
		EmployeeRepository emp = allBeans.getBean(EmployeeRepository.class);
		emp.insert(new Employee("ram", "Dev", 30000));
		emp.insert(new Employee("ramya", "tester", 25000));
	}

}
