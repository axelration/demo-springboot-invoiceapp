package com.axelrattion.invoiceapp.service;

import java.util.List;

import com.axelrattion.invoiceapp.model.Invoice;

public interface IInvoiceService {
    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);
}
