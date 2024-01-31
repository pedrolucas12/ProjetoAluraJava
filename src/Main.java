//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Sscreen Match");
        System.out.println("Filme: Top Gun");

        int ano = 2022;
        System.out.println("Ano : " + ano);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;

        double media = ( 8.5 + 7.5 + 9.0 ) / 3;
        System.out.println("Média: " + media);

        String sinopse;
        sinopse = """
            Pilotos da Marinha competem para serem os melhores em sua classe,
            com um ousado estudante piloto na escola de elite de caças da Marinha.
            """;

        System.out.println("Sinopse: " + sinopse);

        int classificacaoEtaria = (int) (media / 2);
        System.out.println("Classificação Etária: " + classificacaoEtaria);
    }
}