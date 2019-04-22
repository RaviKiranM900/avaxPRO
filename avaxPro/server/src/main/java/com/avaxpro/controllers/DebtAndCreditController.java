package com.avaxpro.controllers;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaxpro.dto.DebtAndCredDto;
import com.avaxpro.entities.DebtAndCreditEntity;
import com.avaxpro.service.DebtAndCreditService;

@RestController
@RequestMapping("/api/avaxpro")

public class DebtAndCreditController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DebtAndCreditService debtAndCreditService;

	@GetMapping("/getalldebtcreditreports")
	@CrossOrigin(origins = "http://localhost:4200")
	public ArrayList<DebtAndCreditEntity> getAllDebtCreditReportList() {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		ArrayList<DebtAndCreditEntity> cred = new ArrayList<>();
		cred.addAll(debtAndCreditService.getAllDebtCreditReportList());
		return cred;

	}

	@PostMapping("/adddebtcred")
	@CrossOrigin(origins = "http://localhost:4200")
	public String saveDebtAndCred(@RequestBody DebtAndCredDto debtAndCredDto) {
		ModelMapper modelMapper = new ModelMapper();
		DebtAndCreditEntity debtAndCredEnty = modelMapper.map(debtAndCredDto, DebtAndCreditEntity.class);
		return debtAndCreditService.saveDebtAndCred(debtAndCredEnty);

	}

}