package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;



public class ItemDeLeilaoService implements GenericService <ItemDeLeilao, Integer> {

  Autowired
  ItemDeLeialaoRepository repository;

  @Autowired
  LanceService lanceService;


  @Override
  public ItemDeLeilao create(ItemDeLeilao object) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<ItemDeLeilao> readAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ItemDeLeilao readById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ItemDeLeilao update(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Integer id) {
    // TODO Auto-generated method stub
    
  }



/*
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
*/
}
