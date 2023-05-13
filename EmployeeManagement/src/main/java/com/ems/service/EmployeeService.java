package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.entity.Role;
import com.ems.entity.User;

@Service
public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);
	
	public Employee updateEmployee(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstNameAsc();

	public List<Employee> sortByFirstNameDesc();

	public User saveUser(User user);

	public Role saveRole(Role role);

	public List<Role> viewRoles();

	public List<User> viewUsers();

	public void deleteRole(int roleId);

	public void deleteUser(int userId);

	public User updateUser(User theUser);

	public Role updateRole(Role theRole);

	
}
