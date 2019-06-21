package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Long> {

}
