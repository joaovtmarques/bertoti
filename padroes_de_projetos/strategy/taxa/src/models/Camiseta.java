package models;

import interfaces.Taxa;

public class Camiseta implements Taxa {
  
  private String tamanho;
  private Double peso;

  public Camiseta(String tamanho, Double peso) {
    this.tamanho = tamanho;
    this.peso = peso;
  }

  @Override
  public Double calculaTaxa() {
    return peso * 17.5;
  }

  public String getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }

  public Double getPeso() {
    return this.peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

}
