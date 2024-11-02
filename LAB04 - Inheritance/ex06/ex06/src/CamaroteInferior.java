public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "CamaroteInferior{" +
                "localizacao='" + localizacao + '\'' + "Informações do ingresso: " +
                super.toString() +
                '}';
    }
}
