/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.decorator;

/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {
        // Cliente pede um café com leite e chantilly
        Bebida pedido = new Cafe();
        pedido = new Leite(pedido);
        pedido = new Chantilly(pedido);

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());

        // Cliente aplica um cupom de 20% de desconto
        Bebida pedidoComDesconto = new CupomDesconto(pedido, 20);

        System.out.println("Pedido com desconto: " + pedidoComDesconto.getDescricao());
        System.out.println("Preço final: R$ " + pedidoComDesconto.getPreco());
    }
}
