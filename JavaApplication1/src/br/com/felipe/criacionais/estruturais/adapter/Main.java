package br.com.felipe.criacionais.estruturais.adapter;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        
        SistemaDePagamento sistema1 = new SistemaDePagamento(new PagamentoAntigoAdapter());
        sistema1.realizarPagamento(400);
        
        SistemaDePagamento sistema2 = new SistemaDePagamento(new PagamentoNovoAdapter());
        sistema2.realizarPagamento(100);
    }
}
