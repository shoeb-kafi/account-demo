package com.biznovelty.accountdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biznovelty.accountdemo.entity.Account;

@RequestMapping("/account")
public class AccountController {

	@GetMapping("/getlist")
	public List<Account> getAccountList() {
		return null;
	}
}
