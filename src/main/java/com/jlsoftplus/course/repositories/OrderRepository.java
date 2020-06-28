package com.jlsoftplus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlsoftplus.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
