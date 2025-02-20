package br.com.felipe.criacionais.abastractfactory;

import br.com.felipe.criacionais.abastractfactory.coelho.folder.Coelho;
import br.com.felipe.criacionais.abastractfactory.tartaruga.Tartaruga;
import br.com.felipe.criacionais.abastractfactory.ursinho.Ursinho;

public interface FabricaDeBrinquedos {
    
    Ursinho criarUrsinho();
    Coelho criarCoelho();
    Tartaruga criarTartaruga();
}
