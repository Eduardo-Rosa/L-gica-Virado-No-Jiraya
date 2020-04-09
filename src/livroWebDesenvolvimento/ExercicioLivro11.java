package livroWebDesenvolvimento;

public class ExercicioLivro11 {
    private static void Moldura_Texto(String strTexto) {
        int intTamanho, intContador;
        intTamanho = strTexto.length() + 4;

        for (intContador = 1; intContador <= intTamanho; intContador++)
            System.out.print("-");

        System.out.println(" ");
        System.out.println("|" + strTexto + "|");

        for (intContador = 1; intContador <= intTamanho; intContador++)
            System.out.print("-");
    }

    public static void main(String[] args) {
        Moldura_Texto("JAVA - Uma Linguagem Moderna! ");
    }
}
