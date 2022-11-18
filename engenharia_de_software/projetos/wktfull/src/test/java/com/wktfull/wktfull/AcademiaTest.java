package com.wktfull.wktfull;

import com.wktfull.wktfull.model.Academia;

import static org.junit.Assert.*;

import com.wktfull.wktfull.model.Aluno;
import org.junit.Test;

import java.util.Random;

import com.wktfull.wktfull.helper.ModelBuilderHelper;

public class AcademiaTest {

    @Test
    public void AlunosListEmpty() {
        Academia academia = new Academia();

        assertEquals(0, academia.getAlunos().size());
    }

    @Test
    public void AlunosListHasOne() {
        Academia academia = new Academia();

        academia.addAluno(ModelBuilderHelper.buildAluno(new Random().nextInt()));
        assertEquals(1, academia.getAlunos().size());
    }

    @Test
    public void AlunosListHasMany() {
        Academia academia = new Academia();

        academia.addAluno(ModelBuilderHelper.buildAluno(new Random().nextInt()));
        academia.addAluno(ModelBuilderHelper.buildAluno(new Random().nextInt()));
        academia.addAluno(ModelBuilderHelper.buildAluno(new Random().nextInt()));
        assertEquals(3, academia.getAlunos().size());
    }

    @Test
    public void AlunoByNome() {
        Academia academia = new Academia();
        Aluno aluno = ModelBuilderHelper.buildAluno(new Random().nextInt());

        academia.addAluno(aluno);

        assertEquals(aluno.getNome(), academia.getAlunoByNome(academia, aluno.getNome()).getNome());
    }


    

}
