package com.Address.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Address.entity.Address;
import com.Address.repository.AddressRepository;
import com.Address.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int employeeId) {
		
		Address address = addressRepo.findAddressByEmployeeId(employeeId);
		
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		
		return addressResponse;
		
	}

}
