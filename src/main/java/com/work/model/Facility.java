package com.work.model;

import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Facility {

	@GraphId
	Long id;

	String name;

	Long grade;

	@Relationship(type = "owns", direction = Relationship.INCOMING)
	Set<BusinessEntity> businessEntities;

}
