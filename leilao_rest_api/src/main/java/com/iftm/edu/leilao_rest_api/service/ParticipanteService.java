package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Participante;
import com.iftm.edu.leilao_rest_api.repository.ParticipanteRepository;

public class ParticipanteService implements GenericService <Participante, Integer> {

    @Autowired
    ParticipanteRepository participante;

    @Override
    public Participante create(Participante object) {
        return participante.save(object);
    }

    @Override
    public List<Participante> readAll() {
        return participante.findAll();
    }

    @Override
    public Participante readById(Integer id) {
        return participante.findById(id).orElseThrow();
    }

    @Override
    public Participante update(Integer id, Participante object) {
        object.setId(id);
        return participante.save(object);
    }

    @Override
    public void delete(Integer id) {
        participante.deleteById(id);
    }
}
