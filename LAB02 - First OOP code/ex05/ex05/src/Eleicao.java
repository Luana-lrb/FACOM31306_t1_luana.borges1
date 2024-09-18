public class Eleicao {
    private String municipio;
    private int numVotantes;
    private Candidatos[] politicos;
    private Candidatos vencedor;

    public Eleicao (String municipio, int numVotantes, Candidatos[] politicos,Candidatos vencedor){
        this.municipio = municipio;
        this.numVotantes = numVotantes;
        this.politicos = politicos;
        this.vencedor = vencedor;
    }

    public void mostrarDados(){
        System.out.print("Município :" + municipio + ", possui " + numVotantes +" votantes. Os candidatos são:");
        for(Candidatos valor: politicos ){
            valor.panfleto();System.out.print(", ");
        }
        System.out.print("O candidato vencedor é: ");
        vencedor.panfleto();
    }

}
