package br.com.felipe.criacionais.estruturais.adapter;
/**
 *
 * @author felipe.8129
 */
public class SistemaDePagamento {
    
    private Pagamento metodoPagamento;
    
    public SistemaDePagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public void realizarPagamento(double valor) {
        metodoPagamento.pagar(valor);
    }
    
}
