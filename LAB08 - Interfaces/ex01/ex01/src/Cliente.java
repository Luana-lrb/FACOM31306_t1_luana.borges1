public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue (Classificavel o) {
        Cliente compara = ( Cliente ) o;
        if ( (nome).compareTo(compara.nome)==-1) {
            return true ;
        } else {
            return false ;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
