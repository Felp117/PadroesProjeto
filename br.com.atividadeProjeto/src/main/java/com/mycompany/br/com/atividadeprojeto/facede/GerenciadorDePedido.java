/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.facede;

/**
 *
 * @author felipe.8129
 */
public class GerenciadorDePedido {

    private Cozinha cozinha;
    private Entrega entrega;
    private Pagamento pagamento;

    public GerenciadorDePedido() {
        this.cozinha = new Cozinha();
        this.entrega = new Entrega();
        this.pagamento = new Pagamento();
    }

    public void fazerPedido(Pedido pedido) {
        System.out.println("Iniciando o pedido...");
        cozinha.preparar(pedido);  // Etapa de preparação
        pagamento.processarPagamento(pedido);  // Etapa de pagamento
        entrega.entregar(pedido);  // Etapa de entrega
    }

    public String acompanharPedido(Pedido pedido) {
        return "Status do pedido: " + pedido.getStatus();
    }
}
