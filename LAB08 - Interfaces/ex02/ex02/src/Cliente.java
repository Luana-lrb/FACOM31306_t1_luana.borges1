public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int eMenorQue (Classificavel o) {
        Cliente compara = ( Cliente ) o;
        if ( (nome).compareTo(compara.nome)==-1) {
            return 1 ;
        } else {
            return 0 ;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
