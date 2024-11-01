public class CandidatoVereador extends Candidato {
    private String num3Digitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataNasc, String genero, double totalDeBens, boolean reeleicao, int numPartiido, String num3Digitos, String bairro) {
        super(nomeCompleto, dataNasc, genero, totalDeBens, reeleicao, numPartiido);
        this.num3Digitos = num3Digitos;
        this.bairro = bairro;
    }

    public CandidatoVereador(Candidato c, String  num3Digitos, String bairro) {
        super(c.getNomeCompleto(), c.getDataNasc(), c.getGenero(), c.getTotalDeBens(), c.isReeleicao(), c.getNumPartiido());
        this.num3Digitos = num3Digitos;
        this.bairro = bairro;

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
        return super.toString() + " CandidatoVereador{" +
                "num3Digitos='" + num3Digitos + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
