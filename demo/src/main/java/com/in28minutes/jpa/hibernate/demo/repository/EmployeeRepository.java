package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Employee;


@Transactional
@Repository
public class EmployeeRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Employee insert(Employee emp) {
		return entityManager.merge(emp);
	}
	
	public Employee update(int id, long salary) {
		Employee emp = entityManager.find(Employee.class, id);
		emp.setSalary(emp.getSalary() + salary);
		return emp;
		
	}
	
	public List<Employee> findAll() {
		Query createNamedQuery = entityManager.createNamedQuery("");
		return createNamedQuery.getResultList();		
	}

	public void deleteById(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		entityManager.remove(emp);
	}
}
