package br.com.felipe.factoryMethod.logistica;

import br.com.felipe.factoryMethod.transporte.Transporte;

/**
 *
 * @author felipe.8129
 */
public abstract class Logistica {
    
    public abstract Transporte criarTransporte();
    
    public void organizarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
