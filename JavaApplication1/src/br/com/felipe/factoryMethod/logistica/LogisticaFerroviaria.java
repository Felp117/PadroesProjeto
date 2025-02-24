package br.com.felipe.factoryMethod.logistica;

import br.com.felipe.factoryMethod.transporte.Transporte;
import br.com.felipe.factoryMethod.transporte.TransporteFerroviario;

/**
 *
 * @author felipe.8129
 */
public class LogisticaFerroviaria extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }
    
}
