package projeto_wktfull;

import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Academia {
  private int id;
  private String nome;
  private double telefone;
  private List<Aluno> alunos = new LinkedList<Aluno>();

  public Academia() {
  }

  public void cadastrarAluno(Aluno aluno) {
    alunos.add(aluno);
    
    
    Mensalidade mensalidade = new Mensalidade(1, "12/10/2022", 100.00, aluno);

    // System.out.println(a);
    // System.out.println(mensalidade);
  }
}

