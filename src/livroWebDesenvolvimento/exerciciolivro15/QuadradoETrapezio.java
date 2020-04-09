package livroWebDesenvolvimento.exerciciolivro15;

public class QuadradoETrapezio {
    public static void main(String[] args) {
        int intArea, intBaseMenor,intBaseMaior;
        Quadrado objQuadrado = new Quadrado();
        intArea = objQuadrado.Area();

        System.out.println(" Area do quadrado é " +intArea);
        intBaseMenor =7;
        intBaseMaior = 10;

        Trapezio objTrapezio = new Trapezio((intBaseMenor + intBaseMaior) ,4);
        intArea = objTrapezio.Area();

        System.out.println("Area do trapezio = "+intArea);
    }
}
