package br.com.felipe.criacionais.memento;
/**
 *
 * @author felipe.8129
 */
public class EditorTexto {
    
    private StringBuilder texto;

    public EditorTexto() {
       texto = new StringBuilder();
    }
    
    //adicionar texto
    public void escrever(String novoTexto){
        texto.append(novoTexto);
    }
    
    //mostrar conteudo
    public String mostrarTexto() {
        return texto.toString();
    }
    
    public TextoMemento salvar(){
        return new TextoMemento(texto.toString());
    }
    
    // Ctrl + z
    public void desfazer(TextoMemento memento) {
        texto = new StringBuilder(memento.getEstado());
    }
}
    
