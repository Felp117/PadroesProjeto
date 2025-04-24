/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.decorator;

/**
 *
 * @author felipe.8129
 */
public class Caramelo extends BebidaDecorator {
    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Caramelo";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.2;
    }
}