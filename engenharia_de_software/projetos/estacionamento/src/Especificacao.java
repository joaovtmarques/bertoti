public class Especificacao {
  private String marca;
  private String modelo;
  private String corCarro;

  public Especificacao(String marca, String modelo, String corCarro) {
    this.marca = marca;
    this.modelo = modelo;
    this.corCarro = corCarro;
  }

  public String getMarca() {
  return marca;
  }

  public void setMarca(String novaMarca) {
    this.marca = novaMarca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String novoModelo) {
    this.modelo = novoModelo;
  }

  public String getCorCarro() {
    return corCarro;
  }

  public void setCorCarro(String novaCor) {
    this.corCarro = novaCor;
  }

  public boolean comparar(Especificacao especificacao) {
    if(this.marca.equals(especificacao.marca) && this.modelo.equals(especificacao.modelo) && this.corCarro.equals(especificacao.corCarro)){
      return true;
    } else {
      return false;
    }
  }
}
