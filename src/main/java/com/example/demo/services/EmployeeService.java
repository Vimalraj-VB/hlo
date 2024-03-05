package com.example.demo.services;

import com.example.demo.dto.CommanDto;
import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {

	CommanDto saveEmployee(EmployeeDto dto);

	CommanDto getAllData();

	CommanDto findbyname(String name);

	CommanDto update(EmployeeDto dto);

	CommanDto delete(EmployeeDto dto);

//	CommanDto login(EmployeeDto dto);

}
