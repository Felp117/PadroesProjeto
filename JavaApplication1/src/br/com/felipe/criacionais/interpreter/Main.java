/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.felipe.criacionais.interpreter;

/**
 *
 * @author felipe.8129
 */
public class Main {
     public static void main(String[] args) {
        Expressao expressao1 = Interpretador.construirExpressao("10 + 5");
        System.out.println(expressao1.interpretar());

        Expressao expressao2 = Interpretador.construirExpressao("20 - 8");
        System.out.println(expressao2.interpretar());
    }

}
