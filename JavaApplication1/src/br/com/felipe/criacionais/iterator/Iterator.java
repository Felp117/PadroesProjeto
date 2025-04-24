package br.com.felipe.criacionais.iterator;

/**
 *
 * @author felipe.8129
 */
public interface Iterator<T> {
    
    boolean temProximo();
    T proximo();
    
}
