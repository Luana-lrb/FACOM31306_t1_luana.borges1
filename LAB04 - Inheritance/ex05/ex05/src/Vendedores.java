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

    @Override
    public String toString() {
        return "Vendedores{" +super.toString()+", "+
                "valorFixo=" + valorFixo +
                ", comissao=" + comissao +
                ", vendas=" + vendas +
                '}';
    }
}


