package br.com.alura.exercicios.exerciciosspring.formatdate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {

        String pattern = "E, dd MMM yyyy HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

//      O LocalDate representa uma data. Uma data sem fuso horário no sistema de calendário ISO-8601,
//      tem como formato padrão yyyy-MM-dd. Essa classe não armazena ou representa uma hora ou fuso horário.
//      Em vez disso, é uma descrição da data, normalmente usada para aniversários.

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

//        Agora, vamos criar uma nova data para representar a data de um aniversário.
//        Para isso, importaremos o pacote java.time.month;


        LocalDate aniversarioBarbara = LocalDate.of(2000, Month.MAY, 02);
        System.out.println(aniversarioBarbara);


//        Também podemos brincar com esse código e calcular a idade atual da aniversariante.
//        Uma forma de fazer isso na mão seria subtraindo o método getYear das datas, dessa forma:

        int idade =  hoje.getYear() - aniversarioBarbara.getYear();
        System.out.println(idade);

    }
}
