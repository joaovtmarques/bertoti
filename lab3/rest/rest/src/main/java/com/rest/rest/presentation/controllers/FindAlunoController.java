package com.rest.rest.presentation.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.rest.data.usecases.FindAluno;
import com.rest.rest.domain.model.Aluno;
import com.rest.rest.domain.usecases.FindAlunoUseCase;

@RestController
@RequestMapping(value = "/alunos")
public class FindAlunoController {
  FindAlunoUseCase findAluno = new FindAluno();

  @GetMapping("/{alunoId}")
  public ResponseEntity<Aluno> findById(@PathVariable Long alunoId) {
    Aluno aluno = this.findAluno.findById(alunoId);

    if(aluno != null) {
      return ResponseEntity.status(200).body(aluno);
    }

    return ResponseEntity.notFound().build(); 
  }
}
