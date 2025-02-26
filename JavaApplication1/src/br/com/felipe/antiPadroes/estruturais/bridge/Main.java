package br.com.felipe.antiPadroes.estruturais.bridge;
/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {

        TvComControleBasico tvBasica = new TvComControleBasico();
        tvBasica.ligar();
        
        RadioComControleAvancado radioAvancado = new RadioComControleAvancado();
        radioAvancado.sintonizarEstacao(154.21);
    }
}
