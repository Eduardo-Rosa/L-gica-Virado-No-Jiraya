package br.com.edurosadev.javacore.Bintroducaometodos.teste;

import br.com.edurosadev.javacore.Bintroducaometodos.classe.Professores;

public class ProfessoresTeste {
    public static void main(String[] args) {
        Professores prof = new Professores();

        prof.nome = "Marcos";
        prof.matricula = "A1213";
        prof.rg = "12.234.345";
        prof.cpf = "123.123.345-06";

        Professores prof2 = new Professores();
        prof2.nome = "Jonnas";
        prof2.matricula = "A1313";
        prof2.rg = "12.234.435";
        prof2.cpf = "143.143.545-09";

        prof.imprime();
        prof2.imprime();
    }

}
