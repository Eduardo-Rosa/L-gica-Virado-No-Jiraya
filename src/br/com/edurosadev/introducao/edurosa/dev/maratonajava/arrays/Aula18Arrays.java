package br.com.edurosadev.introducao.edurosa.dev.maratonajava.arrays;

public class Aula18Arrays {
    public static void main(String[] args) {
        int[] idade = new int[3];
        // *** ESTE NAO EH MUITO RECOMEMDADO
        // int idade[]

        idade[0] = 20;
        idade[1] = 15;
        idade[2] = 30;
        System.out.println("Idade 1 : " +idade[0]  );
        System.out.println("Idade 2 : " +idade[1]  );
        System.out.println("Idade 3 : " +idade[2]  );
    }
}
