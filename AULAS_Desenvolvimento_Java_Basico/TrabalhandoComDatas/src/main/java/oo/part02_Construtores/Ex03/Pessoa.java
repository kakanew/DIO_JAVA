package oo.part02_Construtores.Ex03;

public class Pessoa {

    public Pessoa(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}