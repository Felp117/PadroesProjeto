package br.com.felipe.antiPadroes.factoryMethod.JeitoErrado;

import br.com.felipe.antiPadroes.factoryMethod.JeitoErrado.Logistica;

/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        
        Logistica logistica = new Logistica();
        
        logistica.planejarEntrega("caminhao");
        logistica.planejarEntrega("trem");
    }
}