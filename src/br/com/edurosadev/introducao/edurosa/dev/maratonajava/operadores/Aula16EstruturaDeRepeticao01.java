package br.com.edurosadev.introducao.edurosa.dev.maratonajava.operadores;

public class Aula16EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        /*
        * dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        * porém as parcelas não podem ser menor que 1000
        * */
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
        if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
