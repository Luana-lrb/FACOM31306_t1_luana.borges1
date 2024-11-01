public class CandidatoPrefeito extends Candidato {
    private String nomeVice;
    private int numPartidoVice;

    public CandidatoPrefeito(String nomeCompleto, String dataNasc, String genero, double totalDeBens, boolean reeleicao, int numPartiido, String nomeVice, int numPartidoVice) {
        super(nomeCompleto, dataNasc, genero, totalDeBens, reeleicao, numPartiido);
        this.nomeVice = nomeVice;
        this.numPartidoVice = numPartidoVice;
    }

    public String getNomeVice() {
        return nomeVice;
    }

    public void setNomeVice(String nomeVice) {
        this.nomeVice = nomeVice;
    }

    public int getNumPartidoVice() {
        return numPartidoVice;
    }

    public void setNumPartidoVice(int numPartidoVice) {
        this.numPartidoVice = numPartidoVice;
    }

    @Override
    public String toString() {
        return "CandidatoPrefeito{" +
                "nomeVice='" + nomeVice + '\'' +
                ", numPartidoVice=" + numPartidoVice +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", genero='" + genero + '\'' +
                ", totalDeBens=" + totalDeBens +
                ", reeleicao=" + reeleicao +
                ", numPartiido=" + numPartiido +
                '}';
    }
}
