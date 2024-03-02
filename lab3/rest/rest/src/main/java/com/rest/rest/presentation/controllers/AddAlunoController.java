package com.rest.rest.presentation.controllers;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.rest.domain.model.Aluno;
import com.rest.rest.data.usecases.AddAluno;
import com.rest.rest.data.usecases.FindAluno;
import com.rest.rest.domain.usecases.AddAlunoUseCase;
import com.rest.rest.domain.usecases.FindAlunoUseCase;

@RestController
@RequestMapping(value = "/alunos")
public class AddAlunoController {
  
  private AddAlunoUseCase addAlunoUseCase = new AddAluno();
  private FindAlunoUseCase findAlunoUseCase = new FindAluno();

  @PostMapping
  public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
    Aluno createdAluno = this.addAlunoUseCase.addAluno(aluno);

    return ResponseEntity.status(201).body(createdAluno);
  }

  @GetMapping("/{alunoId}")
  public ResponseEntity<Aluno> findById(@PathVariable Long alunoId) {
    Aluno aluno = this.findAlunoUseCase.findById(alunoId);

    if(aluno != null) {
      return ResponseEntity.status(200).body(aluno);
    }

    return ResponseEntity.notFound().build(); 
  }

}
