/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.facede;

/**
 *
 * @author felipe.8129
 */
public class Cozinha {

    public void preparar(Pedido pedido) {
        System.out.println("Preparando o pedido...");
        pedido.setStatus("Preparação");
    }
}
