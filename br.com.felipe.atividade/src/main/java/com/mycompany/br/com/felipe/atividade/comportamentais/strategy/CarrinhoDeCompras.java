package com.mycompany.br.com.felipe.atividade.comportamentais.strategy;

public class CarrinhoDeCompras {

    private double valorTotal;
    private EstrategiaDesconto estrategia;

    public CarrinhoDeCompras(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setEstrategiaDesconto(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public void calcularPrecoFinal() {
        if (estrategia == null) {
            System.out.println("⚠ Nenhuma estratégia de desconto definida.");
            return;
        }

        double desconto = estrategia.calcularDesconto(valorTotal);
        double valorFinal = valorTotal - desconto;

        System.out.println("Valor original: R$" + valorTotal);
        System.out.println("Desconto aplicado: R$" + desconto);
        System.out.println("Valor final: R$" + valorFinal);
    }
}
