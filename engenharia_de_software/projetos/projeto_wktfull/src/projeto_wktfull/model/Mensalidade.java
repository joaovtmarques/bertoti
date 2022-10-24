package model;

public class Mensalidade {
  private int id;
  private String vencimento;
  private double valor;
  private Aluno aluno;

  public Mensalidade(int id, String vencimento, double valor, Aluno aluno) {
    this.id = id;
    this.vencimento = vencimento;
    this.valor = valor;
    this.aluno = aluno;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getVencimento() {
    return vencimento;
  }

  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }
}
