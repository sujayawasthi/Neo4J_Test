package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.services.GradeService;

@org.springframework.web.bind.annotation.RestController("/")
public class RestController {

	@Autowired
	GradeService gradeService;

	@RequestMapping(method = RequestMethod.GET, value = "/grade")
	public String grade() {
		return gradeService.getCumulativeGrade();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/root")
	public String root() {
		return gradeService.getRoot();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/leaves")
	public String leaves() {
		return gradeService.getLeaves();
	}
}
