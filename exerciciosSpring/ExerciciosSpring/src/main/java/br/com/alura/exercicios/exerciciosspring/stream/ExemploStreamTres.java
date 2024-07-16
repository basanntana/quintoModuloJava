package br.com.alura.exercicios.exerciciosspring.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamTres {


    public static void main(String[] args) {

        //    Map: permite transformar cada elemento da stream em outro tipo de dado.
//    Por exemplo, podemos transformar uma lista de strings em uma lista de seus respectivos tamanhos.

        List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediárias");

        List<Integer> tamanhos = palavras.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(tamanhos); // Output: [4, 6, 11, 17]

    }

}
