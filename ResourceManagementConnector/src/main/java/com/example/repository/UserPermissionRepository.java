package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.domain.UserPermission;

public interface UserPermissionRepository extends CrudRepository<UserPermission,Integer>{

}
