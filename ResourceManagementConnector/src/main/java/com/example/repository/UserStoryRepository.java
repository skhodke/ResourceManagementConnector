package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.UserStory;

@Repository
public interface UserStoryRepository extends CrudRepository<UserStory, Integer> {

}
