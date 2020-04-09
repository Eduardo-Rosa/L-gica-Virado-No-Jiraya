package br.com.edurosadev.javacore.Bintroducaometodos.classe;

/*
 * Criar uma classe estudantecom os seguinte atributos
 * nome
 * idade
 * nota(3 notas).
 * Criar um método para imprimir os dados e tirar a média desse aluno,
 * caso a média seja maior que 6imprimir aprovado, se não reprovado.
 * */
public class Estudante {
    /*
     $$MINHA RESOLUÇÃO DO EXERCÍCIO$$

        public String nome;
        public int idade;
        public double nota1;
        public double nota2;
        public double nota3;
        public double notas;

        public void imprime(){
            System.out.println("------------");
            System.out.println("nome: " +this.nome);
            System.out.println("idade: " +this.idade);
            System.out.println("média: "+ this.notas);
            System.out.println("--------------------");

            if (notas > 6) {
                System.out.println("APROVADO");
                return;
            }
            System.out.println("REPROVADO");
        }*/

    //EXERCÍCIO CORRIGIDO

    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        System.out.print("Notas: ");
        if (notas != null) {
            for (double nota : notas) {
                System.out.print(nota + "  ");
            }
            System.out.println(" ");
        }
    }

    public void tirarMedia() {
        if (notas == null) {
            System.out.println("Esse aluno não possui notas.");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println("A média é " + media + " situação: aprovado");
        } else {
            System.out.println("A média é " + media + " situação: reprovado");
        }
    }

}

