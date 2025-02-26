package br.com.felipe.criacionais.estruturais.adapter;
/**
 *
 * @author felipe.8129
 */
public class PagamentoNovoAdapter implements Pagamento{

    private PagamentoNovo pagamentoNovo = new PagamentoNovo();
    
    
    public void pagar(double valor) {
        pagamentoNovo.pagar(valor);
    }
}
