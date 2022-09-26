import static org.junit.Assert.*;
import org.junit.Test;

public class Test {

  @Test
  public void test() {
    Estacionamento estacionamento = new Estacionamento();
    //Testes de Classes de Equivalencia para o método cadastrarCarro
    //1 classe de equivalência: 0 carros (lista vazia)
    assertEquals(estacionamento.getCarros().size(), 0);

    //1 classe de equivalência: 1 carro (guardando 1 objeto)
    estacionamento.cadastrarCarro(new Carro("AAA1111", new Especificacao("VW", "fusca", "verde")));
    assertEquals(estacionamento.getCarros().size(), 1);
    
    //1 classe de equivalência: n carros (utilizando a Lista para guardar n carros)
    estacionamento.cadastrarCarro(new Carro("BBB1111", new Especificacao("VW", "fusca", "amarelo")));
    estacionamento.cadastrarCarro(new Carro("CCC1111", new Especificacao("VW", "variant", "azul")));
    assertEquals(estacionamento.getCarros().size(), 3);

    //Testes de Classes de Equivalencia para o método buscarCarroPorEspecificacao
    //1 classe de equivalência: 0 carros encontrados (estou testando “lista vazia”)
    List<Carro> encontrados = estacionamento.buscarCarroPorEspecificacao(new Especificacao("fiat", "fusca", "azul"));
    assertEquals(encontrados.size(), 0);

    //1 classe de equivalência: 1 carro (guardando 1 objeto)
    List<Carro> encontrados2 = estacionamento.buscarCarroPorEspecificacao(new Especificacao("VW", "fusca", "verde"));
    assertEquals(encontrados2.size(), 1);

    //1 classe de equivalência: n carros (encontrando n carros)
    estacionamento.cadastrarCarro(new Carro("FFF1111", new Especificacao("VW", "fusca", "amarelo")));
    estacionamento.cadastrarCarro(new Carro("ABC1111", new Especificacao("VW", "fusca", "amarelo")));
    List<Carro> encontrados3 = estacionamento.buscarCarroPorEspecificacao(new Especificacao("VW", "fusca", "amarelo"));
    assertEquals(encontrados3.size(), 3);

    //Testes de Classes de Equivalencia para o método buscarCarroPorPlaca
    //1 classe de equivalência: retorna 1 carro
    Carro carro1 = estacionamento.buscarCarroPorPlaca("ABC1111");
    assertEquals(carro1.getEspec().getModelo(), "fusca");
    assertEquals(carro1.getEspec().getCorCarro(), "amarelo");
    
    //1 classe de equivalência: retorna null
    Carro carro2 = estacionamento.buscarCarroPorPlaca("DSA7878");
    assertEquals(carro2, null);
  }

}
