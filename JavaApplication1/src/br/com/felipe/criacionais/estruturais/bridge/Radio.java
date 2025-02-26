package br.com.felipe.criacionais.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class Radio implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando Radio");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando radio");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume do radio");
    }
    
}
