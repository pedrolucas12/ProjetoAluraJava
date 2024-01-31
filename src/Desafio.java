import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        int opcao = 0;

        List<Filme> listaFilmes = new ArrayList<>();

        String menu = """
                ------------------
                1 - Cadastrar Filme
                2 - Listar Filmes
                3 - Sair
                ------------------
                """;


        while (opcao != 3) {
            System.out.println(menu);
            Scanner scanner0 = new Scanner(System.in);
            opcao = scanner0.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastro de Filmes");
                System.out.println("------------------");
                System.out.println("Digite o nome do filme: ");
                Scanner scanner = new Scanner(System.in);
                String nomeDoFilme = scanner.nextLine();

                System.out.println("Digite o ano de lançamento: ");
                Scanner scanner2 = new Scanner(System.in);
                int anoLancamento = scanner2.nextInt();

                System.out.println("Digite a nota do filme: ");
                Scanner scanner3 = new Scanner(System.in);
                double notaDoFilme = scanner3.nextDouble();

                System.out.println("Digite o tipo do seu plano: ");
                Scanner scanner4 = new Scanner(System.in);
                String tipoPlano = scanner4.next();
                System.out.println("------------------");

                Filme filme = new Filme(nomeDoFilme, anoLancamento, notaDoFilme, tipoPlano);
                listaFilmes.add(filme);

                System.out.println("Filme : " + nomeDoFilme);
                System.out.println("Ano : " + anoLancamento);
                System.out.println("Nota : " + notaDoFilme);
                System.out.println("Plano : " + tipoPlano);

            } else if (opcao == 2) {
                System.out.println("Listar Filmes");
                System.out.println("------------------");

                for (Filme filme : listaFilmes) {
                    System.out.println("Filme: " + filme.getNome());
                    System.out.println("Ano: " + filme.getAnoLancamento());
                    System.out.println("Nota: " + filme.getNota());
                    System.out.println("Plano: " + filme.getTipoPlano());
                }

            }else if (opcao == 3) {
                System.out.println("Sair");
            }
        }

    }
}
