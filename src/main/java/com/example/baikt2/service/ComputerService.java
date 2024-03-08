package com.example.baikt2.service;

import com.example.baikt2.model.Computer;
import com.example.baikt2.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ComputerService implements IComputerService{
    @Autowired
    public IComputerRepository repository;
    @Override
    public Iterable<Computer> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Computer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Computer save(Computer computer) {
        return repository.save(computer);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
