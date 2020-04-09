package br.com.edurosadev.javacore.Jmodificadorfinal.teste;

import br.com.edurosadev.javacore.Jmodificadorfinal.classe.Carro;
import br.com.edurosadev.javacore.Jmodificadorfinal.classe.Comprador;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Voyage");
        System.out.println(c.getComprador());
    }
}
