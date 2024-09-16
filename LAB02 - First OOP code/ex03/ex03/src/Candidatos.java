public class Candidatos {
    String nome;
    String dataNasc;
    String genero;
    double bens;
    boolean reeleicao;
    int nmrPartido;
    String cargo;

    public Candidatos(String nome, String dataNasc, String genero, double bens, boolean reeleicao,
                      int nmrPartido, String cargo) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.nmrPartido = nmrPartido;
        this.cargo = cargo;
    }

}