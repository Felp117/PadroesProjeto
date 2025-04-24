package br.com.felipe.criacionais.observer;
/**
 *
 * @author felipe.8129
 */
public class Cliente implements Observer {

   private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("Cliente " + nome + " foi notificado: Produto"
        + nomeProduto + " agora tem " + quantidade + " unidades em estoque");
    }
    
    
    
}
