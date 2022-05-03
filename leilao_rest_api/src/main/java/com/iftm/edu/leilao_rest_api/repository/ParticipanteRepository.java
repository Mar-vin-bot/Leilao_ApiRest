package com.iftm.edu.leilao_rest_api.repository;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Participante;

import org.springframework.data.repository.CrudRepository;

public interface ParticipanteRepository extends CrudRepository <Participante, Integer> {
    
    List<Participante>findAll();

}
