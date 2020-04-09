package br.com.edurosadev.javacore.Emodificadorestatico.teste;


import br.com.edurosadev.javacore.Emodificadorestatico.classe.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo o número de parcelas");
//        for (int parcelas : c.getParcelas()){
//            System.out.print(parcelas + " ");
//        }
        System.out.println("Tamanho: " +Cliente.getParcelas().length);
        System.out.println("Tamanho: " +Cliente.getParcelas().length);
        System.out.println("Tamanho: " +Cliente.getParcelas().length);
    }
}
