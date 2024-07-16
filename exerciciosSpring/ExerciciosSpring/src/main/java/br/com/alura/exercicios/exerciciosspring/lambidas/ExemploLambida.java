package br.com.alura.exercicios.exerciciosspring.lambidas;

import java.util.Arrays;
import java.util.List;

public class ExemploLambida {

    public static void main(String[] args) {

//        Vamos a um exemplo concreto para entender melhor.
//        Suponhamos que temos uma lista de números e queremos printar apenas os números pares dessa lista.
//        Sem o uso de funções lambda, poderíamos fazer algo assim:

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for(Integer i: lista) {
            if(i % 2 == 0) {
                System.out.println(i);
            }

        }

        List<Integer> listaExemplo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        listaExemplo.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

}

}
