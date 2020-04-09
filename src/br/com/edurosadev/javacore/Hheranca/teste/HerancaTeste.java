package br.com.edurosadev.javacore.Hheranca.teste;

import br.com.edurosadev.javacore.Hheranca.classe.Endereco;
import br.com.edurosadev.javacore.Hheranca.classe.Funcionario;
import br.com.edurosadev.javacore.Hheranca.classe.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Augusto");
        Endereco end = new Endereco();
        p.setNome("Maria");
        p.setCpf("321.456.546-44");
        end.setBairro("Bairro-1");
        end.setRua("Rua-2");
        p.setEndereco(end);
       // p.imprime();
        System.out.println("------------------------------");
        Funcionario f = new Funcionario("Gina");
        f.setNome("Augusto");
        f.setCpf("321.545.456-12");
        f.setSalario(12355);
        f.setEndereco(end);
        //f.imprime();

    }
}
