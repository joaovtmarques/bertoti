package com.rest.rest.presentation.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.rest.data.usecases.DeleteAluno;
import com.rest.rest.data.usecases.FindAluno;
import com.rest.rest.domain.model.Aluno;
import com.rest.rest.domain.usecases.DeleteAlunoUseCase;
import com.rest.rest.domain.usecases.FindAlunoUseCase;

@RestController
@RequestMapping("/alunos")
public class DeleteAlunoController {
  
  private FindAlunoUseCase findAluno = new FindAluno();
  private DeleteAlunoUseCase deleteAluno = new DeleteAluno();

  @DeleteMapping("/{alunoId}")
  public ResponseEntity<Void> delete(@PathVariable Long alunoId) {

    Aluno alunoExists = findAluno.findById(alunoId);

    if(alunoExists == null) {
      return ResponseEntity.notFound().build(); 
    }

    deleteAluno.delete(alunoId);

    return ResponseEntity.ok().build();
  }

}
