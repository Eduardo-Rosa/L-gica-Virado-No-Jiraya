package br.com.edurosadev.javacore.Aintroducaoclasses.teste;

import br.com.edurosadev.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "xyz1234";
        carro.marca = "volkswagen";
        carro.velocidadeMaxima = 80;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
    }
}
