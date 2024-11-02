public class Funcionario {
    private String nome;
    private String dataDeNasc;
    private double salario;

    public Funcionario(String nome, String dataDeNasc, double salario) {
        this.nome = nome;
        this.dataDeNasc = dataDeNasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(String dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public double calcularSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", dataDeNasc='" + dataDeNasc + '\'' +
                ", salario=" + salario ;
    }
}