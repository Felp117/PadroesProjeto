package com.mycompany.br.com.atividadeprojeto.bridge;

public class ControleBasico implements Controle {

    protected Dispositivo dispositivo;

    public ControleBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ligar() {
        dispositivo.ligar();
    }

    @Override
    public void desligar() {
        dispositivo.desligar();
    }

    @Override
    public void aumentarVolume() {
        dispositivo.aumentarVolume();
    }

    @Override
    public void diminuirVolume() {
        dispositivo.diminuirVolume();
    }

    @Override
    public void exibirEstado() {
        dispositivo.exibirEstado();
    }
}
