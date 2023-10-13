package com.axelrattion.invoiceapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axelrattion.invoiceapp.exception.InvoiceNotFoundException;
import com.axelrattion.invoiceapp.model.Invoice;
import com.axelrattion.invoiceapp.repo.InvoiceRepository;
import com.axelrattion.invoiceapp.service.IInvoiceService;

@Service
public class InvoiceServiceImpl implements IInvoiceService {
    
    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = repo.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice by ID : "+id+" Not Found");
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        repo.delete(getInvoiceById(id));
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        repo.save(invoice);
    }
}
