package br.com.alura.exercicios.exerciciosspring.construtores;

public class Carro {

     private String marca;
    private String modelo;
    private int ano;


    // Construtor personalizado
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
