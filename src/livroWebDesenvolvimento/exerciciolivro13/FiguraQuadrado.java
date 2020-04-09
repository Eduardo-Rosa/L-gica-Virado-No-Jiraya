package livroWebDesenvolvimento.exerciciolivro13;

public class FiguraQuadrado {

    public static void main(String[] args) {

        int intArea;
        FiguraGeometrica Quadrado = new FiguraGeometrica("QUADRADO", 4,4);
        intArea = Quadrado.Area();

        System.out.println("Area do Quadrado = " +intArea);
    }
}
