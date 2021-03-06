package br.com.edurosadev.javacore.Dblocodeinicializacao.classe;

public class Cliente {
    /* 1- Bloco de inicialização estático é executado quando a JVM carregar a classe
    (é executado apenas uma vez)     */
    // 2- Alocado espaço na memória para o objeto que será criado.
    /* 3- Cada atributo de classe é criado e inicializado com seus valores
     default ou  valores explicitos.  */
    // 4- Bloco de inicialização é executado.
    // 5- O construtor é executado.

    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1 ; i <= 100 ; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
        }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
