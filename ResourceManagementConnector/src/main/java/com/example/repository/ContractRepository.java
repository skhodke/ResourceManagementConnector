package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Integer> {

}
