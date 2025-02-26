package br.com.felipe.criacionais.estruturais.bridge;

/**
 *
 * @author felipe.8129
 */
public abstract class ControleRemoto {
    
    protected Dispositivo dispositivo;
    
    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    public void ligar() {
        dispositivo.ligar();
    }

    public void desligar() {
        dispositivo.desligar();
    }

    public void aumentarVolume() {
        dispositivo.aumentarVolume();
    }
}
