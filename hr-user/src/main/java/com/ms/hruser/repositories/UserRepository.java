package com.ms.hruser.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.hruser.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
	
}
