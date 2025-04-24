package br.com.felipe.criacionais.command;

/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();
        Pedido pizza = new PedidoPizza(cozinheiro);
        Pedido hamburguer = new PedidoHamburguer(cozinheiro);
        Pedido salada = new PedidoSalada(cozinheiro);
        
        Garcom garcom = new Garcom();
        garcom.enviarPedido(pizza);
        garcom.enviarPedido(hamburguer);
        garcom.enviarPedido(salada);
    }
    
}
