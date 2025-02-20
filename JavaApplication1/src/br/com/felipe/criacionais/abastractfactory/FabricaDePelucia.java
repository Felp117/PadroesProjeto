package br.com.felipe.criacionais.abastractfactory;

import br.com.felipe.criacionais.abastractfactory.coelho.folder.Coelho;
import br.com.felipe.criacionais.abastractfactory.coelho.folder.CoelhoDePelucia;
import br.com.felipe.criacionais.abastractfactory.tartaruga.Tartaruga;
import br.com.felipe.criacionais.abastractfactory.tartaruga.TartarugaDePelucia;
import br.com.felipe.criacionais.abastractfactory.ursinho.Ursinho;
import br.com.felipe.criacionais.abastractfactory.ursinho.UrsinhoDePelucia;

public class FabricaDePelucia implements FabricaDeBrinquedos{

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePelucia();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePelucia();
    }

    @Override
    public Tartaruga criarTartaruga() {
       return new TartarugaDePelucia();
    }
    

}
