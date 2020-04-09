package livroWebDesenvolvimento;

import java.util.Scanner;

public class ExercicioLivro02 {
    public static void main(String[] args) {
        Scanner scnEntrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int intIdade = scnEntrada.nextInt();

        if (intIdade < 18)
            System.out.println("você é menor de idade e ... não pode dirigir");
        else {
            System.out.println("Voê já pode dirigir se tiver habilitação");
        }
        System.out.println("processo finalizado");
    }
}
