package br.com.edurosadev.javacore.exercicioaula.exaula46.classe;

/*Crie um sistema que gerencie semi�rios
 * Dever� cadastrar semin�rios,cadastrar alunos, cadastrar professores e cadastrar local
 * Um Aluno poderá estar em apenas um seminário
 * Um seminário poderá ter um ou vários alunos
 * Um professor poderá ministrar um ou vários seminários
 * Um seminário só poderá ter um professor
 * Um seminário deverá ter um local.
 * Seminário: Titulo.
 * Aluno: Nome, Idade.
 * Professor: Nome , Especialidade.
 * Local: Rua, Bairro.
 * */

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {

        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void print(){

        System.out.println("Nome: " +this.nome);
        System.out.println("Especialidade: " +this.especialidade);
        if(seminarios != null && seminarios.length != 0){
        System.out.println("Semin�rio participantes ");
            for (Seminario sem: seminarios){
                System.out.print(sem.getTitulo()+ " ");
            }
            return;
        }
        System.out.println("Professor n�o vinculado a nenhum semin�rio");

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
