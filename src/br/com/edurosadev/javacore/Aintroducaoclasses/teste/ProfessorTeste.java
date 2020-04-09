package br.com.edurosadev.javacore.Aintroducaoclasses.teste;

import br.com.edurosadev.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Marcos";
        professor.matricula = "A1213";
        professor.rg = "12.234.345";
        professor.cpf = "123.123.345-06";

        Professor professor2 = new Professor();
        professor2.nome = "Jonnas";
        professor2.matricula = "A1313";
        professor2.rg = "12.234.435";
        professor2.cpf = "143.143.545-09";


        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        System.out.println("---------------------------");

        System.out.println(professor2.nome);
        System.out.println(professor2.matricula);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);
    }
}
