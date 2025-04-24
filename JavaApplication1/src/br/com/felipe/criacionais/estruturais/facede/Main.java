package br.com.felipe.criacionais.estruturais.facede;

import br.com.felipe.antiPadroes.estruturais.facede.Amplificador;
import br.com.felipe.antiPadroes.estruturais.facede.Player;
import br.com.felipe.criacionais.estruturais.bridge.Projetor;

/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        
        Amplificador amplificador = new Amplificador();
        Projetor projetor = new Projetor();
        Player player = new Player();
        
        //HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, projetor, player);
        //homeTheater.assistirFilme("Interestelar");
    }
}
