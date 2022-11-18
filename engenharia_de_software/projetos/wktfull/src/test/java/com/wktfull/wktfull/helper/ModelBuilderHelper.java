package com.wktfull.wktfull.helper;

import com.wktfull.wktfull.model.Aluno;

public class ModelBuilderHelper {
  public static Aluno buildAluno(Integer id) {

    Aluno aluno = new Aluno(
      id,
      "NomeAluno",
      20,
      Long.valueOf(000000000)
    );

    return aluno;
  }
}
