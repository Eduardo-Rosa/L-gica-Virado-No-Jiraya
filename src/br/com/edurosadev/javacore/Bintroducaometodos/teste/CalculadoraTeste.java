package br.com.edurosadev.javacore.Bintroducaometodos.teste;

import br.com.edurosadev.javacore.Bintroducaometodos.classe.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
       /* calc.somaDoisNumeros();
        System.out.println("Continuando a execução");

        calc.subtraiDoisNumeros();
        System.out.println("Acabou de subtrair");

        calc.multiplicaDoisNumeros(5, 6);
        System.out.println("realizou a multiplicação");
        System.out.println("------------------------");
        System.out.println(calc.divideDoisNumeros(20, 0));

        double result = calc.divideDoisNumeros(30, 4);
        System.out.println(result);

        calc.imprimeDoisNumerosDivididos(50,0);
        System.out.println("Realizado a divisão");
        */


        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
