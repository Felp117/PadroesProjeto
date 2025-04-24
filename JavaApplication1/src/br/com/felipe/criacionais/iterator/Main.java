package br.com.felipe.criacionais.iterator;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        String[] nomes = {"Felipe", "Giovanni","Jonas", "Bruno"};
        ColecaoDeNome colecao = new ColecaoDeNome(nomes);
        
        Iterator<String> iterator = colecao.criarIterador();
        
        while(iterator.temProximo()){
            System.out.println(iterator.proximo());
        }
    }
}
