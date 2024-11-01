public class CandidatoPrefeito {
    private String nomeCompleto;
    private String dataNasc;
    private String genero;
    private double totalDeBens;
    private boolean reeleicao;
    private int numPartiido;
    private String nomeVice;
    private int numPartidoVice;

    public CandidatoPrefeito(String nomeCompleto, String dataNasc, String genero, double totalDeBens, boolean reeleicao, int numPartiido, String nomeVice, int numPartidoVice) {
        this.nomeCompleto = nomeCompleto;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.totalDeBens = totalDeBens;
        this.reeleicao = reeleicao;
        this.numPartiido = numPartiido;
        this.nomeVice = nomeVice;
        this.numPartidoVice = numPartidoVice;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getTotalDeBens() {
        return totalDeBens;
    }

    public void setTotalDeBens(double totalDeBens) {
        this.totalDeBens = totalDeBens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public int getNumPartiido() {
        return numPartiido;
    }

    public void setNumPartiido(int numPartiido) {
        this.numPartiido = numPartiido;
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
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", genero='" + genero + '\'' +
                ", totalDeBens=" + totalDeBens +
                ", reeleicao=" + reeleicao +
                ", numPartiido=" + numPartiido +
                ", nomeVice='" + nomeVice + '\'' +
                ", numPartidoVice='" + numPartidoVice + '\'' +
                '}';
    }
}
