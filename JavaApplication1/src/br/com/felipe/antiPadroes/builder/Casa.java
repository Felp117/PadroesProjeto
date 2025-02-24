package br.com.felipe.antiPadroes.builder;
/**
 *
 * @author felipe.8129
 */
public class Casa {
    
    private Integer parede;
    private String telhado;
    private Integer porta;
    private Integer janela;
    private String piscina;

    public Casa(Integer parede, String telhado, Integer portas, Integer janelas) {
        this.parede = parede;
        this.telhado = telhado;
        this.porta = porta;
        this.janela = janela;
    }
    
    public void mostrarDetalhes() {
        System.out.println("Casa com paredes: " + parede + 
                ", " + telhado + ", " + porta + " portas e " + janela + " janelas");
    }
}
