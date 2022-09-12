package projeto_wktfull;

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

  // public Mensalidade cadastrarMensalidade() {
  //   Random random = new Random();

  //   Calendar v = Calendar.getInstance();
	// 	v.set(Calendar.MONTH, +1);

  //   Mensalidade m = new Mensalidade(
  //     id = random.nextInt(100),
  //     v,
  //     random.nextDouble()
  //   );

  //   return m;
  // }

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
}
