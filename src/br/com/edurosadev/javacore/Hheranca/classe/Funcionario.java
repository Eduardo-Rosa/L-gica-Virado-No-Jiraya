package br.com.edurosadev.javacore.Hheranca.classe;

public class Funcionario extends Pessoa {
    private double salario;

    {
        System.out.println("Bloco de inicialização Funcionário 1");
    }

    {
        System.out.println("Bloco de inicialização Funcionário 2");
    }

    static {
        System.out.println("Bloco de inicialização static Funcionário 1");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionário");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
