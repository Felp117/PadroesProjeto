package br.com.felipe.criacionais.estruturais.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felipe.8129
 */
public class ProxyBanco implements ServicoBanco{

    private Banco bancoVerdadeiro = new Banco();
    
    private Map<String, Double> saldoClientes = new HashMap<>();
    private Map<String, Boolean> cartaoAtivo = new HashMap<>();
    
    
    public ProxyBanco() {
        saldoClientes.put("João", 1000.00);
        saldoClientes.put("Maria", 500.00);
        cartaoAtivo.put("João", true);
        cartaoAtivo.put("Maria", false);
    }    
    @Override
    public void processarPagamento(String cliente, double valor) {
        
        if(!cartaoAtivo.get(cliente)) {
            System.out.println("Proxy: Transação negada! Cartão de " + cliente + " está inativo");
        }
        
        double saldo = saldoClientes.get(cliente);
        if(saldo < valor) {
            System.out.println("Proxy: Transação negada! Saldo insuficiente para " + cliente);
        }
        
        // se passar nas checagens chama o banco verdadeiro
        
        bancoVerdadeiro.processarPagamento(cliente, valor);
        saldoClientes.put(cliente, saldo - valor);
    }
    
}
