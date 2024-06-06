package com.Address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Address.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	// address based on employee id 
	
	@Query( nativeQuery = true , value = "SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip FROM microservices.address ea join microservices.employees e on e.id= ea.employee_id where ea.employee_id =:employeeId")
    Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
