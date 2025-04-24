package br.com.felipe.criacionais.iterator;

/**
 *
 * @author felipe.8129
 */
public class ColecaoDeNome implements ColecaoAgregada<String>{

    public ColecaoDeNome(String[] nomes1) {
    }
    
    private String[] nomes;

    @Override
    public Iterator<String> criarIterador() {
        return new IteradorDeNomes();
    }
    
    private class IteradorDeNomes implements Iterator<String> {
        private int indice =0;

        @Override
        public boolean temProximo() {
           return indice < nomes.length;
        }

        @Override
        public String proximo() {
            if(temProximo()) {
                return nomes[indice++];
            }
            return null;
        }
        
        
    }
}
