/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinacioncajafuerte;

// Importo el paquete java.util para poder utilizar la clase Scanner
import java.util.*;

/**
 *
 * @author Amarico
 */
public class CombinacionCajaFuerte {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    /**
     * Realiza el control de acceso a una caja fuerte. La combinación será un
     * número de 4 cifras. El programa nos pedirá la combinación para abrirla.
     * Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
     * combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto
     * satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja
     * fuerte.
     *
     *
     */
    // Creo una variable y una constante de tipo entero
    final int COMBINACION = 1234;

    int adivinaCombinacion ;
    
   

   

    // Creo un objeto de la clase Scanner
    Scanner entrada = new Scanner(System.in);
    
    int intentos = 4;
    
    
    
    boolean acertado = false;
    
    do {
      
      System.out.println("Introduzca la clave de la caja fuerte");
      
      adivinaCombinacion = entrada.nextInt();
      
    if (adivinaCombinacion ==  COMBINACION){
      
      acertado = true;
      
      
      
    }else {
      
      System.out.println("Clave incorrecta");
    }
    
    intentos --;
    
    }while ((intentos > 0) && (!acertado));
if (acertado){
  
    System.out.println("Ha abierto la caja fuerte.");
  
  }else {
  
  System.out.println("Lo siento, ha agotado las 4 oportunidades");
}
    
    
}

}
  


    