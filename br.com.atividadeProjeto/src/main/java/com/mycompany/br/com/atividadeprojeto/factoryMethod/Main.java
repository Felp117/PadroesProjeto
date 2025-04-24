/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.factoryMethod;

/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        FabricaVeiculo fabricaCarro = new FabricaCarro();
        Veiculo carro = fabricaCarro.criarVeiculo("eletrico");
        carro.acao();  

        FabricaVeiculo fabricaCaminhao = new FabricaCaminhao();
        Veiculo caminhao = fabricaCaminhao.criarVeiculo("combustao");
        caminhao.acao(); 
    }
}