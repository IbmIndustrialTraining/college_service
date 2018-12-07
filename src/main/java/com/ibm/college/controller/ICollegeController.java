package com.ibm.college.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.college.controller.model.CollegeModel;

@RequestMapping("/college")
public interface ICollegeController {
	
	@RequestMapping(value ="/getall",method=RequestMethod.GET)
	public ResponseEntity<List<CollegeModel>> getAllCollegesInfo();
	
	@RequestMapping(value ="/get/{id}",method=RequestMethod.GET)
	public ResponseEntity<CollegeModel> getCollegeInfoById(@PathVariable("id") int id);

	
}
