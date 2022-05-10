package com.iftm.edu.leilao_rest_api.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data			// ANOTAÇÕES LOMBOK
@NoArgsConstructor	// ANOTAÇÕES LOMBOK -- CONSTRUTOR PADRAO
@Entity
public class ItemDeLeilao implements Serializable {
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //PASSA O ID AUTO INCREMENT
	private Integer id;
	private String nome;
	private double valorMinimo;
	private boolean leilaoAberto; 

	@OneToMany
	private List<Lance> lancesRecebidos = new ArrayList<Lance>();

	@OneToOne
	private List<Lance> lanceVencedor;

	public void setId(Integer id) {			//não era pra ter criado isso aqui
	}
	
}

