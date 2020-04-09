package livroWebDesenvolvimento.exerciciolivro15;

public class Trapezio extends CalculoArea {

    public Trapezio(){
        super(1,1);
    }
    public Trapezio(int intBase, int intAltura) {
        super(intBase, intAltura);
    }

    public int Area() {

        int intArea = super.Area() / 2;
        return intArea;
    }
}
