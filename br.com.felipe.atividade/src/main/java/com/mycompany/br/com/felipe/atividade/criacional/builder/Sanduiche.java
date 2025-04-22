package com.mycompany.br.com.felipe.atividade.criacional.builder;

public class Sanduiche {

    private String pao;
    private String carne;
    private String queijo;
    private boolean alface;
    private boolean tomate;
    private String molho;

    // Construtor privado para forçar o uso do Builder
    private Sanduiche(Builder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.alface = builder.alface;
        this.tomate = builder.tomate;
        this.molho = builder.molho;
    }

    @Override
    public String toString() {
        return "Sanduíche {"
                + "pão='" + pao + '\''
                + ", carne='" + carne + '\''
                + ", queijo='" + queijo + '\''
                + ", alface=" + alface
                + ", tomate=" + tomate
                + ", molho='" + molho + '\''
                + '}';
    }

    // 👷 Classe Builder interna
    public static class Builder {

        private String pao;
        private String carne;
        private String queijo;
        private boolean alface;
        private boolean tomate;
        private String molho;

        public Builder comPao(String pao) {
            this.pao = pao;
            return this;
        }

        public Builder comCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public Builder comQueijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public Builder comAlface(boolean alface) {
            this.alface = alface;
            return this;
        }

        public Builder comTomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public Builder comMolho(String molho) {
            this.molho = molho;
            return this;
        }

        public Sanduiche build() {
            return new Sanduiche(this);
        }
    }
}
