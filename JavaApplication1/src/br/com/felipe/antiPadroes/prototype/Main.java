package br.com.felipe.antiPadroes.prototype;
/**
 *
 * @author felipe.8129
 */
public class Main {
    
    public static void main(String[] args) {
        Documento doc1 = new Documento("Relatorio", "Um relatorio da faculdade");
        Documento doc2 = doc1.clonar();

        doc2.titulo = "Novo Relatorio";
        doc2.conteudo = "Relatio atualizado";

        doc2.exibir();
        doc1.exibir();
    }
}
