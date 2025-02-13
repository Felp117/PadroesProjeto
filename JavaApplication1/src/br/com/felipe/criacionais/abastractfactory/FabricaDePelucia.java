package br.com.felipe.criacionais.abastractfactory;
public class FabricaDePelucia  implements FabricaDeBrinquedos{

    @Override
    public InterfaceUrsinho criarUrsinho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InterfaceCoelho criarCoelho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
