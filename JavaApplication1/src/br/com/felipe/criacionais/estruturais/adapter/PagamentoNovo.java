package br.com.felipe.criacionais.estruturais.adapter;

import br.com.felipe.antiPadroes.estruturais.adapter.*;

/**
 *
 * @author felipe.8129
 */
public class PagamentoNovo {
    
    public void pagar(double montante) {
        System.out.println("Pagamento de R$" + montante +
                " processado pelo sistema novo");
    }
}