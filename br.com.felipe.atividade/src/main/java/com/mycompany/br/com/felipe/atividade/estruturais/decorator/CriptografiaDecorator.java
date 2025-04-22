package com.mycompany.br.com.felipe.atividade.estruturais.decorator;

public class CriptografiaDecorator extends NotificacaoDecorator {

    public CriptografiaDecorator(Notificacao wrappee) {
        super(wrappee);
    }

    @Override
    public void enviar(String mensagem) {
        String mensagemCriptografada = criptografar(mensagem);
        super.enviar(mensagemCriptografada);
    }

    private String criptografar(String mensagem) {
        // Simulação de criptografia (reverso da string)
        return new StringBuilder(mensagem).reverse().toString();
    }
}