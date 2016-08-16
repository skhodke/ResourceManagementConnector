package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
