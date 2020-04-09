package br.com.edurosadev.javacore.Csobrecargametodos.teste;

import br.com.edurosadev.javacore.Csobrecargametodos.classe.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Willian");
        funcionario.init("João", "111.222.333-04", 4500, "13.123.234-4");
        funcionario.imprime();

        funcionario.init("Carlos","222.444.666-88",3890,"2.345.566-6");

        funcionario.imprimeDois();

        funcionario.init("Guto","222.999.666-88",2890,"2.345.566-6");

        funcionario.imprimeTres();
    }
}
