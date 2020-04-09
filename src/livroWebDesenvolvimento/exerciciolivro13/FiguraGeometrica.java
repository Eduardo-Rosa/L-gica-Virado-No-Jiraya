package livroWebDesenvolvimento.exerciciolivro13;

public class FiguraGeometrica {
    private int intBase, intAltura;
    private String strTipoObjeto;

    public FiguraGeometrica(String strTipoObjeto, int intBase, int intAltura){

        this.strTipoObjeto = strTipoObjeto;
        this.intBase = intBase;
        this.intAltura = intAltura;
    }

    public int Area(){
        int intArea;
        intArea = intBase * intAltura;

        if ((strTipoObjeto == "TRAPEZIO") || (strTipoObjeto == "TRIANGULO"))
            intArea = intArea /2;
        return (intArea);
    }
}
