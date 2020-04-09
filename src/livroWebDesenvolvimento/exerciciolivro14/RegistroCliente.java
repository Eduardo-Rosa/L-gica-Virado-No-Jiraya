package livroWebDesenvolvimento.exerciciolivro14;

import java.text.SimpleDateFormat;


public class RegistroCliente extends DadosPessoais {

    private String cpf;
    private java.util.Date dataCadastro;

    public RegistroCliente (String nome,String endereço,
           String bairro,String cidade,String estado,
           String cep, String telefone,String cpf, java.util.Date dataCadastro){

        super(nome, endereço, bairro, cidade, estado, cep, telefone);
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataCadastro() {
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataCadastro);
        return data;
    }
}
