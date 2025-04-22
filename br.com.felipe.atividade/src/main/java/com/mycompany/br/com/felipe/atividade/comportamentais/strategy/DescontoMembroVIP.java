package com.mycompany.br.com.felipe.atividade.comportamentais.strategy;

public class DescontoMembroVIP implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20; // 20% de desconto para membros VIP
    }
}
