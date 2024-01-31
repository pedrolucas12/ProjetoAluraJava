import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        String nomeDoFilme = scanner.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = scanner.nextInt();

        System.out.println("Digite a nota do filme: ");
        double notaDoFilme = scanner.nextDouble();

        System.out.println("Digite o tipo do seu plano: ");
        String tipoPlano = scanner.next();

        System.out.println("Filme : " + nomeDoFilme);
        System.out.println("Ano : " + anoLancamento);
        System.out.println("Nota : " + notaDoFilme);
        System.out.println("Plano : " + tipoPlano);

    }
}
