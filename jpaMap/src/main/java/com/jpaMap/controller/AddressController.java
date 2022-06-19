package com.jpaMap.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpaMap.model.Address;
import com.jpaMap.repository.AddressRepository;

@RestController
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping("/getAddress")
	public List<Address> getEmployees() {
		return addressRepository.findAll();
	}
	
}
