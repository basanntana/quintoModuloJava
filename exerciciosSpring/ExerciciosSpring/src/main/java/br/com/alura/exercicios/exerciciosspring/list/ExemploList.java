package br.com.alura.exercicios.exerciciosspring.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        // Criando um objeto do tipo List para armazenar números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao List
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando elementos do List
        System.out.println("Primeiro elemento: " + numeros.get(0)); // Saída: 10
        System.out.println("Segundo elemento: " + numeros.get(1)); // Saída: 20
        System.out.println("Terceiro elemento: " + numeros.get(2)); // Saída: 30

        // Percorrendo os elementos do List
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Removendo um elemento do List
        numeros.remove(1); // Remove o elemento de índice 1 (20)

        // Verificando o tamanho do List
        System.out.println("Tamanho do List: " + numeros.size()); // Saída: 2
    }
}
