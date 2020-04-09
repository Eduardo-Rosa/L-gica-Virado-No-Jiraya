package livroWebDesenvolvimento;

import java.io.*;

public class ExercicioLivro12 {
    public static int CalculaFatorial (int intNumero){
        int intResultado;

        if (intNumero == 1)
            return(1);
        intResultado = CalculaFatorial(intNumero-1)*intNumero;
        return (intResultado);
    }
    public static void main(String[] args) {
        int intNumero, intContador,intFatorial;
        byte btValor[] = new byte[10];

        System.out.println("Fatorial");
        System.out.println(" ");
        System.out.println("Entre com o número desejado: ");

        try{
            System.in.read(btValor);
            String strBuffer = new String(btValor);
            String strValor = new String(strBuffer.trim());

            intNumero = Integer.parseInt(strValor);
            intFatorial = CalculaFatorial(intNumero);
            System.out.println("O fatorial de "+intNumero+ " é "+intFatorial);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
