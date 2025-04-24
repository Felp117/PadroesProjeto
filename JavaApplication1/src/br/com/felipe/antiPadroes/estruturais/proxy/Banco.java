package br.com.felipe.antiPadroes.estruturais.proxy;

/**
 *
 * @author felipe.8129
 */
public class Banco {
    public void processarPagamento(String cliente, double valor) {
        System.out.println("Banco: processando pagamento de R$" + valor + " para " + cliente);
    }
}
