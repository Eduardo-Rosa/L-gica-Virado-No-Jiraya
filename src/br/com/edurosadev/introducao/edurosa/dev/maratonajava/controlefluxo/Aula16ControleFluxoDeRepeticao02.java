package br.com.edurosadev.introducao.edurosa.dev.maratonajava.controlefluxo;

public class Aula16ControleFluxoDeRepeticao02 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                continue;
            }
            System.out.println("Parcela " +parcela+ " R$ " +valorParcela);
            System.out.println("consumindo memória");
        }
    }
}
