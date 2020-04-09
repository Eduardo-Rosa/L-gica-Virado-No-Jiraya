package br.com.edurosadev.introducao.edurosa.dev.maratonajava.arrays;

public class Aula21ArraysMulti01 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 45;
        dias[1][0] = 40;
        dias[1][1] = 35;

        for (int i = 0; i <dias.length ; i++) {
            System.out.println(dias[i]);
            for (int j = 0; j <dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("__________________");
        for (int[] ref : dias) {
            for (int dia:  ref) {
                System.out.println(dia);
            }
        }
    }
}
