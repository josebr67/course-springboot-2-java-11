package com.jlsoftplus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlsoftplus.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
