public class C1 {
    public String nome;
    protected int idade;
    private String profissao;

    public C1() {
        super();
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public String mostrar_atributos() {
        return "C1{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';

    }

}
