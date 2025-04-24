/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.bridge;

/**
 *
 * @author felipe.8129
 */
public class ControleAvancado extends ControleBasico {

    private boolean modoSilencioso = false;
    private int timerDesligamento = 0;

    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void ativarModoSilencioso() {
        modoSilencioso = true;
        System.out.println("Modo silencioso ativado.");
    }

    public void desativarModoSilencioso() {
        modoSilencioso = false;
        System.out.println("Modo silencioso desativado.");
    }

    public void configurarTimerDesligamento(int minutos) {
        timerDesligamento = minutos;
        System.out.println("Timer de desligamento configurado para " + minutos + " minutos.");
    }

    @Override
    public void exibirEstado() {
        super.exibirEstado();
        if (modoSilencioso) {
            System.out.println("Modo silencioso está ativado.");
        }
        if (timerDesligamento > 0) {
            System.out.println("Timer de desligamento: " + timerDesligamento + " minutos.");
        }
    }
}
