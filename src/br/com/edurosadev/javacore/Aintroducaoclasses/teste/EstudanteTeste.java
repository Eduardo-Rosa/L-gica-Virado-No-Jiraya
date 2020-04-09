package br.com.edurosadev.javacore.Aintroducaoclasses.teste;

import br.com.edurosadev.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "1212";
        joao.idade = 15;

        Estudante kaio = new Estudante();
        kaio.nome = "Kaio";
        kaio.matricula = "1213";
        kaio.idade = 15;

        Estudante mario = new Estudante();
        mario.nome = "Mario";
        mario.matricula = "1213";
        mario.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);

        System.out.println(kaio.nome);
        System.out.println(kaio.matricula);
        System.out.println(kaio.idade);

        System.out.println(mario.nome);
        System.out.println(mario.matricula);
        System.out.println(mario.idade);
    }
}
