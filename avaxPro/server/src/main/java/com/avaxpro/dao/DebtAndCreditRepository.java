package com.avaxpro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.avaxpro.entities.DebtAndCreditEntity;

@RepositoryRestResource
public interface DebtAndCreditRepository extends JpaRepository<DebtAndCreditEntity, Long> {
}