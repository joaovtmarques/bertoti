package com.rest.rest.presentation.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.rest.domain.model.Aluno;
import com.rest.rest.data.usecases.AddAluno;
import com.rest.rest.domain.usecases.AddAlunoUseCase;

@RestController
@RequestMapping(value = "/alunos")
public class AddAlunoController {
  
  private AddAlunoUseCase addAluno = new AddAluno();

  @PostMapping
  public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
    Aluno createdAluno = this.addAluno.addAluno(aluno);

    return ResponseEntity.status(201).body(createdAluno);
  }

  

}
