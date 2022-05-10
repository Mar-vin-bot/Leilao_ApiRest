package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;



public class ItemDeLeilaoService implements GenericService <ItemDeLeilao, Integer> {

  Autowired
  ItemDeLeialaoRepository repository;

  @Autowired
  LanceService repository;


  @Override
  public ItemDeLeilao create(ItemDeLeilao object) {
    return repository.save(object);
  }

  @Override
  public List<ItemDeLeilao> readAll() {
    return repository.findAll();
  }

  @Override
  public ItemDeLeilao readById(Integer id) {
    return repository.findById(id).orElseThrow(() -> new LanceNaoEncontradoException(id));
  }

  @Override
  public ItemDeLeilao update(Integer id) { // ta faltando obj???
    entity.setId(id);
    return repository.save(entity);
  }

  @Override
  public void delete(Integer id) {
    repository.deleteById(id);
    
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
