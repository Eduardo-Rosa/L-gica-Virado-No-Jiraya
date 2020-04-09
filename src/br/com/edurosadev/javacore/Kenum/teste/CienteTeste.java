package br.com.edurosadev.javacore.Kenum.teste;

import br.com.edurosadev.javacore.Kenum.classe.Cliente;
import br.com.edurosadev.javacore.Kenum.classe.TipoCliente;

public class CienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);

        Cliente cliente2 = new Cliente("iiii", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente2);
    }
}
