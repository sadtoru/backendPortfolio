package com.daiana.backendportfolio.repositories;

import com.daiana.backendportfolio.models.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	Optional<Person> findByUsername(String username);
}
