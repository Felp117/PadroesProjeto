package br.com.felipe.factoryMethod.logistica;

import br.com.felipe.factoryMethod.transporte.Transporte;
import br.com.felipe.factoryMethod.transporte.TransporteTerrestre;

/**
 *
 * @author felipe.8129
 */
public class LogisticaTerrestre extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
    
}
