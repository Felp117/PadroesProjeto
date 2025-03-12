package br.com.felipe.criacionais.estruturais.composit;
/**
 *
 * @author felipe.8129
 */
public class Produto implements Item{
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
       return preco;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
    
    
}
