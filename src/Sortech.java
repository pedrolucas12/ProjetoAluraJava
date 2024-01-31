import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sortech{

    public static void main(String[] args) {
        int opcao = 0;

        List<Cliente> listaClientes = new ArrayList<>();
        List<Produto> listaProdutos = new ArrayList<>();

        String menu = """
                -----------------------
                Bem vindo ao Comex
                -----------------------
                1 - Cadastrar Cliente
                2 - Cadastrar Produto
                3 - Listar Clientes
                4 - Listar Produtos
                5 - Sair
                -----------------------
                """;

        while (opcao != 5) {
            System.out.println(menu);
            Scanner scanner0 = new Scanner(System.in);
            opcao = scanner0.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastro de Cliente");
                System.out.println("------------------");
                System.out.println("Digite o nome do cliente: ");
                Scanner scanner = new Scanner(System.in);
                String nomeDoCliente = scanner.nextLine();

                System.out.println("Digite o CPF do cliente: ");
                String cpfCliente = scanner.next();

                System.out.println("------------------");

                Cliente cliente = new Cliente(nomeDoCliente, cpfCliente);
                listaClientes.add(cliente);

                System.out.println("Cliente: " + nomeDoCliente);
                System.out.println("CPF: " + cpfCliente);

            } else if (opcao == 2) {
                System.out.println("Cadastro de Produto");
                System.out.println("------------------");
                System.out.println("Digite o nome do produto: ");
                Scanner scanner = new Scanner(System.in);
                String nomeDoProduto = scanner.nextLine();

                System.out.println("Digite o preço do produto: ");
                double precoProduto = scanner.nextDouble();

                System.out.println("------------------");

                Produto produto = new Produto(nomeDoProduto, precoProduto);
                listaProdutos.add(produto);

                System.out.println("Produto: " + nomeDoProduto);
                System.out.println("Preço: " + precoProduto);

            } else if (opcao == 3) {
                System.out.println("Listar Clientes");
                System.out.println("------------------");

                for (Cliente cliente : listaClientes) {
                    System.out.println("Cliente: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                }

            } else if (opcao == 4) {
                System.out.println("Listar Produtos");
                System.out.println("------------------");

                for (Produto produto : listaProdutos) {
                    System.out.println("Produto: " + produto.getNome());
                    System.out.println("Preço: " + produto.getPreco());
                }

            } else if (opcao == 5) {
                System.out.println("Sair");
            }
        }
    }
}