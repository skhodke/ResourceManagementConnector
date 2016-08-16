package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.ResourceAllocation;

@Repository
public interface ResourceAllocationRespository extends CrudRepository<ResourceAllocation, Integer> {

}
