/**
 * 
 */
package com.avaxpro.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.avaxpro.dao.DebtAndCreditRepository;
import com.avaxpro.entities.DebtAndCreditEntity;
import com.avaxpro.service.DebtAndCreditService;

/**
 * @author DELL
 *
 */
@Component
public class DebtAndCreditServiceImpl implements DebtAndCreditService{
	
	@Autowired
	private DebtAndCreditRepository debtAndCreditRepo;

	
	@Override
	public ArrayList<DebtAndCreditEntity> getAllDebtCreditReportList() {
		return (ArrayList<DebtAndCreditEntity>) debtAndCreditRepo.findAll();
	}


	@Override
	@Transactional
	public String saveDebtAndCred(DebtAndCreditEntity debtAndCredEnty) {
		// TODO Auto-generated method stub
		DebtAndCreditEntity debtEnty = debtAndCreditRepo.save(debtAndCredEnty);
		return  null;
	}

}
