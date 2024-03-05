package com.rest.rest.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Aluno {
  
  private Long id;

  private String nome;

  private String telefone;

  public Aluno() {}

  public Aluno(Long id, String nome, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
  }
}
