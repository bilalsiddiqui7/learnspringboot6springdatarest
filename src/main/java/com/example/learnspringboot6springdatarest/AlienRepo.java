package com.example.learnspringboot6springdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
