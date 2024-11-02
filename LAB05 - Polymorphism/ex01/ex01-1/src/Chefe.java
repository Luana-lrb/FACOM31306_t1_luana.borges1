public class Chefe extends Funcionario{
    private double salarioFixo;

    public Chefe(String nome, String dataDeNasc, double salarioFixo) {
        super(nome, dataDeNasc, salarioFixo);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }


    public double calcularSalario() {

        super.setSalario(salarioFixo);
        return super.calcularSalario();
    }

    @Override
    public String toString() {
        return "Chefe{" + super.toString()+", "+
                "salarioFixo=" + salarioFixo +
                '}';
    }
}