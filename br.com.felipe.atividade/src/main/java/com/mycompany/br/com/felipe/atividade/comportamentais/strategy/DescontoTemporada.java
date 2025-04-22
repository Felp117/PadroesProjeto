package com.mycompany.br.com.felipe.atividade.comportamentais.strategy;

public class DescontoTemporada implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10; // 10% de desconto fixo para promoções sazonais
    }
}
