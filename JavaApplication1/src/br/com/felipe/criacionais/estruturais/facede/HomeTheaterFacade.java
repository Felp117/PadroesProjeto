package br.com.felipe.criacionais.estruturais.facede;
/**
 *
 * @author felipe.8129
 */
public class HomeTheaterFacade {
    
    private Amplificador amplificador;
    private Projetor projetor;
    private Player player;

    public HomeTheaterFacade(Amplificador amplificador, Projetor projetor, Player player) {
        this.amplificador = amplificador;
        this.projetor = projetor;
        this.player = player;
    }
    
    public void assistirFilme(String filme) {
        System.out.println("Preparando o sistema home Theater");
        amplificador.ligar();
        amplificador.AjustarVolume(10);
        projetor.ligar();
        projetor.AjustarFonte("HDMI");
        player.ligar();
        player.reprozudizirFilme(filme);
    }
}
