/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.bridge;

/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {
        // Criando dispositivos
        Dispositivo tv = new TV();
        Dispositivo radio = new Radio();
        Dispositivo projetor = new Projetor();

        // Criando controles remotos
        Controle controleTVBasico = new ControleBasico(tv);
        Controle controleRadioAvancado = new ControleAvancado(radio);
        Controle controleProjetorAvancado = new ControleAvancado(projetor);

        // Usando controle básico para a TV
        controleTVBasico.ligar();
        controleTVBasico.aumentarVolume();
        controleTVBasico.exibirEstado();

        // Usando controle avançado para o Rádio
        ControleAvancado controleRadio = (ControleAvancado) controleRadioAvancado;
        controleRadio.ligar();
        controleRadio.ativarModoSilencioso();
        controleRadio.configurarTimerDesligamento(30);
        controleRadio.exibirEstado();

        // Usando controle avançado para o Projetor
        ControleAvancado controleProjetor = (ControleAvancado) controleProjetorAvancado;
        controleProjetor.ligar();
        controleProjetor.exibirEstado();
    }
}
