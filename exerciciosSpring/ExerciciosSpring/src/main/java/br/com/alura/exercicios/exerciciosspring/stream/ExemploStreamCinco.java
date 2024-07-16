package br.com.alura.exercicios.exerciciosspring.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemploStreamCinco {

    public static void main(String[] args) {

//        Collect: permite coletar os elementos da stream em uma coleção ou em outro tipo de dado.
//        Por exemplo, podemos coletar os números pares em um conjunto.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]
    }
}
