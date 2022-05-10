package com.iftm.edu.leilao_rest_api.service;

import java.util.List;

public interface GenericService <T,ID> {

    T create(T object);
    List<T> readAll();
    T readById(ID id);
    T update(ID id);
    void delete(ID id);


}
 
