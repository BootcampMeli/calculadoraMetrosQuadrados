package com.grupo3.calculadoram2.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Casa {

    private String nome;
    private String endereco;
    private List<Comodo> comodos = new ArrayList<>();

    public Casa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodo> comodos) {
        this.comodos = comodos;
    }

    public Double getTotalArea(){
        return comodos
                .stream()
                .mapToDouble(comodo -> comodo.getArea())
                .sum();
    }

    public Double getValorTotal(Double valor){
        return getTotalArea() * valor;
    }

    public Comodo getMaiorComodo(){
        return comodos
                .stream()
                .max(Comparator.comparing(Comodo::getArea))
                .get();
    }
}
