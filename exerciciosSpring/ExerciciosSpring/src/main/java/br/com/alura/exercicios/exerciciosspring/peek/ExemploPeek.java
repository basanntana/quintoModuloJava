package br.com.alura.exercicios.exerciciosspring.peek;

import java.util.Arrays;
import java.util.List;

public class ExemploPeek {

    public static void main(String[] args) {


//        Imagine que temos uma lista com números e queremos multiplicar cada
//        um deles por 2 e depois somar os resultados.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numeros.stream()
                .peek(n -> System.out.println("Elemento: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Conteúdo depois do map: " + n))
                .reduce(0, (total, numero) -> total + numero);

        System.out.println("A soma dos números é: " + soma);
    }
}
