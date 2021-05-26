package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.AccountDetails;

@RestController
public class AccountController {

	@GetMapping("/accounts/{number}")
	public AccountDetails getAccountDetails(@PathVariable String number) {
		AccountDetails acDetails = new AccountDetails();
		acDetails.setNumber(number);
		acDetails.setType("savings");
		acDetails.setBalance(234343);
		return acDetails;
	}
}
