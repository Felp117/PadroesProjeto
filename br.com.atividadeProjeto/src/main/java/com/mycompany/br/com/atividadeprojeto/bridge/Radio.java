package com.mycompany.br.com.atividadeprojeto.bridge;

public class Radio implements Dispositivo {

    private boolean ligado = false;
    private int volume = 5;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado.");
    }

    @Override
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume do Rádio: " + volume);
    }

    @Override
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume do Rádio: " + volume);
    }

    @Override
    public void exibirEstado() {
        System.out.println("Rádio está " + (ligado ? "ligado" : "desligado") + " com volume: " + volume);
    }
}
