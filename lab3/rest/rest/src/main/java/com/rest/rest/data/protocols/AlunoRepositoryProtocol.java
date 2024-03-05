package com.rest.rest.data.protocols;

import java.util.ArrayList;

import com.rest.rest.domain.model.Aluno;

public interface AlunoRepositoryProtocol {
  public Aluno findById(Long id);

  public Aluno create(Aluno aluno);

  public ArrayList<Aluno> findAll();

  public void delete(Long id);

  public Aluno update(Long id, Aluno aluno);
}
