package br.com.felipe.antiPadroes.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class TvComControleAvancado {
    
    public void ligar() {
        System.out.println("Ligando TV");
    }
    
    public void desligar() {
        System.out.println("Desligando TV");
    }
    
    public void aumentarVolume() {
        System.out.println("Aumentando volume da TV");
    }
    
    public void mudarCanal(int canal) {
        System.out.println("TV mudou para o canal " + canal);
    }
}
