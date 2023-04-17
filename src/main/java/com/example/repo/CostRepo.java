package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Validation;

@Repository
public interface CostRepo extends CrudRepository<Validation, Integer> {

}
