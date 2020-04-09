package livroWebDesenvolvimento;

public class ExercicioLivro08DoWhile {
    public static void main(String[] args) {
        int intContador;
        intContador = 1;

        do {
            System.out.println(intContador+" X 7 = " +(intContador*7));
            intContador++;
        }while (intContador <= 10);
        System.out.println("Fim da execução");
    }
}
