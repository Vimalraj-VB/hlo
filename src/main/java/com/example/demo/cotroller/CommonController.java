package com.example.demo.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.CommanDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.services.EmployeeService;

@Controller
@CrossOrigin(origins = "*",maxAge = 3600)
public class CommonController {

	@Autowired
	EmployeeService empservice;
	
	@RequestMapping(value="/saveEmployee",method = RequestMethod.POST)
	public ResponseEntity<?>saveEmployee(@RequestBody EmployeeDto dto){
		CommanDto response=empservice.saveEmployee(dto);
		return new ResponseEntity<CommanDto>(response,HttpStatus.OK);
		
	}
	@RequestMapping(value="/getAllData",method = RequestMethod.GET)
	public ResponseEntity<?>getAllData(){
		CommanDto response=empservice.getAllData();
		return new ResponseEntity<CommanDto>(response,HttpStatus.OK);
		
	}
	@RequestMapping(value="/findbyname",method = RequestMethod.POST)
	public ResponseEntity<?>findbyname(@RequestParam (name="empName") String name){
	  System.err.println(name);
	  CommanDto response=empservice.findbyname(name);
		return new ResponseEntity<CommanDto>(response,HttpStatus.OK);
	}
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public ResponseEntity<?> update(@RequestBody EmployeeDto dto) {
		
		
		 CommanDto response=empservice.update(dto);

		
		return new ResponseEntity<CommanDto>(response,HttpStatus.OK);
	}
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public ResponseEntity<?>delete(@RequestBody EmployeeDto dto){
		CommanDto comdto=null;
		CommanDto response=empservice.delete(dto);
		return new ResponseEntity<CommanDto>(response,HttpStatus.OK);
	}
  
//	@RequestMapping(value="/login",method = RequestMethod.POST)
//	public ResponseEntity<?>login(@RequestBody EmployeeDto dto){
//		CommanDto response= empservice.login(dto);
//		return new ResponseEntity<CommanDto>(response,HttpStatus.OK);
//	}
	
	
	
	
	
}
