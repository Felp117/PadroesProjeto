package br.com.felipe.antiPadroes.estruturais.adapter;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        SistemaDePagamento sistemaAntigo = new SistemaDePagamento(false);
        sistemaAntigo.realizarPagamento(100.54);
        
        SistemaDePagamento sistemaNovo = new SistemaDePagamento(true);
        sistemaNovo.realizarPagamento(200.54);
    }
}
