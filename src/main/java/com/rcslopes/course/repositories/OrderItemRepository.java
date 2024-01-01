package com.rcslopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcslopes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
