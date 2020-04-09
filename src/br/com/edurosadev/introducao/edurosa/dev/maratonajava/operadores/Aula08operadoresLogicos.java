package br.com.edurosadev.introducao.edurosa.dev.maratonajava.operadores;

public class Aula08operadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000f;

        System.out.println( idade <= 18 && salario >= 3000);
        System.out.println( idade <= 18 || salario >= 3000);
    }
}
