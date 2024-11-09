public class Servico implements Classificavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    public int eMenorQue (Classificavel o) {
        Servico compara = ( Servico ) o;
        if ( this.preco < compara.preco ) {
            return 1 ;
        } else {
            return 0 ;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "preco=" + preco +
                '}';
    }
}
