package com.rest.rest.data.usecases;

import java.util.ArrayList;

import com.rest.rest.data.protocols.AlunoRepositoryProtocol;
import com.rest.rest.domain.model.Aluno;
import com.rest.rest.domain.usecases.AddAlunoUseCase;
import com.rest.rest.infra.repositories.AlunoRepository;

public class AddAluno implements AddAlunoUseCase {

  private AlunoRepositoryProtocol alunoRepository = new AlunoRepository();
  
  @Override
  public Aluno addAluno(Aluno aluno) {
    ArrayList<Aluno> alunos = this.alunoRepository.findAll();
    Long id = Long.valueOf(0);

    if(alunos.size() == 0) {
      throw new Error("Não existem alunos cadastrados");
    }

    for(Aluno al : alunos) {
      if(alunos.get(alunos.size() - 1).getId() != null) {
        id = alunos.get(alunos.size() - 1).getId();
      } else {
        id = Long.valueOf(1);
      }
    }

    Aluno al = new Aluno(id, aluno.getNome(), aluno.getTelefone());

    return this.alunoRepository.create(al);
  }
}
