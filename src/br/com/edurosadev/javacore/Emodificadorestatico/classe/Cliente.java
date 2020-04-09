package br.com.edurosadev.javacore.Emodificadorestatico.classe;

public class Cliente {
    /* 1- Bloco de inicialização estático é executado quando a JVM carregar a classe
    (é executado apenas uma vez)     */
    // 2- Alocado espaço na memória para o objeto que será criado.
    /* 3- Cada atributo de classe é criado e inicializado com seus valores
     default ou  valores explicitos.  */
    // 4- Bloco de inicialização é executado.
    // 5- O construtor é executado.

    private static int[] parcelas;
    static{
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1 ; i <= 100 ; i++) {
            parcelas[i-1] = i;
        }
    }
    static{
        System.out.println("Bloco estático 2");
    }

    static {
        System.out.println("Bloco estático 3");
    }

    public Cliente(){
        }

    public static int[] getParcelas() {
        return parcelas;
    }
}
