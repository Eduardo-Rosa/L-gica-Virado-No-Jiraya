/*
*Criar um programa que coloque os
 *alunos classificados por faixa etária, e em suas devidas categorias
 * sendo:
 * Até 10 anos mirim
 * de 11 a 13 infantil
 * 14 a 16 juvenil
 * 17 a 19 junior
 * >20 adulto
 */

package br.com.edurosadev.introducao.edurosa.dev.maratonajava.controlefluxo;

public class Aula10ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 22;

        if (idade <= 10){
            System.out.println("Categoria mirim");
        }else if ( idade >= 11 && idade <= 13){
            System.out.println("Categoria infantil");
        }else if ( idade >= 14 && idade <= 16){
            System.out.println("Categoria juvenil");
        } else if (idade >= 17 && idade <= 19){
            System.out.println("Categoria Junior");
        }else{
            System.out.println("Categoria Adulto");
        }
        System.out.println("-------------------------------");
        System.out.println("Programa finalizado");
    }
}
