public class Ingresso {
    private double valor;

    public Ingresso() {
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void escreveValor(double valor){ // É o mesmo que o setValor
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                '}';
    }
}
