package com.spring.validation.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.validation.entity.Employee;

@RestController
public class RootController {

	@PostMapping("/add")
	public Employee name(@RequestBody @Validated Employee employee) {
		return employee;
	}
}
