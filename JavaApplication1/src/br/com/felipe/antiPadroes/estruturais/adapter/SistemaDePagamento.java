package br.com.felipe.antiPadroes.estruturais.adapter;
/**
 *
 * @author felipe.8129
 */
public class SistemaDePagamento {
    
    private boolean usarSistemaNovo;
    private PagamentoAntigo pagamentoAntigo = new PagamentoAntigo();
    private pagamentoNovo pagamentoNovo = new pagamentoNovo();

    public SistemaDePagamento(boolean usarSistemaNovo) {
        this.usarSistemaNovo = usarSistemaNovo;
    }
    
    public void realizarPagamento(double valor) {
        if(usarSistemaNovo) {
            System.out.println("Convertendo valor para o sistema novo");
            pagamentoNovo.pagar(valor);
        } else {
            pagamentoAntigo.processarPagamento(valor);
        }
    }
}
