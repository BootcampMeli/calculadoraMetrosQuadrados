package com.grupo3.calculadoram2.domain;

public class Comodo {

    private String nome;
    private Double largura;
    private Double comprimento;

    public Comodo(String nome, Double largura, Double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getSubtotal(){
        return getLargura() * getComprimento();
    }
}
