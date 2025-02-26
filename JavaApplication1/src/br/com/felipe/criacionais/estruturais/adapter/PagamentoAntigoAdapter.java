package br.com.felipe.criacionais.estruturais.adapter;
/**
 *
 * @author felipe.8129
 */
public class PagamentoAntigoAdapter implements Pagamento{
    
    private PagamentoAntigo sistemaAntigo = new PagamentoAntigo();

    @Override
    public void pagar(double valor) {
        sistemaAntigo.processarPagamento(valor);
    }
    
    
}
