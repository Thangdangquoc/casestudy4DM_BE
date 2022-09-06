package com.example.casestudy4.service.impl;

import com.example.casestudy4.model.Bill;
import com.example.casestudy4.repository.BillRepository;
import com.example.casestudy4.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService implements IBillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public void delete(Long id) {
        billRepository.deleteById(id);
    }

    @Override
    public Optional<Bill> findById(Long id) {
        return billRepository.findById(id);
    }

    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }
}
