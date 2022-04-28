package com.iftm.edu.leilao_rest_api.repository;

import java.util.List;

import com.iftm.edu.leilao_rest_api.domain.ItemDeLeilao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDeLeialaoRepository extends CrudRepository <ItemDeLeilao, Integer> {

    List<ItemDeLeilao> findAll();
    
}
