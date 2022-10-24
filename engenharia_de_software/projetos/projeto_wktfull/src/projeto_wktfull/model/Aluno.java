package model;

public class Aluno {
  private int id;
  private String nome;
  private int idade;
  private Long telefone;

  public Aluno(int id, String nome, int idade, Long telefone) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
  }

  public Mensalidade getMensalidadeById(Integer id) {
    Academia ac = new Academia();

    for(Mensalidade m:ac.getMensalidades()) {
      if(m.getId() == id) {
        return m;
      }
    }

    return null;
  }

  public Mensalidade getMensalidadeByAluno(Aluno aluno) {
    Academia ac = new Academia();

    for(Mensalidade m:ac.getMensalidades()) {
      if(m.getAluno() == aluno) {
        return m;
      }
    }

    return null;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public Long getTelefone() {
    return telefone;
  }

  public void setTelefone(Long telefone) {
    this.telefone = telefone;
  }
}

