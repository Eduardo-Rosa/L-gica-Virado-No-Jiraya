/*
* Criar uma variavel salario e imprima seu imposto
* imposto:
* salario < 1000 5%
* salario >= 1000 && salario < 2000 10%
* salario >= 2000 && salario <4000 15%
* salario > 5000 20%
* */
package br.com.edurosadev.introducao.edurosa.dev.maratonajava.controlefluxo;

import java.util.Scanner;

public class Aula11ExercicioControleDeFluxo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Valor do Salário: ");
        double salario = teclado.nextDouble();
        if (salario < 1000){
            System.out.println("O valor do imposto colculado é " +(salario *0.05));
        }else if ( salario >= 1001 && salario < 2000){
            System.out.println("O valor do imposto calculado é " +(salario * 0.1));
        }else if ( salario >= 2001 && salario < 4000){
            System.out.println("O valor do imposto calculado é " +(salario * 0.15));
        }else{
            System.out.println("O valor do imposto calculdo é " + (salario * 0.20));
        }
    }
}
