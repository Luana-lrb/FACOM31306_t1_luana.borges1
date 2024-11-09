public class Funcionario {
    private String cfp;
    private String nome;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String cfp, String nome, double salario) {
        this.cfp = cfp;
        this.nome = nome;
        this.salario = salario;
        this.tetoSalarial = 40000;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public void aumentarSalario(double percentual){
        double testeSalario = this.salario + (this.salario * percentual);
        if(testeSalario < 0 ) throw new Excecao("Valor inválido de salario!");
        if(testeSalario > this.tetoSalarial) throw new Excecao("Valor ultrapassa o teto!");
        this.salario += testeSalario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cfp='" + cfp + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", tetoSalarial=" + tetoSalarial +
                '}';
    }
}
