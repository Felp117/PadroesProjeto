package br.com.felipe.criacionais.memento;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();
        
        //escrever no editor
        editor.escrever("Ola");
        historico.salvarMemento(editor.salvar());
        
        editor.escrever(" mundo");
        historico.salvarMemento(editor.salvar());
        
        editor.escrever(" Este e o editor");
        System.out.println("Texto atual: " + editor.mostrarTexto());
        
        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer: " + editor.mostrarTexto());
        
        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer novamente: " + editor.mostrarTexto());
    }
    
}
