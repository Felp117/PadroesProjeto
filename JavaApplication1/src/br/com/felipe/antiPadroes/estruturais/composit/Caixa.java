package br.com.felipe.antiPadroes.estruturais.composit;
/**
 *
 * @author felipe.8129
 */
public class Caixa {
    
    private String nome;
    private Produto produto;
    private int quantidade;

    public Caixa(String nome, Produto produto, int quantidade) {
        this.nome = nome;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public double getPreco() {
        return produto.getPreco() * quantidade;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
