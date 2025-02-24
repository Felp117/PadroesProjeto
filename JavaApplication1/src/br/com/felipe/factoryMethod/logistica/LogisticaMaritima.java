package br.com.felipe.factoryMethod.logistica;

import br.com.felipe.factoryMethod.transporte.Transporte;
import br.com.felipe.factoryMethod.transporte.TransporteMaritimo;

/**
 *
 * @author felipe.8129
 */
public class LogisticaMaritima extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
    
}
