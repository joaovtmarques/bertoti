import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Academia;
import model.Aluno;
import model.Mensalidade;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
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
