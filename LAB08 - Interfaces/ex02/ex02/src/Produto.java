public class Produto implements Classificavel {
    private int codigo ;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int eMenorQue (Classificavel o) {
        Produto compara = ( Produto ) o;
        if ( this . codigo < compara . codigo ) {
            return 1 ;
        } else {
            return 0;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                '}';
    }
}

