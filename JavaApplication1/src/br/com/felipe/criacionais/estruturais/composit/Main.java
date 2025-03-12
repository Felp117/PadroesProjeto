package br.com.felipe.criacionais.estruturais.composit;
/**
 *
 * @author felipe.8129
 */
public class Main {
    public static void main(String[] args) {
        
        Produto cerveja = new Produto("Ceveja 350ml", 3.99);
        
        Embalagem caixaCerveja = new Embalagem("Caixa cerveja(12 unidade)");
        for (int i = 0; i < 12; i++) {
           caixaCerveja.adicionarItem(cerveja);
        }
        
        Embalagem fardoCerveja = new Embalagem("Fardo de cerveja(24 caixas)");
        for (int i = 0; i < 24; i++) {
           fardoCerveja.adicionarItem(caixaCerveja);
        }
        
        Embalagem caixaLeite = new Embalagem("Caixa de leite(12 unidades)");
        for (int i = 0; i < 12; i++) {
           caixaLeite.adicionarItem(caixaLeite);
        }
                
        Embalagem carrinho = new Embalagem("Carrinho de compra");
        carrinho.adicionarItem(cerveja);
        carrinho.adicionarItem(caixaCerveja);
        carrinho.adicionarItem(fardoCerveja);
        
        Embalagem carrinho2 = new Embalagem("Carrinho de compras de leite");
        carrinho2.adicionarItem(caixaLeite);
        carrinho2.adicionarItem(caixaLeite);
        carrinho2.adicionarItem(caixaLeite);
        carrinho2.adicionarItem(caixaLeite);
        
        
        carrinho.listarItens();
        carrinho2.listarItens();
        System.out.println("Total da compra: R$" + carrinho.getPreco());
        System.out.println("Total da compra: R$" + carrinho2.getPreco());
    }
}
