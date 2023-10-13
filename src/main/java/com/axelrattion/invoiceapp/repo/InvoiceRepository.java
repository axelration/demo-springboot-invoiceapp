package com.axelrattion.invoiceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axelrattion.invoiceapp.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    
}
