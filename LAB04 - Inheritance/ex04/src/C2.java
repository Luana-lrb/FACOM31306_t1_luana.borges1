public class C2 extends C1 {
    public String religiao;
    protected int cra;
    private String hobby;

    public C2(){
        super();
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String nome, int idade, String profissao, String religiao, int cra, String hobby) {
        super(nome, idade, profissao);
        this.religiao = religiao;
        this.cra = cra;
        this.hobby = hobby;
        System.out.println("Classe C2: chamada do construtor com parametros");
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public int getCra() {
        return cra;
    }

    public void setCra(int cra) {
        this.cra = cra;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String mostrar_atributos(){
        return "C2{" +
                "religiao='" + religiao + '\'' +
                ", cra=" + cra +
                ", hobby='" + hobby + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String mostrar_atributos_super() {
        return super.mostrar_atributos() + "C2{" +
                "religiao='" + religiao + '\'' +
                ", cra=" + cra +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
