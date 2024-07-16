package br.com.alura.exercicios.exerciciosspring.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamDois {

    public static void main(String[] args) {


//   Filter: permite filtrar os elementos da stream com base em uma condição.
//   Por exemplo, podemos filtrar uma lista de números para retornar apenas os números pares.


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]
    }
}
