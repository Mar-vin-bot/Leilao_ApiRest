package com.iftm.edu.leilao_rest_api.repository;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Lance;

import org.springframework.data.repository.CrudRepository;

public interface LanceRepository extends CrudRepository <Lance, Integer> {
    
    List<Lance>findAll();

}
