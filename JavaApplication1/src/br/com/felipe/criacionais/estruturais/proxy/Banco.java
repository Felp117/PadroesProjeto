package br.com.felipe.criacionais.estruturais.proxy;

/**
 *
 * @author felipe.8129
 */
public class Banco implements ServicoBanco{

    @Override
    public void processarPagamento(String cliente, double valor) {
        System.out.println("Banco: Pagamento de R$" + valor + " processado para " + cliente);
    }

    
}
