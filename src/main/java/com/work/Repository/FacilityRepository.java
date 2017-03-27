package com.work.Repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.work.model.Facility;

@RepositoryRestResource(collectionResourceRel = "facility", path = "facility")
public interface FacilityRepository extends GraphRepository<Facility> {

}
