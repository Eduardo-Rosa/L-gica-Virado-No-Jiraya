package br.com.edurosadev.javacore.exercicioaula.exaula46.classe;

public class Local {

    private String rua;
    private String bairro;
    private String cidade;

    public void print(){
        System.out.println("Rua: " +this.rua);
        System.out.println("Bairro: " +this.bairro);
        System.out.println("Cidade: " +this.cidade);
    }

    public Local(String rua, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Local() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
