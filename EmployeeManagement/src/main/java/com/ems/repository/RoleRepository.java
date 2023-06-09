package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	@Query("SELECT r from Role r where r.name= ?1")
	public Role findByName(String name);
}
