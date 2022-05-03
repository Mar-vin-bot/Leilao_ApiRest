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

  /*
   * public ItemDeLeilao registrarLance(Integer id, Lance lance) {
   * ItemDeLeilao itemDeLeilao = findById(id);
   * if (itemDeLeilao.getLeilaoAberto()) {
   * // salva o lance no banco de dados
   * lance = lanceService.save(lance);
   * // adiciona à lista de lances do item de leilão
   * itemDeLeilao.getLancesRecebidos().add(lance);
   * if (itemDeLeilao.getLanceVencedor() == null ||
   * (itemDeLeilao.getLanceVencedor() != null && lance.getValor() >
   * itemDeLeilao.getLanceVencedor().getValor())) {
   * itemDeLeilao.setLanceVencedor(lance);
   * }
   * return atualiza(id, itemDeLeilao);
   * }
   * throw new LeilaoEncerradoException();
   * }
   * 
   * 
   * 
   * public Lance atualiza(Integer id){
   * ItemDeLeilao itemDeLeilao = findById(id);
   * itemDeLeilao.setLeialaoAberto(true) //mudar para false
   * repository.save(itemDeLeilao)
   * return itemDeLeilao.getLanceVendedor();
   * }
   */

}
