package br.com.felipe.criacionais.command;
/**
 *
 * @author felipe.8129
 */
public class PedidoSalada implements Pedido{

    private Cozinheiro cozinheiro;

    public PedidoSalada(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }
    
    @Override
    public void executar() {
        cozinheiro.fazerSalada();
    }
    
    
    
}
