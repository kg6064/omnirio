package com.omniriotest.accountdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omniriotest.accountdetails.dao.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepo;
}
