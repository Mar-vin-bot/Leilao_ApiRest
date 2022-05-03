package com.iftm.edu.leilao_rest_api.controller;

import java.util.List;

import javax.persistence.Entity;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;
import com.iftm.edu.leilao_rest_api.repository.ItemDeLeialaoRepository;
import com.iftm.edu.leilao_rest_api.service.ItemDeLeilaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/itemDoLeilao")
public class ItemDeLeilaoController {

    @Autowired
    ItemDeLeilaoService service;

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Integer id){
         service.delete(id);
    }

    @GetMapping("/itemDeLeilao/{id}")
    public ItemDeLeilao lance(@PathVariable Integer id){
        return service.findById(id);
    }

    @GetMapping("/itemDeLeilao")
    public List <ItemDeLeilao> lances(){
        return service.todos();         // pq não usou o findAll()
    }

    @PutMapping("/itemDeLeilao/{id}")
    public ItemDeLeilao atualizar(@PathVariable Integer id, @RequestBody ItemDeLeilao entity ){
        return service.atualiza(id, entity);
    }

    @PostMapping("/itemDeLeilao")
    public  ItemDeLeilao novo(@RequestBody ItemDeLeilao entity) { 
        return service.save(entity);
    }
    
    
}
