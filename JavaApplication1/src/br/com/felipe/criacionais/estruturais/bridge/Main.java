package br.com.felipe.criacionais.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        
        Dispositivo tv = new Televisao();
        Dispositivo radio = new Radio();
        Dispositivo projetor = new Projetor();
        
        //criar os controles remotos
        ControleRemoto controleBasicoTV = new ControleRemotoBasico(tv);
        ControleRemoto controleAvancadoRadio = new ControleRemotoAvancado(radio);
        
        controleBasicoTV.ligar();
        controleBasicoTV.aumentarVolume();
        
        controleAvancadoRadio.ligar();
        controleAvancadoRadio.aumentarVolume();
        ((ControleRemotoAvancado) controleAvancadoRadio).silenciar();
        
        
       projetor.ligar();
       projetor.aumentarVolume();
    }
}
