package com.work.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.Repository.BusinessEntityRepository;
import com.work.model.BusinessEntity;

@Service
public class GradeService {

	@Autowired
	BusinessEntityRepository bzRepo;

	public String getCumulativeGrade() {
		Collection<BusinessEntity> x = bzRepo.getLeaves();

		BusinessEntity root = bzRepo.getRoot();

		Long grade = getAverageGradeFromChildren(root);

		return grade.toString();
	}

	private Long getAverageGradeFromChildren(BusinessEntity root) {

		return null;
	}

	public String getRoot() {
		return bzRepo.getRoot().getName();
	}

	public String getLeaves() {

		return bzRepo.getLeaves().toString();
	}

}
