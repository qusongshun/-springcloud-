package com.spring.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.pojo.Order;
import com.spring.microservice.service.OrderService;

@RestController
public class OrderController {
	
	// 调用服务层
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(value="/order/{orderId}")
	public Order queryOrderById(@PathVariable(name="orderId") String orderId) {
		
		Order order = orderService.queryOrderById(orderId);
		return order;
	}

}
