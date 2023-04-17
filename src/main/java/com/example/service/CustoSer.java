package com.example.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Entity.Validation;
import com.example.repo.CostRepo;

@Service
public class CustoSer {
	
	@Autowired
	private CostRepo repo;
	
	public Validation add(@Valid Validation cust)
	{
		return repo.save(cust);
	}
	
	public Validation update(String id, Validation cust)
	{
		Optional< Validation> cust1=repo.findById(Integer.parseInt(id));
		 Validation cust2=cust1.get();
		cust2.setId(cust.getId());
		cust2.setName(cust.getName());
		cust2.setSurname(cust.getSurname());
		cust2.setMobileno(cust.getMobileno());
		cust2.setAddress(cust.getAddress());
		return repo.save(cust2);
	}  
	
	public Optional<Validation> get(int id)
	{
		
		return repo.findById(id);
	}
	
	public Iterable< Validation> getall()
	{
		return repo.findAll();
	}
	
	public void deletee(String id)
	{
		repo.deleteById(Integer.parseInt(id));
	}
}


