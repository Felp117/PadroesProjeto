/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.felipe.antiPadroes.estruturais.facede;

/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        
        Amplificador amplificador = new Amplificador();
        amplificador.ligar();
        amplificador.AjustarVolume(15);
        
        Projetor projetor = new Projetor();
        projetor.ligar();
        projetor.AjustarFonte("HDMI");
        
        Player player = new Player();
        player.ligar();
        player.reprozudizirFilme("Interestelar");
        
    }
}
