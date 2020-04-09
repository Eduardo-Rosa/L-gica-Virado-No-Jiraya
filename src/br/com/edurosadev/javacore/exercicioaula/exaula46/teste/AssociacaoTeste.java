package br.com.edurosadev.javacore.exercicioaula.exaula46.teste;

import br.com.edurosadev.javacore.exercicioaula.exaula46.classe.Aluno;
import br.com.edurosadev.javacore.exercicioaula.exaula46.classe.Professor;
import br.com.edurosadev.javacore.exercicioaula.exaula46.classe.Seminario;
import br.com.edurosadev.javacore.exercicioaula.exaula46.classe.Local;

public class AssociacaoTeste {
    public static void main(String[] args) {
    	
        Aluno aluno = new Aluno("Eduardo Rosa", 37);
        Aluno aluno1 = new Aluno("Joelma", 25);

        Seminario sem = new Seminario("Como ser um programador de sucesso");
        Professor prof = new Professor("Suellen Rosa", "Natação");
        Local local = new Local("Rua de tres", "Mato","São Paulo");
        
        aluno.setSeminario(sem);
        aluno1.setSeminario(sem);
       

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno,aluno1});

        aluno.print();
        aluno1.print();
        
        
        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();


    }
}
