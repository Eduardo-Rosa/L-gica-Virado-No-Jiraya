package livroWebDesenvolvimento.exerciciolivro14;

public class DadosPessoais {

    private String nome, endereço, bairro, cidade, estado,cep, telefone;

    public DadosPessoais(String nome,String endereço,String bairro,
                         String cidade,String estado,String cep, String telefone){

        this.nome = nome;
        this.endereço = endereço;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }
}


