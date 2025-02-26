package br.com.felipe.criacionais.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class Televisao implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando Tv");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume da tv");
    }
    
}
