public class Candidatos {
    private String nome;
    private String dataNasc;
    private String genero;
    private String cargo;
    private double bens;
    private boolean reeleicao;
    private int nmrPartido;

    public Candidatos (){ // Construtor sem parâmetro
        this.nome = null;
        this.dataNasc = null;
        this.genero = null;
        this.bens = 0;
        this.reeleicao = false;
        this.nmrPartido = 0;
        this.cargo = null;
    }

    public Candidatos(String nome, String dataNasc, String genero,  double bens, boolean reeleicao,
                      int nmrPartido,  String cargo  ){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.nmrPartido = nmrPartido;
        this.cargo = cargo;
    }
    public void panfleto(){
        System.out.println(nome + ": nascido em " + dataNasc + ", " + genero + ". Possui " + bens +
                " reais. É candidato à reeleição? " + reeleicao + ". O número do partido é: " + nmrPartido +
                " e concorre a " + cargo + ".");
    }

}
