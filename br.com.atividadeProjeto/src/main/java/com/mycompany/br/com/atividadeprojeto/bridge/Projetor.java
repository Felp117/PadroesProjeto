package com.mycompany.br.com.atividadeprojeto.bridge;

public class Projetor implements Dispositivo {

    private boolean ligado = false;
    private int volume = 8;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Projetor ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Projetor desligado.");
    }

    @Override
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume do Projetor: " + volume);
    }

    @Override
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume do Projetor: " + volume);
    }

    @Override
    public void exibirEstado() {
        System.out.println("Projetor está " + (ligado ? "ligado" : "desligado") + " com volume: " + volume);
    }
}
