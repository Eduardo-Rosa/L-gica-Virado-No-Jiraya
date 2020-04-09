package livroWebDesenvolvimento;


import java.util.Scanner;

public class TesteIf {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 para loiro, 2 para ruivo, 3 para preto!");
        int cabelo = teclado.nextInt();
        if (cabelo == 1) {
            System.out.println("Vamos cortar o cabelo");
        } else if (cabelo == 2) {
            System.out.println("Vamos lavar antes de cortar");
        } else
            System.out.println("Vamos deixar como esta");
    }
}
