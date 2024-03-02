package com.rest.rest.data.usecases;

import com.rest.rest.data.protocols.AlunoRepositoryProtocol;
import com.rest.rest.domain.model.Aluno;
import com.rest.rest.domain.usecases.FindAlunoUseCase;
import com.rest.rest.infra.repositories.AlunoRepository;

public class FindAluno implements FindAlunoUseCase {

  private AlunoRepositoryProtocol alunoRepository = new AlunoRepository();

  @Override
  public Aluno findById(Long id) {
    Aluno aluno = this.alunoRepository.findById(id);
    
    return aluno;
  }
}
