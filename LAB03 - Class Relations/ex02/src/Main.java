public class Main {
    public static void main(String[] args) {
        int numLivros = 3;
        Livro[] livros = new Livro[numLivros];

        livros[0] = new Livro("Dama da Meia Noite","Casandra Claire", 2010);
        //System.out.println(livros[0].toString());
        livros[1] = new Livro("A menina que roubava livros","Markus Zusak", 2005);
        //System.out.println(livros[1].toString());
        livros[2] = new Livro("Uma breve história da humanidade","Stephen Hawking", 2005);
        //System.out.println(livros[2].toString());

        Biblioteca biblioteca = new Biblioteca("Letícia Câmara",livros, numLivros);

        System.out.println(biblioteca.toString());

    }
}