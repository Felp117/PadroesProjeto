package br.com.felipe.factoryMethod.transporte;
/**
 *
 * @author felipe.8129
 */
public class TransporteMaritimo implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte maritimo");
    }
}
