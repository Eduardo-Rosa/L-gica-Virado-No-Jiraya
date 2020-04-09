package livroWebDesenvolvimento;

import java.util.Scanner;

public class ExercicioLivro01 {
    public static void main(String[] args) {
        Scanner scnEntrada = new Scanner(System.in);

        System.out.println("Olá Amigo!");
        System.out.println("Quantos anos você tem?");
        int intIdade = scnEntrada.nextInt();
        int intDias = intIdade * 365;
        System.out.println("Você já viveu aproximadamente " +intDias+ " dias...");
    }
}
