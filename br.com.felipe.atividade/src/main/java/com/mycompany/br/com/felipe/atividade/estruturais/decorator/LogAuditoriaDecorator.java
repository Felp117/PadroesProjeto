package com.mycompany.br.com.felipe.atividade.estruturais.decorator;

public class LogAuditoriaDecorator extends NotificacaoDecorator {

    public LogAuditoriaDecorator(Notificacao wrappee) {
        super(wrappee);
    }

    @Override
    public void enviar(String mensagem) {
        logAuditoria(mensagem);
        super.enviar(mensagem);
    }

    private void logAuditoria(String mensagem) {
        System.out.println("[LOG] Enviando mensagem: " + mensagem);
    }
}