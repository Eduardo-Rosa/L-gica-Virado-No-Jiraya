package livroWebDesenvolvimento.exerciciolivro16;

import java.util.Date;
import java.text.SimpleDateFormat;

public class RegistroFornecedor extends DadosPessoais {
    private String cnpj;
    private java.util.Date dataCadastro;

    public RegistroFornecedor(String nome, String endereco, String bairro, String cidade,
                              String estado, String cep, String telefone, String cnpj, java.util.Date dataCadastro) {

        super(nome, endereco, bairro, cidade, estado, cep, telefone);
        this.cnpj = cnpj;
        this.dataCadastro = dataCadastro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getDataCadastro() {
        String data = new SimpleDateFormat("dd / MM / yyyy").format(dataCadastro);
        return data;
    }
}
