package livroWebDesenvolvimento.exerciciolivro12;

public class AreaTriangulo {
    public static void main(String[] args) {
        int intArea;
        Dimensao Triangulo = new Dimensao();

        Triangulo.Base(6);
        Triangulo.Altura (3);
        intArea = Triangulo.Area() /2;

        System.out.println("Area do triangulo = " +intArea);
    }
}
