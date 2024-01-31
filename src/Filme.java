public class Filme {
        private String nome;
        private int anoLancamento;
        private double nota;
        private String tipoPlano;

        public Filme(String nome, int anoLancamento, double nota, String tipoPlano) {
            this.nome = nome;
            this.anoLancamento = anoLancamento;
            this.nota = nota;
            this.tipoPlano = tipoPlano;
        }

        public String getNome() {
            return nome;
        }

        public int getAnoLancamento() {
            return anoLancamento;
        }

        public double getNota() {
            return nota;
        }

        public String getTipoPlano() {
            return tipoPlano;
        }
    }

