package br.com.felipe.criacionais.abastractfactory;


/**
 *
 * @author felipe.8129
 */
public class CoelhoDePelucia implements FabricaDeBrinquedos {
        public void exibir(){
            System.out.println("Coelho de pelucia");
        }

    @Override
    public InterfaceUrsinho criarUrsinho() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public InterfaceCoelho criarCoelho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
