package com.iftm.edu.leilao_rest_api.controller;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Participante;
import com.iftm.edu.leilao_rest_api.service.ParticipanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/participantes")
public class ParticipanteContoller {

    @Autowired
    ParticipanteService service;

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id){
        service.delete(id);
    }

    @GetMapping("/participante/{id}")
    public List <Participante> participantes (){
        service.findAll();
    }

    @GetMapping("/participante/{id}")
    public Participante participante(@PathVariable Integer id ){
        return service.findById(id);
    }

    @PutMapping("participante/{id}")
    public Participante atualiza (@PathVariable Integer id, @RequestBody Participante entity) {  
        return service.atualiza(id entity);
    }
    
}
