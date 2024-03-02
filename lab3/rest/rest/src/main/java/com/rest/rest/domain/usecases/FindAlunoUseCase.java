package com.rest.rest.domain.usecases;

import com.rest.rest.domain.model.Aluno;

public interface FindAlunoUseCase {
  
  public Aluno findById(Long id);

}
