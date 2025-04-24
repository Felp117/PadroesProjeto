package br.com.felipe.antiPadroes.estruturais.proxy;

/**
 *
 * @author felipe.8129
 */
public class Cliente {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.processarPagamento("maria", 1500.00);
        banco.processarPagamento("João", 1200.00);
    }
    
}
