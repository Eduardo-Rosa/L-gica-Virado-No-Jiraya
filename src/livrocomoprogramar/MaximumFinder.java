package livrocomoprogramar;

import java.util.Scanner;

public class MaximumFinder {
    // obtém tres valores de ponto flutuante e localiza o valor máximo
    public static void main(String[] args) {
        //cria scanner para entrada a partir da janela de comando
        Scanner teclado = new Scanner(System.in);

        //solicita e insere tres valores de ponto flutuante
        System.out.println("digite tres valores separados por um espaço");

        double dblNumero1 = teclado.nextDouble(); //lê o primeiro número
        double dblNumero2 = teclado.nextDouble(); //lê o segundo número
        double dblNumero3 = teclado.nextDouble(); //lê o terceiro número

        //determina o valor máximo
        double dblResultado = maximum(dblNumero1, dblNumero2, dblNumero3);

        //exibe o valor máximo
        System.out.println("Máximo é: " + dblResultado);
    }

    //retorna o máximo dos seus três parametros de double
    public static double maximum(double x, double y, double z) {
        double dblMaximumValue = x; //supõe que x é o maior valor inicial

        //determina que y é maior que dblMaximumValue
        if (y > dblMaximumValue)
            dblMaximumValue = y;

        //determina que z é maior que dblMaximumValue
        if (z > dblMaximumValue)
            dblMaximumValue = z;

        return dblMaximumValue;
    }
}//fim da classe MaximumFinder


