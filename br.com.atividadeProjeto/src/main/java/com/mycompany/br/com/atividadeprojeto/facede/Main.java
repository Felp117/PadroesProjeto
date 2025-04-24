package com.mycompany.br.com.atividadeprojeto.facede;

public class Main {

    public static void main(String[] args) {
        // Criando um novo pedido
        Pedido pedido = new Pedido();

        // Criando o Gerenciador de Pedidos
        GerenciadorDePedido gerenciador = new GerenciadorDePedido();

        // Realizando o pedido
        gerenciador.fazerPedido(pedido);

        // Acompanhando o pedido em diferentes etapas
        System.out.println(gerenciador.acompanharPedido(pedido)); // Status do pedido: Saiu para entrega
    }
}
