package br.com.felipe.criacionais.prototype;
/**
 *
 * @author felipe.8129
 */
public class Main {

    public static void main(String[] args) {
        Documento original = new Documento("Relatorio", "Relatorio da faculdade");
        System.out.println("Documento original: " + original.toString());

        Documento clone = original.clone();
        System.out.println("Documento clone: " + clone);

        clone.setTitulo("Relatorio do Felipe");
        clone.setConteudo("Fechamento de tudo");

        System.out.println("Modificado" + clone);
    }
}
