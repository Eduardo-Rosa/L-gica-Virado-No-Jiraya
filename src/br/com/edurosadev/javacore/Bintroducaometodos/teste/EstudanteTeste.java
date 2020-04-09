package br.com.edurosadev.javacore.Bintroducaometodos.teste;

import br.com.edurosadev.javacore.Bintroducaometodos.classe.Estudante;

public class EstudanteTeste {

    /*
     $$MINHA RESOLUÇÃO DO EXERCÍCIO$$

    public static void main(String[] args) {
        Estudante est = new Estudante();

        est.nome ="João";
        est.idade = 14;
        est.nota1 = 7;
        est.nota2 = 4;
        est.nota3 = 8;
        est.notas = ((est.nota1+est.nota2+est.nota3)/3);
        est.imprime();
    }*/

    public static void main(String[] args) {


        Estudante estudante = new Estudante();
        estudante.nome = "Eduardo";
        estudante.idade = 17;
//        estudante.notas = new double[] {7,7,9 };

        estudante.print();
        estudante.tirarMedia();
    }
}
