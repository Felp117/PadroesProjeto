package br.com.felipe.antiPadroes.Singleton;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        Configuracao config = new Configuracao();
        Configuracao config2 = new Configuracao();
        
        config.configuracaoSistema = "Modo Claro";
        
        System.out.println(config.configuracaoSistema);
        System.out.println(config2.configuracaoSistema);
    }
}
