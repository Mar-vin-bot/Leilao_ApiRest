package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Lance;
import com.iftm.edu.leilao_rest_api.repository.LanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanceService {

    @Autowired
    LanceRepository repository;

	public List<Lance> todos() {
		return repository.findAll();
	}

	public Lance save(Lance entity){
		return repository.save(entity);
	}

	public Lance atualiza(Integer id, Lance entity){

		entity.setId(id);
		return repository.save(entity);
	}

	public void delete(Integer id){
		return repository.deleteById(id);
	}

	public Lance findById(Integer id){
		return repository.findById(id).orElseThrow(() -> new LanceNaoEncontradoException(id));
	}
    
}
