package com.example.baikt2.repository;

import com.example.baikt2.model.Computer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends PagingAndSortingRepository<Computer, Long> {

}