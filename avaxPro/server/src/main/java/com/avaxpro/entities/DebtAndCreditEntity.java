package com.avaxpro.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="DEBTCREDTORAGINGREPORT")
@Getter 
@Setter
//@NoArgsConstructor
public class DebtAndCreditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "debtCred_generator")
    @SequenceGenerator(name="debtCred_generator", sequenceName = "debtCred_seq")
    private Long id;
    @Column(name="HANDLED_BY")
    private String handledBy;
    @Column(name="BRANCH")
    private String branch;
    @Column(name="AGING_REPORT_TYPE")
    private String agingReportType;
    //@Column(name="AGING_REPORT_TIME_PERIOD")
    //private Date agingReportTimePrd;
  
    
}