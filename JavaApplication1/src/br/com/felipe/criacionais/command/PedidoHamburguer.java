package br.com.felipe.criacionais.command;

/**
 *
 * @author felipe.8129
 */
public class PedidoHamburguer implements Pedido{
    
    private Cozinheiro cozinheiro;

    public PedidoHamburguer(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }
    
    @Override
    public void executar() {
        cozinheiro.fazerHamburguer();
    }
    
}
