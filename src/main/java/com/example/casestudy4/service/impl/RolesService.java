package com.example.casestudy4.service.impl;

import com.example.casestudy4.model.Roles;
import com.example.casestudy4.repository.RolesRepository;
import com.example.casestudy4.service.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService implements IRolesService {
    @Autowired
    private RolesRepository repository;
    @Override
    public Roles save(Roles roles) {
        return repository.save(roles);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Roles> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Roles> findAll() {
        return repository.findAll();
    }
}
