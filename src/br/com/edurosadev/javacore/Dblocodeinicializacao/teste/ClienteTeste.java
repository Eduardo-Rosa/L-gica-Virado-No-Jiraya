package br.com.edurosadev.javacore.Dblocodeinicializacao.teste;

import br.com.edurosadev.javacore.Dblocodeinicializacao.classe.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo o número de parcelas");
        for (int parcelas : c.getParcelas()){
            System.out.print(parcelas + " ");
        }
    }
}
