package livroWebDesenvolvimento.exerciciolivro15;



public class Quadrado extends CalculoArea {

    public Quadrado() {super(1,1);}

    public Quadrado(int intBase, int intAltura){
        super(intBase,intAltura);
    }

    public int Area(){
        int intArea;
        intArea = super.Area();
        return intArea;
    }
}
