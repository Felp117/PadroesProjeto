package br.com.felipe.antiPadroes.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class RadioComControleAvancado {
    
    public void ligar() {
        System.out.println("Ligando rádio");
    }
    
    public void desligar() {
        System.out.println("Desligando rádio");
    }
    
    public void aumentarVolume() {
        System.out.println("Aumentando volume");
    }
    
    public void sintonizarEstacao(double estacao) {
        System.out.println("Rádio sintonizada na estação " + estacao + "Mhz");
    }
}
