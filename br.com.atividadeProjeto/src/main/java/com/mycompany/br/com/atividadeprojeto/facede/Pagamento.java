/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.facede;

/**
 *
 * @author felipe.8129
 */
public class Pagamento {
    public void processarPagamento(Pedido pedido) {
        System.out.println("Processando pagamento...");
        // Simulando um pagamento aprovado.
        pedido.setStatus("Pronto");
    }
}