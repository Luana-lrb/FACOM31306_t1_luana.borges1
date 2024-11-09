public class Amigos extends Contato{
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String imprimirContato(){
        return imprimirBasico() + "grau= " + grau + '}';
    }
}
