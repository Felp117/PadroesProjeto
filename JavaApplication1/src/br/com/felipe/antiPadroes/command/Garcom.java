package br.com.felipe.antiPadroes.command;
/**
 *
 * @author felipe.8129
 */
public class Garcom {
    
    private Cozinheiro cozinheiro = new Cozinheiro();
    
    public void fazerPedido(String pedido) {
        if(pedido.equals("pizza")) {
            cozinheiro.fazerPizza();
        } else if (pedido.equals("hamburguer")) {
            cozinheiro.fazerHamburguer();
        } else {
            System.out.println("Garçom: pedido desconhecido");
        }
    }
    
}
