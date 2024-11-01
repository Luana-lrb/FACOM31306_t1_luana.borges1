import java.util.Arrays;

public class Biblioteca {
    private String nomeDaBiblioteca;
    private Livro[] livros;
    private int numLivros;

    public Biblioteca(String nomeDaBiblioteca, Livro[] livros, int numLivros) {
        this.nomeDaBiblioteca = nomeDaBiblioteca;
        this.livros = livros;
        this.numLivros = numLivros;
    }

    public String getNomeDaBiblioteca() {return nomeDaBiblioteca;}

    public void setNomeDaBiblioteca(String nomeDaBiblioteca) {this.nomeDaBiblioteca = nomeDaBiblioteca;}

    public Livro[] getLivros() {return livros;}

    public void setLivros(Livro[] livros) {this.livros = livros;}

    public int getNumLivros() {return numLivros;}

    public void setNumLivros(int numLivros) {this.numLivros = numLivros;}

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nomeDaBiblioteca='" + nomeDaBiblioteca + '\'' +
                ", livros=" + Arrays.toString(livros) +
                ", numLivros=" + numLivros +
                '}';
    }
}
