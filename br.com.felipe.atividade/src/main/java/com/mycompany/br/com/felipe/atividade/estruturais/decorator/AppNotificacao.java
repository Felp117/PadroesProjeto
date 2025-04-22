package com.mycompany.br.com.felipe.atividade.estruturais.decorator;

/**
 *
 * @author felipe.8129
 */
public class AppNotificacao implements Notificacao{
     
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando App Notificação: " + mensagem);
    }
}
