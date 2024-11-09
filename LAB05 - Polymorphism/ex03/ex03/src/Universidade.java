public class Universidade {
    private String nome;
    private String fundacao;
    private Estudante[] estudantes = new Estudante[100];

    public Universidade(String nome, String fundacao, Estudante[] estudantes) {
        this.nome = nome;
        this.fundacao = fundacao;
        this.estudantes = estudantes;
    }

    public void contaEstudantes(){
        int contGraduacao = 0, contDoutorado = 0, contMestrado = 0;
        for(Estudante iteracao: estudantes ){
            if(iteracao != null) {
                if (iteracao instanceof EstudanteGraduacao) contGraduacao++;
                if (iteracao instanceof EstudanteMestrado) contMestrado++;
                if (iteracao instanceof EstudanteDoutorado) contDoutorado++;
            }
        }
        System.out.println("A quantidade de graduandos é: " + contGraduacao );
        System.out.println("A quantidade de graduandos é: " + contMestrado );
        System.out.println("A quantidade de graduandos é: " + contDoutorado );

    }

    public void imprimeTudo(){
        for(Estudante iteracao: estudantes ){
            if(iteracao != null)
            iteracao.print();
        }
    }

    public void copiaPosGraduandos(EstudantePosGrad[] posGraduandos) {
        int i = 0;
        for (Estudante iteracao : estudantes) {
            if(iteracao != null) {
                if (iteracao instanceof EstudantePosGrad) {
                    posGraduandos[i] = (EstudantePosGrad) iteracao;
                    i++;
                }
            }
        }
        for(Estudante iteracao:  posGraduandos){
            if(iteracao != null) iteracao.print();
        }

    }
}
