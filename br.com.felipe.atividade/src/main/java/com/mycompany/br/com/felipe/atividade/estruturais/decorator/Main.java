/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.felipe.atividade.estruturais.decorator;

public class Main {
    public static void main(String[] args) {
        
        // Notificação simples
        Notificacao simples = new EmailNotificacao();
        simples.enviar("Mensagem simples");

        System.out.println();

        // Notificação com criptografia
        Notificacao segura = new CriptografiaDecorator(new SMSNotificacao());
        segura.enviar("Mensagem segura");

        System.out.println();

        // Notificação com log e criptografia
        Notificacao completa = new LogAuditoriaDecorator(
                                    new CriptografiaDecorator(
                                        new EmailNotificacao()));
        completa.enviar("Mensagem completa");

        System.out.println();

        // Notificação via app com log
        Notificacao appComLog = new LogAuditoriaDecorator(new AppNotificacao());
        appComLog.enviar("Notificação de app com log");
    }
}