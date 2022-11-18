package com.wktfull.wktfull;

import com.wktfull.wktfull.model.Academia;
import com.wktfull.wktfull.model.Aluno;
import com.wktfull.wktfull.model.Mensalidade;

import com.wktfull.wktfull.helper.ModelBuilderHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;

public class AlunoTest {
    @Test
    public void MensalidadeById() {
        Academia academia = new Academia();
        Aluno aluno = ModelBuilderHelper.buildAluno(new Random().nextInt());

        academia.addAluno(aluno);

        Mensalidade m = aluno.buscarMensalidadePorId(academia, 1);

        assertNotNull(m);
    }

    @Test
    public void MensalidadeByAluno() {
        Academia academia = new Academia();
        Aluno aluno = ModelBuilderHelper.buildAluno(new Random().nextInt());

        academia.addAluno(aluno);

        Mensalidade m = aluno.buscarMensalidadePorAluno(academia, aluno);

        assertNotNull(m);
    }
}

