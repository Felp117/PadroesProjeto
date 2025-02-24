package br.com.felipe.criacionais.singleton;

import javax.swing.plaf.SliderUI;

/**
 *
 * @author felipe.8129
 */
public class Singleton {

    private static Singleton instancia;
    
    private Singleton() {
        
    }
    
    public static Singleton getInstancia() {
        if(instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    
    public void mostrarMensagem() {
        System.out.println("Mensagem da instancia Singleton");
    }
}
