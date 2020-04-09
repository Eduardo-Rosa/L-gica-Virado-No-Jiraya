//Operador ternário

package br.com.edurosadev.introducao.edurosa.dev.maratonajava.controlefluxo;

public class Aula11ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        status = idade < 18 ? "Não Adulto" : "Adulto";
        System.out.println(status);
    }
}
