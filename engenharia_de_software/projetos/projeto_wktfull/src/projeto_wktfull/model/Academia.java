package model;

import java.util.LinkedList;
import java.util.List;

public class Academia {
  private int id;
  private String nome;
  private double telefone;
  private List<Aluno> alunos = new LinkedList<Aluno>();
  private List<Mensalidade> mensalidades = new LinkedList();

  public Academia() {
  }

  public void cadastrarAluno(Aluno aluno) {
    alunos.add(aluno);
    
    
    Mensalidade mensalidade = new Mensalidade(1, "12/10/2022", 100.00, aluno);

    mensalidades.add(mensalidade);
  }

  public Integer getId(Integer id) {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome(String nome) {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getTelefone(double telefone) {
    return telefone;
  }

  public void setTelefone(double telefone) {
    this.telefone = telefone;
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public List<Mensalidade> getMensalidades() {
    return mensalidades;
  }
}

