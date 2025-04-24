package br.com.felipe.criacionais.observer;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        Produto produto = new Produto("Samsung s25", 25);
        
        Cliente cliente = new Cliente("Adalberto");
        Cliente cliente2 = new Cliente("Dalberto");
        
        produto.adicionarObservador(cliente);
        produto.adicionarObservador(cliente2);
        
        produto.setQuantidade(10);
        produto.setQuantidade(0);
        
        produto.removerObservador(cliente2);
        produto.setQuantidade(15);    
    }
}
