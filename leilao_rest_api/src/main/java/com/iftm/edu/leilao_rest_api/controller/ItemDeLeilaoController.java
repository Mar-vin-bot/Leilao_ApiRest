package com.iftm.edu.leilao_rest_api.controller;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;
import com.iftm.edu.leilao_rest_api.service.ItemDeLeilaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemDeLeilaoController {

    @Autowired
    ItemDeLeilaoService service;

    @GetMapping
    public ResponseEntity <List<ItemDeLeilao>> lances(){
        return ResponseEntity.status(HttpStatus.OK).body(service.lances());
    }

    
}
