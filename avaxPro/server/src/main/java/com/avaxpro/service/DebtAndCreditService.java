/**
 * 
 */
package com.avaxpro.service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.avaxpro.entities.DebtAndCreditEntity;

/**
 * @author DELL
 *
 */
@Service
public interface DebtAndCreditService {

	ArrayList<DebtAndCreditEntity> getAllDebtCreditReportList();

	String saveDebtAndCred(DebtAndCreditEntity debtAndCredEnty);

}
