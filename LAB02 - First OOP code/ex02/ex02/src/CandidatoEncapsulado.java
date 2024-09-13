public class CandidatoEncapsulado {
    private String nome;
    private String dataNasc;
    private String genero;
    private String cargo;
    private double bens;
    private boolean reeleicao;
    private int nmrPartido;


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setBens(double bens) {
         this.bens = bens;
    }
    public void setReeleicao(boolean reeleicao){
        this.reeleicao = reeleicao;
    }
    public void setNmrPartido(int nmrPartido) {
        this.nmrPartido = nmrPartido;
    }

    public String getNome(String nome) {
        return nome;
    }
    public String getDataNasc(String dataNasc) {
        return dataNasc;
    }
    public String getGenero(String genero){
        return genero;
    }
    public String getCargo(String cargo) {
        return cargo;
    }
    public double getBens(double bens) {
        return bens;
    }
    public boolean getReeleicao(boolean reeleicao){
        return reeleicao;
    }
    public int getNmrPartido(int nmrPartido) {
        return nmrPartido;
    }

    public void panfleto(){
        System.out.println(nome + ": nascido em " + dataNasc + ", " + genero + ". Possui " + bens +
                " reais. É candidato à reeleição? " + reeleicao + ". O número do partido é: " + nmrPartido +
                " e concorre a " + cargo + ".");
    }

}
