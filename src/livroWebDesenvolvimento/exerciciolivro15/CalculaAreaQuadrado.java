package livroWebDesenvolvimento.exerciciolivro15;

public class CalculaAreaQuadrado {
    public static void main(String[] args) {
        int intArea1, intArea2;

        Quadrado objQuadrado = new Quadrado(3,8);
        intArea1 = objQuadrado.Area();

        Quadrado objQuadrado2 = new Quadrado(6,6);
        intArea2 = objQuadrado2.Area();

        System.out.println("Area do quadrado 1 = " +intArea1+"m");
        System.out.println("Area do quadrado 2 = " +intArea2+"m");

    }
}
