package livroWebDesenvolvimento.exerciciolivro16;

import java.util.Date;

public class Cadastro {
    public static void main(String[] args) {
        java.util.Date dataCadastro = new java.util.Date();

        RegistroCliente cliente = new RegistroCliente("Ronaldo","Rua gogo 13", "Jd Nação",
                "Manhathan", "SP", "12121212121-21","1117878-7878","1232134-34", dataCadastro);

        RegistroFornecedor fornecedor = new RegistroFornecedor("Auto-slavinsky", "Av. pula mais um", "jd.Eunão",
                "sampaio", "GJ", "12342-234", "12315-4561", "12341242-123", dataCadastro);


        System.out.println("Dados do Cliente");
        System.out.println("-----------------------");
        System.out.println("Nome: " +cliente.getNome());
        System.out.println("Endereço: " +cliente.getEndereco());
        System.out.println("Bairro: " +cliente.getBairro());
        System.out.println("Cidade: " +cliente.getCidade());
        System.out.println("Estado: " +cliente.getEstado());
        System.out.println("CEP: " +cliente.getCep());
        System.out.println("Telefone: " +cliente.getTelefone());
        System.out.println("CPF: "+cliente.getCpf());
        System.out.println("Cliente cadastrado em: " +cliente.getDataCadastro());

        System.out.println(" ");
        System.out.println("Dados do Fornecedor");
        System.out.println("-----------------------");
        System.out.println("Razão Social: " +fornecedor.getNome());
        System.out.println("Endereço: " +fornecedor.getEndereco());
        System.out.println("Bairro: " +fornecedor.getBairro());
        System.out.println("Cidade: " +fornecedor.getCidade());
        System.out.println("Estado: " +fornecedor.getEstado());
        System.out.println("CEP: " +fornecedor.getCep());
        System.out.println("Telefone: " +fornecedor.getTelefone());
        System.out.println("CNPJ: " +fornecedor.getCnpj());
        System.out.println("Fornecedor cadastrado em: " +fornecedor.getDataCadastro());
    }
}
