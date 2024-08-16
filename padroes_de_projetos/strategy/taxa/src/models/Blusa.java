package models;

import interfaces.Taxa;

public class Blusa implements Taxa {
  
  private String tamanho;
  private Double peso;

  public Blusa(String tamanho, Double peso) {
    this.tamanho = tamanho;
    this.peso = peso;
  }

  public String getTamanho() {
    return tamanho;
  }

  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  @Override
  public Double calculaTaxa() {
    return peso * 20;
  }

}
