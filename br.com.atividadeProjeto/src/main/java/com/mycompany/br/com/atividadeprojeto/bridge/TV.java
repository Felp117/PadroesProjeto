package com.mycompany.br.com.atividadeprojeto.bridge;

public class TV implements Dispositivo {

    private boolean ligado = false;
    private int volume = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada.");
    }

    @Override
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume da TV: " + volume);
    }

    @Override
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume da TV: " + volume);
    }

    @Override
    public void exibirEstado() {
        System.out.println("TV está " + (ligado ? "ligada" : "desligada") + " com volume: " + volume);
    }
}
