/*
 * crie um switch que dado um valor de 1 a 7
 * Considerando 1 = Domingo imprima se é dia útil ou final de semana
 * */

package br.com.edurosadev.introducao.edurosa.dev.maratonajava.controlefluxo;

public class Aula14ControleDeFluxo {
    public static void main(String[] args) {


    byte dia = 8;
    switch(dia){
        case 1:
        case 7:
            System.out.println("Final de semana");
            break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("Dia Útil");
            break;
            default:
                System.out.println("Opção Inválida");
    }
}
}