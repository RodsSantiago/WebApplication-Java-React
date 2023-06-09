package com.dscatalog.dscatalog.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscatalog.dscatalog.entities.Role;
import com.dscatalog.dscatalog.entities.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	

}
