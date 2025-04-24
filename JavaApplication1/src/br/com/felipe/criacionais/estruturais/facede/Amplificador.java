package br.com.felipe.criacionais.estruturais.facede;

import br.com.felipe.antiPadroes.estruturais.facede.*;

/**
 *
 * @author felipe.8129
 */
public class Amplificador {
    
    void ligar() {
        System.out.println("Amplificador ligado");
    }
    
    void AjustarVolume(int nivel) {
        System.out.println("Volume: " + nivel);
    }
}
