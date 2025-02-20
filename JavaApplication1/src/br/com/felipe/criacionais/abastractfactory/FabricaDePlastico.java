package br.com.felipe.criacionais.abastractfactory;

import br.com.felipe.criacionais.abastractfactory.coelho.folder.Coelho;
import br.com.felipe.criacionais.abastractfactory.coelho.folder.CoelhoDePlastico;
import br.com.felipe.criacionais.abastractfactory.tartaruga.Tartaruga;
import br.com.felipe.criacionais.abastractfactory.tartaruga.TartarugaDePlastico;
import br.com.felipe.criacionais.abastractfactory.ursinho.Ursinho;
import br.com.felipe.criacionais.abastractfactory.ursinho.UrsinhoDePlastico;

/**
 *
 * @author felipe.8129
 */
public class FabricaDePlastico implements FabricaDeBrinquedos {

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePlastico();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePlastico();
    }

    @Override
    public Tartaruga criarTartaruga() {
        return new TartarugaDePlastico();
    }
    
}
