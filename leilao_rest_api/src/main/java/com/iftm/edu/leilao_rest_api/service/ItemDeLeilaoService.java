package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;
import com.iftm.edu.leilao_rest_api.domain.Lance;
import com.iftm.edu.leilao_rest_api.repository.ItemDeLeialaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDeLeilaoService {

  @Autowired
  ItemDeLeialaoRepository repository;

  @Autowired
  LanceService lanceService;

  public List<ItemDeLeilao> todos() {
    return repository.findAll();
  }

  public void delete(Integer id) {
    repository.deleteById(id);
  }

  public ItemDeLeilao save(ItemDeLeilao entity) {
    return repository.save(entity);
  }

  public ItemDeLeilao atualiza(Integer id, ItemDeLeilao entity) {
    entity.setId(id);
    return repository.save(entity);
  }

}
