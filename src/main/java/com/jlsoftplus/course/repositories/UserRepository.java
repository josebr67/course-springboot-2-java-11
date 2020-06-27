package com.jlsoftplus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlsoftplus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
