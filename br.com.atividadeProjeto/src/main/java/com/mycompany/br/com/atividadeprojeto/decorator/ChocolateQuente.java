/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.br.com.atividadeprojeto.decorator;

/**
 *
 * @author felipe.8129
 */
public class ChocolateQuente implements Bebida {

    @Override
    public String getDescricao() {
        return "Chocolate Quente";
    }

    @Override
    public double getPreco() {
        return 6.0;
    }
}
