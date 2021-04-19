package com.omniriotest.accountdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omniriotest.accountdetails.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
