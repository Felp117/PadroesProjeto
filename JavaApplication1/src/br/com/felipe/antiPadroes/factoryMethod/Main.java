package br.com.felipe.antiPadroes.factoryMethod;

import br.com.felipe.antiPadroes.factoryMethod.logistica.Logistica;
import br.com.felipe.antiPadroes.factoryMethod.logistica.LogisticaFerroviaria;
import br.com.felipe.antiPadroes.factoryMethod.logistica.LogisticaMaritima;
import br.com.felipe.antiPadroes.factoryMethod.logistica.LogisticaTerrestre;
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
