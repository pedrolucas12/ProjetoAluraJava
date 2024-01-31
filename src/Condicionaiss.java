public class Condicionaiss {
    public static void main(String[] args) {
        int anoLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        String tipoPlano = "basico";

        if (anoLancamento < 2000) {
            System.out.println("Esse filme é antigo");
        } else {
            System.out.println("Esse filme é novo");
        }

        if ( incluidoNoPlano || tipoPlano.equals("premium") ) {
            System.out.println("Você pode assistir esse filme");
        } else {
            System.out.println("Você não pode assistir esse filme");
        }
    }
}
