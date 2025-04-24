package br.com.felipe.criacionais.memento;
/**
 *
 * @author felipe.8129
 */
public class TextoMemento {
    
    private final String estado;

    public TextoMemento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
