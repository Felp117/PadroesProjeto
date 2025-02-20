package br.com.felipe.criacionais.abastractfactory;

import br.com.felipe.criacionais.abastractfactory.fabrica.FabricaDePlastico;
import br.com.felipe.criacionais.abastractfactory.fabrica.FabricaDeBrinquedos;
import br.com.felipe.criacionais.abastractfactory.fabrica.FabricaDePelucia;
import br.com.felipe.criacionais.abastractfactory.ursinho.Ursinho;
import br.com.felipe.criacionais.abastractfactory.coelho.Coelho;
import br.com.felipe.criacionais.abastractfactory.tartaruga.Tartaruga;

/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {
        
        FabricaDeBrinquedos fabricaPelucia = new FabricaDePelucia();
        Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
        Ursinho ursinhoPelucia = fabricaPelucia.criarUrsinho();
        Tartaruga tartarugaPelucia = fabricaPelucia.criarTartaruga();
        coelhoPelucia.exibir();
        ursinhoPelucia.exibir();
        tartarugaPelucia.exibir();
        
        FabricaDeBrinquedos fabricaPlastico = new FabricaDePlastico();
        Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
        Ursinho ursinhoPlastico = fabricaPlastico.criarUrsinho();
        Tartaruga tartarugaPlastico = fabricaPlastico.criarTartaruga();
        coelhoPlastico.exibir();
        ursinhoPlastico.exibir();
        tartarugaPlastico.exibir();
        
        
        
    }
    
}
