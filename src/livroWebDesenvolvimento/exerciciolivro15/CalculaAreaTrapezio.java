package livroWebDesenvolvimento.exerciciolivro15;

public class CalculaAreaTrapezio {
    public static void main(String[] args) {
        int intArea1, intArea2, intBaseMenor, intBaseMaior;

        Trapezio objTrapezio1 = new Trapezio();
        intArea1 = objTrapezio1.Area();

        intBaseMenor = 3;
        intBaseMaior = 5;

        Trapezio objTrapezio2 = new Trapezio((intBaseMenor + intBaseMaior),4);
        intArea2 = objTrapezio2.Area();

        System.out.println("Area do trapezio 1 = " +intArea1+"m");
        System.out.println("Area do trapezio 2 = "+intArea2+"m");
    }
}
