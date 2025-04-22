/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.felipe.atividade.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class EmailNotificacao implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
    
}
