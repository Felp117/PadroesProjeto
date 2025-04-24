package com.mycompany.br.com.atividadeprojeto.facede;

public class Pedido {

    private String status;

    public Pedido() {
        this.status = "Em espera";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
