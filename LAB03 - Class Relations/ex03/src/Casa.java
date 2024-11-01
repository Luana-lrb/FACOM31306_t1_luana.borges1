import java.util.Arrays;

public class Casa {
    private int numero;
    private String endereco;
    private Comodo[] comodos;

    public Casa(int numero, String endereco, Comodo[] comodos) {
        this.numero = numero;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public int getNumero() {return numero;}

    public void setNumero(int numero) {this.numero = numero;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public Comodo[] getComodos() {return comodos;}

    public void setComodos(Comodo[] comodos) {this.comodos = comodos;}

    @Override
    public String toString() {
        return "Casa{" +
                "numero='" + numero + '\'' +
                ", endereco='" + endereco + '\'' +
                ", comodos=" + Arrays.toString(comodos) +
                '}';
    }
}
