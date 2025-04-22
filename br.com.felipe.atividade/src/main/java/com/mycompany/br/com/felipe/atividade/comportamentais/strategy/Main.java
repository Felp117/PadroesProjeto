package com.mycompany.br.com.felipe.atividade.comportamentais.strategy;

public class Main {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(450.00);

        // Aplicando desconto por quantidade
        System.out.println("=== Desconto por Quantidade ===");
        carrinho.setEstrategiaDesconto(new DescontoQuantidade());
        carrinho.calcularPrecoFinal();

        System.out.println("\n=== Desconto de Temporada ===");
        carrinho.setEstrategiaDesconto(new DescontoTemporada());
        carrinho.calcularPrecoFinal();

        System.out.println("\n=== Desconto Membro VIP ===");
        carrinho.setEstrategiaDesconto(new DescontoMembroVIP());
        carrinho.calcularPrecoFinal();
    }
}
