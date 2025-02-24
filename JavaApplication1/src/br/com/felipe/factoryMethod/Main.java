package br.com.felipe.factoryMethod;

import br.com.felipe.factoryMethod.logistica.Logistica;
import br.com.felipe.factoryMethod.logistica.LogisticaFerroviaria;
import br.com.felipe.factoryMethod.logistica.LogisticaMaritima;
import br.com.felipe.factoryMethod.logistica.LogisticaTerrestre;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        Logistica logisticaFerroviaria = new LogisticaFerroviaria();
        logisticaFerroviaria.organizarEntrega();

        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.organizarEntrega();

        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.organizarEntrega();
    }
}
