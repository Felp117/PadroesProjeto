package com.mycompany.br.com.felipe.atividade.estruturais.decorator;

public abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao wrappee;

    public NotificacaoDecorator(Notificacao wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void enviar(String mensagem) {
        wrappee.enviar(mensagem);
    }
}
