package livroWebDesenvolvimento;

import java.io.IOException;

public class ExercicioLivro10 {
    public static void main(String[] args) {
        int intDiagonalPrincipal, intDiagonalSecundaria, intLinha, intColuna;
        int intMatrizNumeros[][] = new int[5][5];
        byte btValor[] = new byte[10];

        for (intLinha = 0; intLinha < 5; intLinha++) {
            for (intColuna = 0; intColuna < 5 ; intColuna++)
            intMatrizNumeros[intLinha] [intColuna] = 0;

        }

        try{
            for (intLinha = 0; intLinha < 5 ; intLinha++) {
                for (intColuna = 0; intColuna < 5; intColuna++) {
                    System.out.println("Digite o valor da posição" +intLinha+" / "+intColuna+": ");
                    System.in.read(btValor);
                    String strBuffer = new String(btValor);
                    String strValor = new String(strBuffer.trim());

                    intMatrizNumeros[intLinha][intColuna] = Integer.parseInt(strValor);
                }
            }

            intDiagonalPrincipal = 0;

            for (intLinha = 0; intLinha< 5; intLinha++)
                intDiagonalPrincipal += intMatrizNumeros[intLinha][intLinha];

            intDiagonalSecundaria = 0;
            intColuna = 0;

            for (intLinha = 4; intLinha >=0; intLinha--) {
                intDiagonalSecundaria += intMatrizNumeros[intLinha][intColuna];
                intColuna++;
            }

            System.out.println(" ");
            System.out.println("Soma da diagonal principal = " +intDiagonalPrincipal);
            System.out.println("Soma da diagonal secundaria = " +intDiagonalSecundaria);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
