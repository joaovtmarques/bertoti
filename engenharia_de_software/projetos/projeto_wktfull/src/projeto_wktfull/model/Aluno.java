package model;

import java.util.List;

public class Aluno {
  private int id;
  private String nome;
  private int idade;
  private double telefone;

  public Aluno(int id, String nome, int idade, double telefone) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
  }

  public Mensalidade buscarMensalidadePorId(Integer id) {
    Academia ac = new Academia();
    Mensalidade mensalidade = null;

    for(Mensalidade m:ac.getMensalidades()) {
      if(m.getId() == id) {
        mensalidade = m;
      }
    }

    return mensalidade;
  }
}

