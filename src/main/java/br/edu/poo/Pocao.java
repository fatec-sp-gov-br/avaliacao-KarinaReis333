package br.edu.poo;

public class Pocao {
    // Atributos
    private final String nome;
    private final int cura;

    // Construtor
    public Pocao(String nome, int cura) {
        this.nome = nome;
        this.cura = cura;
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public int getCura() {
        return this.cura;
    }
}
