public class Paciente {
    private String nome;
    private int idade;
    private String doenca;

    public Paciente(String nome, int idade, String doenca) {
        this.nome = nome;
        this.idade = idade;
        this.doenca = doenca;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public String getDoenca() {return doenca;}

    public void setDoenca(String doenca) {this.doenca = doenca;}

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", doenca='" + doenca + '\'' +
                '}';
    }
}

