package br.com.alura.exercicios.exerciciosspring.generics;

public class Caixa <T> {


    //    Para criar um método ou classe genérico, você precisa usar parâmetros de tipo (tipos genéricos)
//    que são representados entre colchetes angulares < >. Geralmente, usamos letras maiúsculas únicas para
//    representar os tipos genéricos, mas você pode usar qualquer identificador válido em Java.
//    Aqui está um exemplo de uma classe genérica chamada Caixa, que armazena um valor de um tipo desconhecido:
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


    public <T> T somaConteudoNaCaixa(T valor) {
        if (this.conteudo instanceof Integer c && valor instanceof Integer i) {
            Integer resultado = c + i;
            return (T) resultado;
        } else if (this.conteudo instanceof Double c && valor instanceof Double d) {
            Double resultado = c + d;
            return (T) resultado;
        } else if (this.conteudo instanceof String c && valor instanceof String s) {
            String resultado = c + "\n" + s;
            return (T) resultado;
        }

        return null;
    }






}
