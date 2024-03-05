package com.rest.rest.data.usecases;

import com.rest.rest.data.protocols.AlunoRepositoryProtocol;
import com.rest.rest.domain.usecases.DeleteAlunoUseCase;
import com.rest.rest.infra.repositories.AlunoRepository;

public class DeleteAluno implements DeleteAlunoUseCase {
  
  private AlunoRepositoryProtocol alunoRepository = new AlunoRepository();

  @Override
  public void delete(Long alunoId) {
    this.alunoRepository.delete(alunoId);
  }

}
