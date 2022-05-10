package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Lance;

public class LanceService implements GenericService <Lance, Integer> {



	@Override
	public Lance create(Lance object) {
		object.setId(id)
		return repository.save(object);
	}

	@Override
	public List<Lance> readAll() {
		return repository.findAll();
	}

	@Override
	public Lance readById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new LanceNaoEncontradoException(id));
	}

	@Override
	public Lance update(Integer id) {
		entity.setId(id);
		return repository.save(entity);
	}

	@Override
	public void delete(Integer id) {
		return repository.deleteById(id);
		
	}




/*
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
*/
    
}
