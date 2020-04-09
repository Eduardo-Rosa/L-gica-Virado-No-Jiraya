package br.com.edurosadev.javacore.Isobreecrita.teste;

import br.com.edurosadev.javacore.Isobreecrita.classe.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joana Joaquina");
        p.setIdade(24);
        System.out.println(p);

        Pessoa p2 = new Pessoa();
        p2.setNome("João Comilão");
        p2.setIdade(25);
        System.out.println(p2);
    }
}
