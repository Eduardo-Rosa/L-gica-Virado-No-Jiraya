package br.com.edurosadev.javacore.exercicioaula.exaula46.classe;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("-------------Relat�rio Semin�rio------------");
        System.out.println("T�tulo: " +this.titulo);

        if (this.professor != null)
            System.out.println("Professor Palestrante " +this.professor.getNome());
        else System.out.println("Nenhum Professor cadastrado para este semin�rio");

        if (this.local != null)
        System.out.println("Local: \n rua " +this.local.getRua()+ " Bairro: "
                +this.local.getBairro()+" Cidade "+this.local.getCidade());
        else
            System.out.println("Nenhum Local Cadastrodo para o Semin�rio");

        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos Participantes ");
            System.out.println("---------------------");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
