package com.example.demo.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CommanDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repo.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository emprepo;

	@Override
	public CommanDto saveEmployee(EmployeeDto dto) {
		CommanDto com=new CommanDto();
		
		EmployeeEntity entity=new EmployeeEntity();
	    BeanUtils.copyProperties(dto, entity);
	    entity.setMobileno(String.valueOf(dto.getMobileno()));
	 
	   
	    
	    EmployeeEntity savedEmployeeEntity=emprepo.save(entity);
	    if(null!=savedEmployeeEntity) {
	    	com.setStatus("Success");
	    	com.setResponseData(savedEmployeeEntity);
	    }else {
	    	com.setError("Error");
	    }
	   return com;
		
	}

	@Override
	public CommanDto getAllData() {
		
    List<EmployeeEntity> list=emprepo.findAll();
	
 
    
	CommanDto dto1=new CommanDto();
	try {
		dto1.setResponseDto(list);
	}
	catch(Exception e) {
		dto1.setResponseDto(null);
	}
	return dto1;
	}

	@Override
	public CommanDto findbyname(String name) {
		
		CommanDto dto1=new CommanDto();
		
		try {
			
			EmployeeEntity entity=emprepo.getDataByName(name);
			dto1.setResponseData(entity);
			
		}
		
		catch(Exception e) {
			
			dto1.setResponseData(null);
		}
		
		return dto1;
		
	}

	@Override
	public CommanDto update(EmployeeDto dto) {
		
		
		 CommanDto response=new  CommanDto ();
		try {
			EmployeeEntity entity=emprepo.getDataByName(dto.getName());
			entity.setEmail(dto.getEmail());
			entity.setMobileno(String.valueOf(dto.getMobileno()));
			entity.setAddress(dto.getAddress());
			entity.setGender(dto.getGender());
			entity.setBookname(dto.getBookname());
		    entity.setBookpickdate(dto.getBookpickdate());
		    entity.setBookreturndate(dto.getBookreturndate());
			
			response.setStatus("Success");
			
			emprepo.save(entity);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return response;
		
	}

	@Override
	public CommanDto delete(EmployeeDto dto) {
	    CommanDto comdto=new CommanDto();
	    try {
	    	EmployeeEntity entity=emprepo.getDataByName(dto.getName());
	    	emprepo.deleteById(entity.getId());
	    	comdto.setStatus("DELETE");
	    	
	    }catch(Exception e) {
	    	comdto.setStatus("Error Somthing Went Wrong");
	    }
	    return comdto;
	}
//
//	@Override
//	public CommanDto login(EmployeeDto dto) {
//		
//		CommanDto response=new CommanDto();
//		
//		try {
//			String str="";
//			
//			String name=dto.getName();
//			String password=dto.getPassword();
//			System.err.println(name+"    "+password);
//			
//			if(name.equalsIgnoreCase(emprepo.getDataByNameString(name)) &&
//			 password.equalsIgnoreCase(emprepo.getPasswordString(password))){
//				 str="login Successfull";
//				 response.setStatus("Success");
//			 }else {
//				 response.setStatus("Failed");
//			 }
//		}catch(Exception e) {
//			
//		}
//		return  response;
//	}
	
}
