package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Participante;
import com.iftm.edu.leilao_rest_api.repository.ParticipanteRepository;

public class ParticipanteService implements GenericService <Participante, Integer> {

  Autowired
  ParticipanteRepository repository;


  @Override
  public Participante create(Participante object) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Participante> readAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Participante readById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Participante update(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Integer id) {
    // TODO Auto-generated method stub
    
  }






/*
    @Autowired
    ParticipanteRepository repository;

    public Participante findById(){
      return repository.findById(id).orElseThrow(() -> new ParticipanteNaoEncontradoException(id));  
    }
    
    public List<Participante> todos() { //tem que fazer um cast para List la no repository
		return repository.findAll();
	}
*/
}
