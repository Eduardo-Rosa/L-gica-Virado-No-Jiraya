package livroWebDesenvolvimento.exerciciolivro16;

import java.util.Date;
import java.text.SimpleDateFormat;

public class RegistroCliente  extends DadosPessoais{

    private String cpf;
    private java.util.Date dataCadastro;

    public RegistroCliente( String nome, String endereco, String bairro,
                            String cidade, String estado, String cep,
                            String telefone, String cpf, java.util.Date dataCadastro){
        super(nome, endereco, bairro, cidade, estado, cep, telefone);
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public String getCpf() {
        return cpf;
    }
    public String getDataCadastro(){
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataCadastro);
        return data;
    }
}
