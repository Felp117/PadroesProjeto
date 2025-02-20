package br.com.felipe.antiPadroes.factoryMethod.transporte;
/**
 *
 * @author felipe.8129
 */
public class TransporteFerroviario implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte ferroviario");
    }
}
