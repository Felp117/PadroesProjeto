package br.com.felipe.criacionais.estruturais.proxy;

/**
 *
 * @author felipe.8129
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        ServicoBanco banco = new ProxyBanco();
        banco.processarPagamento("Joao", 500);
        banco.processarPagamento("Maria", 500);
        banco.processarPagamento("Joao", 500);
    }
    
}
