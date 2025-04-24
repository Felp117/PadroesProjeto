package br.com.felipe.antiPadroes.command;
/**
 *
 * @author felipe.8129
 */
public class Main {
   
    public static void main(String[] args) {
        Garcom garcom = new Garcom();
        garcom.fazerPedido("pizza");
        garcom.fazerPedido("hamburguer");
        garcom.fazerPedido("tofu");
        
    }
    
}
