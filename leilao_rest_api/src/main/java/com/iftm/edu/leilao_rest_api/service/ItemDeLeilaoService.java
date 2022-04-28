package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;
import com.iftm.edu.leilao_rest_api.repository.ItemDeLeialaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDeLeilaoService {

    @Autowired
    ItemDeLeialaoRepository repository;

    @Autowired
    LanceService lanceService;

    public List<ItemDeLeilao> lances() {
		return repository.findAll();
	}
}
