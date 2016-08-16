package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.BillingInfo;

@Repository
public interface BillingInfoRepository extends CrudRepository<BillingInfo, Integer> {

}
