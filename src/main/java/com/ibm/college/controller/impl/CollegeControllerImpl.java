package com.ibm.college.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.college.controller.ICollegeController;
import com.ibm.college.controller.model.CollegeModel;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class CollegeControllerImpl implements ICollegeController {

	String className = CollegeControllerImpl.class.toGenericString();
	
	
	@Value("${college.univ}")
	private String univ;
    List<CollegeModel> modelList = new ArrayList<CollegeModel>();
	CollegeControllerImpl()
	{
		log.info("college univ is:"+univ);
		for(int i  =0;i<3;i++)
		{
			CollegeModel model = new CollegeModel();
			model.setId(i);
			model.setCollegeName("college_"+i);
			modelList.add(model);
		}
		
	}
	public ResponseEntity<List<CollegeModel>> getAllCollegesInfo() {
		String methodName = "getAllCollegesInfo()";
		log.info(className+"->"+methodName);
		log.info("college univ in method is::"+univ);
		return ResponseEntity.status(HttpStatus.OK).body(modelList);
	}

	public ResponseEntity<CollegeModel> getCollegeInfoById(@PathVariable int id) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		CollegeModel collResponse = new CollegeModel();
		modelList.forEach(collegeModel ->{
			if(collegeModel.getId() == id)
			{
				collResponse.setId(collegeModel.getId());
				collResponse.setCollegeName(collegeModel.getCollegeName());
				
			}
		});
		
		if(collResponse !=null)
		{
			status = HttpStatus.OK;
		}
		return ResponseEntity.status(status).body(collResponse);
	}


}
