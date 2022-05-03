package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Participante;
import com.iftm.edu.leilao_rest_api.repository.ParticipanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ParticipanteService {

    @Autowired
    ParticipanteRepository repository;

    public Participante findById(){
      return repository.findById(id).orElseThrow(() -> new ParticipanteNaoEncontradoException(id));  
    }
    
    public List<Participante> todos() { //tem que fazer um cast para List la no repository
		return repository.findAll();
	}

}
