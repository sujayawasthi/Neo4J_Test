package com.work.model;

import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class BusinessEntity {

	@GraphId
	Long id;

	String name;

	Long grade;

	@Relationship(type = "owns", direction = Relationship.OUTGOING)
	Set<Facility> facilities;

	@Relationship(type = "isParentOf", direction = Relationship.OUTGOING)
	Set<BusinessEntity> businessEntities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getGrade() {
		return grade;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}

	public Set<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(Set<Facility> facilities) {
		this.facilities = facilities;
	}

	public Set<BusinessEntity> getBusinessEntities() {
		return businessEntities;
	}

	public void setBusinessEntities(Set<BusinessEntity> businessEntities) {
		this.businessEntities = businessEntities;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BusinessEntity [name=" + name + "]";
	}

}
