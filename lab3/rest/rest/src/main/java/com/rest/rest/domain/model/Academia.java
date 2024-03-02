package com.rest.rest.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.ArrayList;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Academia {

	private Long id;
	
	private String nome;
	
	private ArrayList<Aluno> alunos;
}