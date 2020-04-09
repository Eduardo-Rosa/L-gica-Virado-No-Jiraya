package exerciciosdainternet;


import java.util.Scanner;

public class meses {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número referente ao mes");
        int intMes = teclado.nextInt();

        String meses[] = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        System.out.println(meses[intMes-1]);
    }
}