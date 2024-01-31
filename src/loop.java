import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double avaliacao = 0.0;
        double totalAvaliacoes = 0.0;
        double media = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do filme: ");
            String nomeDoFilme = leitura.nextLine();
            System.out.println("Digite o ano de lançamento: ");
            int anoLancamento = leitura.nextInt();
            System.out.println("Digite a nota do filme: ");
            double notaDoFilme = leitura.nextDouble();
            System.out.println("Digite o tipo do seu plano: ");
            String tipoPlano = leitura.next();
            System.out.println("Filme : " + nomeDoFilme);
            System.out.println("Ano : " + anoLancamento);
            System.out.println("Nota : " + notaDoFilme);
            System.out.println("Plano : " + tipoPlano);


            while (avaliacao != 1) {
                System.out.println("Digite sua avaliacao para o filme: ");
                avaliacao = leitura.nextDouble();
                media = avaliacao;
                totalAvaliacoes += avaliacao;
            }

            System.out.println("Média: " + media / totalAvaliacoes);

        }

    }
}
