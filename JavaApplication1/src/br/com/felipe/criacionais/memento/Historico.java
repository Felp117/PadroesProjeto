package br.com.felipe.criacionais.memento;

import java.util.Stack;

/**
 *
 * @author felipe.8129
 */
public class Historico {
    
    private Stack<TextoMemento> historico = new Stack<>();
    
    public void salvarMemento(TextoMemento memento) {
        historico.push(memento);
    }
    
    public TextoMemento desfazer() {
        if(!historico.isEmpty()){
            return historico.pop();
        }
        return null;
    }
}
