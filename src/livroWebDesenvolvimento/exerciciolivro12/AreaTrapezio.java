package livroWebDesenvolvimento.exerciciolivro12;

public class AreaTrapezio {

    public static void main(String[] args) {

        int intArea, intBaseMenor, intBaseMaior;
        Dimensao Trapezio = new Dimensao();

        intBaseMenor = 3;
        intBaseMaior = 5;
        Trapezio.Base  (intBaseMenor + intBaseMaior);
        Trapezio.Altura(4);
        intArea = Trapezio.Area()/2;

        System.out.println("Area do trapezio = "+intArea);
    }
}
