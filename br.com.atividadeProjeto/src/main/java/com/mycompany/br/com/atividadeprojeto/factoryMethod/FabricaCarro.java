/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.factoryMethod;

/**
 *
 * @author felipe.8129
 */
public class FabricaCarro extends FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("eletrico")) {
            return new CarroEletrico();
        } else if (tipo.equalsIgnoreCase("combustao")) {
            return new CarroCombustao();
        }
        throw new IllegalArgumentException("Tipo de carro desconhecido: " + tipo);
    }
}