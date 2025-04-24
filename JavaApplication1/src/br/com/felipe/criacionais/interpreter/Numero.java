/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.felipe.criacionais.interpreter;

/**
 *
 * @author felipe.8129
 */
public class Numero implements Expressao {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public int interpretar() {
        return numero;      
    }
}
