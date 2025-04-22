package com.mycompany.br.com.felipe.atividade.comportamentais.strategy;

public class DescontoQuantidade implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        if (valor > 300) {
            return valor * 0.15; // 15% de desconto
        }
        return 0;
    }
}
