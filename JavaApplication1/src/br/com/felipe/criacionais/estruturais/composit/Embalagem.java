package br.com.felipe.criacionais.estruturais.composit;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author felipe.8129
 */
public class Embalagem implements Item{
    
    private String nome;
    private List<Item> itens = new ArrayList<>();

    public Embalagem(String nome) {
        this.nome = nome;
    }
    
    @Override
    public double getPreco() {
        double total = 0;
        for(Item item: itens) {
            total += item.getPreco();
        }
      return total;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
    public void adicionarItem(Item item) {
        itens.add(item);
    }
    
    public void listarItens() {
        System.out.println(nome + " contém: ");
        for(Item item: itens) {
            System.out.println(" - " + item.getNome() + " (R$" + item.getPreco() + ")");
        }
    }
}
