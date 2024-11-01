public class CandidatoVereador {
    private String nomeCompleto;
    private String dataNasc;
    private String genero;
    private double totalDeBens;
    private boolean reeleicao;
    private int numPartiido;
    private String num3Digitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataNasc, String genero, double totalDeBens, boolean reeleicao, int numPartiido, String num3Digitos, String bairro) {
        this.nomeCompleto = nomeCompleto;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.totalDeBens = totalDeBens;
        this.reeleicao = reeleicao;
        this.numPartiido = numPartiido;
        this.num3Digitos = num3Digitos;
        this.bairro = bairro;
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

    public String getNum3Digitos() {
        return num3Digitos;
    }

    public void setNum3Digitos(String num3Digitos) {
        this.num3Digitos = num3Digitos;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "CandidatoVareador{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", genero='" + genero + '\'' +
                ", totalDeBens=" + totalDeBens +
                ", reeleicao=" + reeleicao +
                ", numPartiido=" + numPartiido +
                ", num3Digitos='" + num3Digitos + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
