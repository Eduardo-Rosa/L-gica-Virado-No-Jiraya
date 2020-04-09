package br.com.edurosadev.javacore.Emodificadorestatico.teste;

import br.com.edurosadev.javacore.Emodificadorestatico.classe.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro c1 = new Carro("BMW ", 280);
        Carro c2 = new Carro("Audi ", 275);
        Carro c3 = new Carro("Mercedes ", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
