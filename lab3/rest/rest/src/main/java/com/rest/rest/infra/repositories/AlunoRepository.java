package com.rest.rest.infra.repositories;

import java.util.ArrayList;

import com.rest.rest.data.protocols.AlunoRepositoryProtocol;
import com.rest.rest.domain.model.Aluno;

public class AlunoRepository implements AlunoRepositoryProtocol {
  private ArrayList<Aluno> alunos;

  @Override
  public Aluno create(Aluno aluno) {
    alunos.add(aluno);

    return aluno;
  }

  @Override
  public Aluno findById(Long id) {
    Aluno aluno = null;

    for(Aluno al : this.alunos) {
      if(al.getId().equals(id)) {
        aluno = al;
      }
    }

    return aluno;
  }

  @Override
  public ArrayList<Aluno> findAll() {
    return this.alunos;
  }
}
