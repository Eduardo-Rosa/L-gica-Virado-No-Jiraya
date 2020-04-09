package livroWebDesenvolvimento.exerciciolivro15;

public class CalculoArea {

    private int intBase, intAltura;

    public CalculoArea(int intBase,int intAltura){
        this.intBase = intBase;
        this.intAltura = intAltura;
    }

    public int Area(){
        int intArea;
        intArea = intBase * intAltura;
        return (intArea);
    }

}
