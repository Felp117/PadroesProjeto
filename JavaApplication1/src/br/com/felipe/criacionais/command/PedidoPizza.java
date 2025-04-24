package br.com.felipe.criacionais.command;

/**
 *
 * @author felipe.8129
 */
public class PedidoPizza implements Pedido {

    private Cozinheiro cozinheiro;

    public PedidoPizza(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }
    
    @Override
    public void executar() {
       cozinheiro.fazerPizza();
    }
}
