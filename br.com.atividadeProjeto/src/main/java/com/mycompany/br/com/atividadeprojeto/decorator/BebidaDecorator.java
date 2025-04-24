/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.decorator;

/**
 *
 * @author felipe.8129
 */
public abstract class BebidaDecorator implements Bebida {

    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract String getDescricao();

    public abstract double getPreco();
}
