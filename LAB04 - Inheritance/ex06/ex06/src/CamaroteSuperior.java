public class CamaroteSuperior extends VIP{
    private double valorAdcionalCamarote;
    private String localizacao;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdcionalCamarote, String localizacao) {
        super(valor, valorAdicional);
        this.valorAdcionalCamarote = valorAdcionalCamarote;
        this.localizacao = localizacao;
    }

    public double getValorAdcionalCamarote() {
        return valorAdcionalCamarote;
    }

    public void setValorAdcionalCamarote(double valorAdcionalCamarote) {
        this.valorAdcionalCamarote = valorAdcionalCamarote;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "CamaroteSuperior{" +
                "valorAdcionalCamarote=" + valorAdcionalCamarote +
                ", localizacao='" + localizacao + " Informação do Ingresso: "+ super.toString()+ '\'' +
                '}';
    }
}
