package com.omniriotest.userdetails.dao;

import org.springframework.data.repository.CrudRepository;

import com.omniriotest.userdetails.model.UserSelfDetails;

public interface UserDetailRepository extends CrudRepository<UserSelfDetails, Integer>{

}
