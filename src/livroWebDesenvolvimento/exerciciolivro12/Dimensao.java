package livroWebDesenvolvimento.exerciciolivro12;

public class Dimensao {

    private int intBase, intAltura;

    public void Base (int intBase) {
        this.intBase = intBase;
    }

    public void Altura (int intAltura) {
        this.intAltura = intAltura;
    }

    public int Area() {
            return (intBase * intAltura);
        }
}
