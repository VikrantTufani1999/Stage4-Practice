package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.LoanDetails;

@RestController
public class LoanController {
	
	@GetMapping("/loans/{number}")
	public LoanDetails getLoanDetails(@PathVariable String number) {
		LoanDetails lnDetails = new LoanDetails();
		lnDetails.setNumber(number);
		lnDetails.setType("car");
		lnDetails.setLoan(400000);
		lnDetails.setEmi(3258);
		lnDetails.setTenure(18);
		return lnDetails;
	}
}
