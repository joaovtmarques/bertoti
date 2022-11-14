package com.wktfull.wktfull;

import com.wktfull.wktfull.model.Academia;
import com.wktfull.wktfull.model.Aluno;
import com.wktfull.wktfull.model.Mensalidade;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Academia ac = new Academia();

        Aluno a = new Aluno(1, "aluno 1",  1, new Long(1230004000));


        ac.setId(1);
        ac.setNome("Academia WKTFull");
        ac.setTelefone(new Long(1239058787));
        ac.addAluno(a);

        System.out.println("___________________________________");

        for(Aluno al:ac.getAlunos()) {
            System.out.println("Nome: "+al.getNome());
            System.out.println("Idade: "+al.getIdade());
            System.out.println("Telefone: "+al.getTelefone());
        }

        System.out.println("___________________________________");

        for(Mensalidade ms:ac.getMensalidades()) {
            System.out.println("Vencimento: "+ms.getVencimento());
            System.out.println("Valor: "+ms.getValor());
            System.out.println("Aluno: "+ms.getAluno().getNome());
        }
    }
}