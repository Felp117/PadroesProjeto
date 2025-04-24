/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.factoryMethod;

/**
 *
 * @author felipe.8129
 */
public class FabricaCaminhao extends FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("eletrico")) {
            return new CaminhaoEletrico();
        } else if (tipo.equalsIgnoreCase("combustao")) {
            return new CaminhaoCombustao();
        }
        throw new IllegalArgumentException("Tipo de caminhão desconhecido: " + tipo);
    }
}