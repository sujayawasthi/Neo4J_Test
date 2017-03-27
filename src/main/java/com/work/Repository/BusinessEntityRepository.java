package com.work.Repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.work.model.BusinessEntity;

@RepositoryRestResource(collectionResourceRel = "bz", path = "bz")
public interface BusinessEntityRepository extends GraphRepository<BusinessEntity> {

	// get bottom most business entities
	@Query("match (a:BusinessEntity)-[:isParentOf]->(b:BusinessEntity) where not ((b) - [:isParentOf] -> ()) return distinct b;")
	Collection<BusinessEntity> getLeaves();

	@Query("match (a:BusinessEntity)-[:isParentOf]->(b:BusinessEntity) where not (() - [:isParentOf] -> (a)) return distinct a;")
	BusinessEntity getRoot();

}
