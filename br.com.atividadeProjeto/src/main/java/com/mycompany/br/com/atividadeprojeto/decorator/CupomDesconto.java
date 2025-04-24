/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.decorator;

/**
 *
 * @author felipe.8129
 */
public class CupomDesconto extends BebidaDecorator {
    private double percentual;

    public CupomDesconto(Bebida bebida, double percentual) {
        super(bebida);
        this.percentual = percentual;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " (com desconto de " + percentual + "%)";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() * (1 - percentual / 100);
    }
}