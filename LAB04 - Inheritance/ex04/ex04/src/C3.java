public class C3 extends C2 {
    public String nacionalidade;
    protected String estadoCivil;
    private String corFavorita;

    public C3(){
        super();
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(String nome, int idade, String profissao, String religiao, int cra, String hobby, String nacionalidade, String estadoCivil, String corFavorita) {
        super(nome, idade, profissao, religiao, cra, hobby);
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.corFavorita = corFavorita;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

    public String mostrar_atributos(){
        return "C3{" +
                "nacionalidade='" + nacionalidade + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", corFavorita='" + corFavorita + '\'' +
                ", religiao='" + religiao + '\'' +
                ", cra=" + cra +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String mostar_atributos_super() {
        return  super.mostrar_atributos_super() + "C3{" +
                "nacionalidade='" + nacionalidade + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", corFavorita='" + corFavorita + '\'' +
                '}';
    }

}
