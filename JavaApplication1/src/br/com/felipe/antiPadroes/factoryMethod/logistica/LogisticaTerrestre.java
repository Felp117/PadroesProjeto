package br.com.felipe.antiPadroes.factoryMethod.logistica;

import br.com.felipe.antiPadroes.factoryMethod.transporte.Transporte;
import br.com.felipe.antiPadroes.factoryMethod.transporte.TransporteTerrestre;

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
