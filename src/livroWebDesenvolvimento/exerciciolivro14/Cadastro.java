package livroWebDesenvolvimento.exerciciolivro14;

public class Cadastro {
    public static void main(String[] args) {
        java.util.Date dataCadastro = new java.util.Date();

        RegistroCliente cliente = new RegistroCliente("Rogerio", "Rua Santos Dumont, 1900",
                "Jd 14Bis", "Rio Claro", "SP", "00110-011",
                "11111-4444","123.123.234-09", dataCadastro );
        RegistroFornecedor fornecedor = new RegistroFornecedor("Auto-peças Sanches",
                "Rua hum de Maio", "Boa Esperança", "Sorocaba","SP"
                ,"12345-888","99999-8888","123.213.234-234",dataCadastro);


        System.out.println("Dados do Cliente");
        System.out.println("--------------------------");
        System.out.println("Nome: " +cliente.getNome());
        System.out.println("" +cliente.getEndereço());
        System.out.println(""+cliente.getBairro());
        System.out.println(""+cliente.getCidade());
        System.out.println(""+cliente.getEstado());
        System.out.println(""+cliente.getCpf());
        System.out.println("" +cliente.getDataCadastro());
        System.out.println("");
        System.out.println("Dados do Fornecedor");
        System.out.println("----------------------------");
        System.out.println(""+fornecedor.getNome());
        System.out.println(""+fornecedor.getEndereço());
        System.out.println(""+fornecedor.getBairro());
        System.out.println(""+fornecedor.getCidade());
        System.out.println(""+fornecedor.getEstado());
        System.out.println(""+fornecedor.getTelefone());
        System.out.println(""+fornecedor.getCnpj());
        System.out.println(""+fornecedor.getDataCadastro());

    }
}
