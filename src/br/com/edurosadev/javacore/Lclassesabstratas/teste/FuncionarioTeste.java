package br.com.edurosadev.javacore.Lclassesabstratas.teste;

import br.com.edurosadev.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.edurosadev.javacore.Lclassesabstratas.classes.Gerente;
import br.com.edurosadev.javacore.Lclassesabstratas.classes.Vendedor;


public class FuncionarioTeste {
	public static void main(String[] args) {
		Vendedor v = new Vendedor("Camila", "19405-2", 1500, 30000);
		Gerente g = new Gerente("Jonas", "19101-2", 1900);
		v.calculaSalario();
		g.calculaSalario();
		System.out.println(v);
		System.out.println("    ----------------------------------------------");
		System.out.println(g);
	}
}
