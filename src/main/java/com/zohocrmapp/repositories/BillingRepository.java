package com.zohocrmapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
