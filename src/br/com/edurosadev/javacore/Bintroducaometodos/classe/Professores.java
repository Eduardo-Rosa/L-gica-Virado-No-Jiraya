package br.com.edurosadev.javacore.Bintroducaometodos.classe;

/*Crie o seguintes atributos para essa classe
*Nome
* Matricula
* Rg
* Cpf
* Crie uma classe para preencher e imprimir os dados professor
 */
public class Professores {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprime() {
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);

    }
}