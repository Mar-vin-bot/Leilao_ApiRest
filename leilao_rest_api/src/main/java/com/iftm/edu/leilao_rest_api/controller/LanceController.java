package com.iftm.edu.leilao_rest_api.controller;


import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.Lance;
import com.iftm.edu.leilao_rest_api.service.LanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/lance")
public class LanceController {

    @Autowired
    LanceService service;

    @DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

    @GetMapping("/{id}")
	public Lance lance(@PathVariable Integer id) {
		return service.findById(id);
	}

    @GetMapping
    public List <Lance> lances(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public Lance atualiza (@PathVariable Integer id, @RequestBody Lance entity) { 
        return service.atualiza(id entity);
    }
            
        
}


    
    
    

