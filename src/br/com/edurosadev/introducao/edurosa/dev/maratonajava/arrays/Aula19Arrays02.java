package br.com.edurosadev.introducao.edurosa.dev.maratonajava.arrays;

public class Aula19Arrays02 {
    public static void main(String[] args) {

        //byte, short, int, long, float, double = 0
        //char ''\u00000', ' '
        //boolean false
        //reference null

        String[] nome= new String[4];
        nome[0] = "Eduardo";
        nome[1] = "Suellen";
        nome[2] = "Felipe";
        nome[3] = "Joyce";

        for(int i=0; i<nome.length;i++){
            System.out.println(nome[i]);
        }
    }
}
