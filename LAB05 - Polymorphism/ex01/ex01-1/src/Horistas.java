public class Horistas extends Funcionario{
    private double horas;
    private double valorHora;

    public Horistas(String nome, String dataDeNasc, double horas, double valorHora) {
        super(nome, dataDeNasc, horas*valorHora);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        super.setSalario(horas*valorHora);
        return super.calcularSalario();
    }

    @Override
    public String toString() {
        return "Horistas{" + super.toString()+", "+
                "horas=" + horas +
                ", valorHora=" + valorHora +
                '}';
    }
}