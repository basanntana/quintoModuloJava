package br.com.alura.exercicios.exerciciosspring.stream;

import java.util.Arrays;
import java.util.List;

public class ExemploStream {

    public static void main(String[] args) {

//Operações encadeadas com streams.
        //Nomes como fluxos de dados.
        List<String> nomes = Arrays.asList("Barbara", "Vanusa","Beatriz", "Ervecio", "Heitor");

        nomes.stream()
                .sorted() //ordenação alfabetica
                .limit(4)
                .filter(n -> n.startsWith("E"))//Filtro que o que começa com a letra selecionada.
                .map(n -> n.toUpperCase())//para letra ficar maiúscula
                .forEach(System.out::println);

    }
}
