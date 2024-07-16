package br.com.alura.exercicios.exerciciosspring.stream;

import java.util.Arrays;
import java.util.List;

public class ExemploStreamQuatro {

    public static void main(String[] args) {


//As operações finais são aquelas que encerram a stream e retornam um resultado concreto.
// Algumas operações finais comuns são o forEach, collect e count. Vamos ver alguns exemplos de operações finais:
//ForEach: permite executar uma ação em cada elemento da stream. Por exemplo,
// podemos imprimir cada elemento da lista.

        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana");

        nomes.stream()
                .forEach(nome -> System.out.println("Olá, " + nome + "!"));

// Output:
// Olá, João!
// Olá, Maria!
// Olá, Pedro!
// Olá, Ana!
    }
}
