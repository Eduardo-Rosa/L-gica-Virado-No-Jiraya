package livroWebDesenvolvimento.exerciciolivro12;

public class AreaQuadrado {

    public static void main(String[] args) {

        int intArea;
        Dimensao Quadrado = new Dimensao();

        Quadrado.Base (4);
        Quadrado.Altura (4);
        intArea = Quadrado.Area();

        System.out.println("Area do quadrado = " +intArea);
    }
}
