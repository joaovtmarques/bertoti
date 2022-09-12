package projeto_wktfull;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Random;

public class Aluno {
  private int id;
  private String nome;
  private int idade;
  private double telefone;
  private Mensalidade mensalidade;

  public Aluno(int id, String nome, int idade, double telefone) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
    this.mensalidade = mensalidade;
  }

  public Mensalidade buscarMensalidadePorId(int id) {
    return mensalidade;
  }
}

