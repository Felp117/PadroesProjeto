/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.felipe.criacionais.estruturais.bridge;

/**
 *
 * @author felipe.8129
 */
public class Projetor implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando projetor");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando projetor");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume do projetor");
    }
    
    
}
