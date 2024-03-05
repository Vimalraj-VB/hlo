package com.example.demo.dto;

import java.util.List;

public class CommanDto {

	private String status;
	private Object responseData;
	private List<?> responseDto;
	
	private String error;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	public List<?> getResponseDto() {
		return responseDto;
	}
	public void setResponseDto(List<?> responseDto) {
		this.responseDto = responseDto;
	}
	
	
}
