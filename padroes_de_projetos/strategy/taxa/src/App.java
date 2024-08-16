import java.math.BigDecimal;
import java.text.NumberFormat;

import models.Blusa;
import models.Camiseta;

public class App {
  public static void main(String[] args) throws Exception {
    
    Blusa blusa = new Blusa("M", 0.7);
    Camiseta camiseta = new Camiseta("M", 0.45);

    BigDecimal blusaTaxa = new BigDecimal(blusa.calculaTaxa());
    BigDecimal camisetaTaxa = new BigDecimal(camiseta.calculaTaxa());

    NumberFormat nf = NumberFormat.getCurrencyInstance(); 

    System.out.println("Valor da taxa de envio para a blusa no tamanho " + 
          blusa.getTamanho() + ": " + nf.format(blusaTaxa));
    System.out.println("Valor da taxa de envio para a camiseta no tamanho " + 
          camiseta.getTamanho() + ": " + nf.format(camisetaTaxa));
  }
}
