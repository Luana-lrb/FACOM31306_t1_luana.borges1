public class Vendedores extends Funcionario{
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedores(String nome, String dataDeNasc, double valorFixo, double comissao, double vendas) {
        super(nome, dataDeNasc, valorFixo+comissao*vendas);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public void calcularSalario() {
        super.setSalario(valorFixo+comissao*vendas);
    }

    @Override
    public String toString() {
        return "Vendedores{" +super.toString()+", "+
                "valorFixo=" + valorFixo +
                ", comissao=" + comissao +
                ", vendas=" + vendas +
                '}';
    }
}

