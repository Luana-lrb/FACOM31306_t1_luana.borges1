public class Operarios extends Funcionario{
    private double vProducao;
    private double qProduzida;

    public Operarios(String nome, String dataDeNasc, double vProducao, double qProduzida) {
        super(nome, dataDeNasc, vProducao*qProduzida);
        this.vProducao = vProducao;
        this.qProduzida = qProduzida;
    }

    public double getvProducao() {
        return vProducao;
    }

    public void setvProducao(double vProducao) {
        this.vProducao = vProducao;
    }

    public double getqProduzida() {
        return qProduzida;
    }

    public void setqProduzida(double qProduzida) {
        this.qProduzida = qProduzida;
    }


    public void calcularSalario() {
        super.setSalario(vProducao*qProduzida);
    }

    @Override
    public String toString() {
        return "Operarios{" +super.toString()+", "+
                "vProducao=" + vProducao +
                ", qProduzida=" + qProduzida +
                '}';
    }
}
