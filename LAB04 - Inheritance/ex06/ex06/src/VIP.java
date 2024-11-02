public class VIP extends Ingresso{
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double retornaValor(){
        return super.getValor() + valorAdicional;
    }

    @Override
    public String toString() {
        return super.toString() + " VIP{" +
                "valorAdicional=" + valorAdicional +
                '}';
    }
}
