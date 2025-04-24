package br.com.felipe.criacionais.iterator;

/**
 *
 * @author felipe.8129
 */
public interface ColecaoAgregada<T> {
    
    Iterator<T> criarIterador();
    
}
