package br.com.felipe.criacionais.command;

/**
 *
 * @author felipe.8129
 */
public class Garcom {

    public void enviarPedido(Pedido pedido) {
        pedido.executar();
    }
    
}
