package livroWebDesenvolvimento;

import java.io.*;

public class ExercicioLivro09 {
    public static void main(String [] args) {
        int intDia;
        float fltValor, fltMedia;
        float fltTemperatura[] = new float[7];
        byte btValor[] = new byte[10];

        System.out.println("Media Temperatura");
        System.out.println(" ");
        for (intDia = 0; intDia < 7; intDia++) {
            fltTemperatura[intDia] = 0;
            try {
                for (intDia = 0; intDia < 7; intDia++) {
                    System.out.println("Digite  a " + (intDia + 1) + "ª temperatura: ");
                    System.in.read(btValor);
                    String strBuffer = new String(btValor);
                    String strValor = new String(strBuffer.trim());

                    fltTemperatura[intDia] = Float.parseFloat(strValor);
                }

                fltMedia = (fltTemperatura[0] +fltTemperatura[1] +fltTemperatura[2] +fltTemperatura[3] +fltTemperatura[4])/5;
                System.out.println(" ");
                System.out.println("A média das temperaturas é: " + fltMedia);
            }
            catch (IOException ioException){
                ioException.printStackTrace();
        }
        }
    }
}